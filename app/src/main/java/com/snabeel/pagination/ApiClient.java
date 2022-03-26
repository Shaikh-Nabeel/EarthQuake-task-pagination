package com.snabeel.pagination;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiClient {

    @GET("/fdsnws/event/1/query?format=geojson")
    Call<ResponseEarthquake> getEarthquakeData(@Query("offset") int offset,
                                               @Query("limit") int limit);
}
