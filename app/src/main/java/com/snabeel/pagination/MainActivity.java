package com.snabeel.pagination;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;

import com.snabeel.pagination.databinding.ActivityMainBinding;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    Adapter adapter;
    static int offset = 1;
    static int limit = 15;
    ArrayList<FeaturesItem> list = new ArrayList<>();
    LinearLayoutManager llm;
    static boolean isScrolling = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        adapter = new Adapter(list);
        llm = new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(llm);
        binding.recyclerView.setAdapter(adapter);

        binding.recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if(newState == AbsListView.OnScrollListener.SCROLL_STATE_TOUCH_SCROLL){
                    isScrolling = true;
                }
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                int currentItem = llm.getChildCount();
                int totalItem = llm.getItemCount();
                int scrollOutItem = llm.findFirstVisibleItemPosition();
                if(isScrolling && (currentItem+scrollOutItem == totalItem)){
                    isScrolling = false;
                    offset += 16;
                    fetchData(offset, limit);
                }
            }
        });

        fetchData(offset,limit);
    }

    private void fetchData(int offset, int limit) {
        binding.progressBar.setVisibility(View.VISIBLE);
        ApiClient api = RetrofitSingleton.getInstance().create(ApiClient.class);
        api.getEarthquakeData(offset,limit).enqueue(new Callback<ResponseEarthquake>() {
            @Override
            public void onResponse(Call<ResponseEarthquake> call, Response<ResponseEarthquake> response) {
                Log.d("ResponseOfApi", response.toString());
                binding.progressBar.setVisibility(View.GONE);
                if(response.code() == 200 && response.body() != null){
                    ResponseEarthquake responseEarthquake = response.body();
                    adapter.updateList((ArrayList)responseEarthquake.getFeatures());
                }
            }

            @Override
            public void onFailure(Call<ResponseEarthquake> call, Throwable t) {
                binding.progressBar.setVisibility(View.GONE);
                t.printStackTrace();
                Log.d("ResponseOfApi", "Failed to load data");
            }
        });
    }
}