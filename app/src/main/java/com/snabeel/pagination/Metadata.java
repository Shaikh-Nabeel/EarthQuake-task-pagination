package com.snabeel.pagination;

import com.google.gson.annotations.SerializedName;

public class Metadata{

	@SerializedName("offset")
	private int offset;

	@SerializedName("generated")
	private long generated;

	@SerializedName("limit")
	private int limit;

	@SerializedName("count")
	private int count;

	@SerializedName("api")
	private String api;

	@SerializedName("title")
	private String title;

	@SerializedName("url")
	private String url;

	@SerializedName("status")
	private int status;

	public int getOffset(){
		return offset;
	}

	public long getGenerated(){
		return generated;
	}

	public int getLimit(){
		return limit;
	}

	public int getCount(){
		return count;
	}

	public String getApi(){
		return api;
	}

	public String getTitle(){
		return title;
	}

	public String getUrl(){
		return url;
	}

	public int getStatus(){
		return status;
	}
}