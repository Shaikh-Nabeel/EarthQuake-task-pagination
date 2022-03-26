package com.snabeel.pagination;

import com.google.gson.annotations.SerializedName;

public class Properties{

	@SerializedName("dmin")
	private double dmin;

	@SerializedName("code")
	private String code;

	@SerializedName("sources")
	private String sources;

	@SerializedName("tz")
	private Object tz;

	@SerializedName("mmi")
	private Object mmi;

	@SerializedName("type")
	private String type;

	@SerializedName("title")
	private String title;

	@SerializedName("magType")
	private String magType;

	@SerializedName("nst")
	private float nst;

	@SerializedName("sig")
	private float sig;

	@SerializedName("tsunami")
	private float tsunami;

	@SerializedName("mag")
	private double mag;

	@SerializedName("alert")
	private Object alert;

	@SerializedName("gap")
	private float gap;

	@SerializedName("rms")
	private double rms;

	@SerializedName("place")
	private String place;

	@SerializedName("net")
	private String net;

	@SerializedName("types")
	private String types;

	@SerializedName("felt")
	private Object felt;

	@SerializedName("cdi")
	private Object cdi;

	@SerializedName("url")
	private String url;

	@SerializedName("ids")
	private String ids;

	@SerializedName("time")
	private long time;

	@SerializedName("detail")
	private String detail;

	@SerializedName("updated")
	private long updated;

	@SerializedName("status")
	private String status;

	public double getDmin(){
		return dmin;
	}

	public String getCode(){
		return code;
	}

	public String getSources(){
		return sources;
	}

	public Object getTz(){
		return tz;
	}

	public Object getMmi(){
		return mmi;
	}

	public String getType(){
		return type;
	}

	public String getTitle(){
		return title;
	}

	public String getMagType(){
		return magType;
	}

	public float getNst(){
		return nst;
	}

	public float getSig(){
		return sig;
	}

	public float getTsunami(){
		return tsunami;
	}

	public double getMag(){
		return mag;
	}

	public Object getAlert(){
		return alert;
	}

	public float getGap(){
		return gap;
	}

	public double getRms(){
		return rms;
	}

	public String getPlace(){
		return place;
	}

	public String getNet(){
		return net;
	}

	public String getTypes(){
		return types;
	}

	public Object getFelt(){
		return felt;
	}

	public Object getCdi(){
		return cdi;
	}

	public String getUrl(){
		return url;
	}

	public String getIds(){
		return ids;
	}

	public long getTime(){
		return time;
	}

	public String getDetail(){
		return detail;
	}

	public long getUpdated(){
		return updated;
	}

	public String getStatus(){
		return status;
	}
}