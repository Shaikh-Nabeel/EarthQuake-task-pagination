package com.snabeel.pagination;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseEarthquake{

	@SerializedName("features")
	private List<FeaturesItem> features;

	@SerializedName("metadata")
	private Metadata metadata;

	@SerializedName("bbox")
	private List<Double> bbox;

	@SerializedName("type")
	private String type;

	public List<FeaturesItem> getFeatures(){
		return features;
	}

	public Metadata getMetadata(){
		return metadata;
	}

	public List<Double> getBbox(){
		return bbox;
	}

	public String getType(){
		return type;
	}
}