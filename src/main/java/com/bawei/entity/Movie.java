package com.bawei.entity;

public class Movie {
	
	private Integer mid;
	private String  mname;
	private String  mactor;
	private Double  mprice;
	private String  muptime;
	private Integer mtime;
	private String mtype;
	private String  myear;
	private String  marea;
	private Integer mstatus;
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMactor() {
		return mactor;
	}
	public void setMactor(String mactor) {
		this.mactor = mactor;
	}
	public Double getMprice() {
		return mprice;
	}
	public void setMprice(Double mprice) {
		this.mprice = mprice;
	}
	public String getMuptime() {
		return muptime;
	}
	public void setMuptime(String muptime) {
		this.muptime = muptime;
	}
	public Integer getMtime() {
		return mtime;
	}
	public void setMtime(Integer mtime) {
		this.mtime = mtime;
	}
	public String getMtype() {
		return mtype;
	}
	public void setMtype(String mtype) {
		this.mtype = mtype;
	}
	public String getMyear() {
		return myear;
	}
	public void setMyear(String myear) {
		this.myear = myear;
	}
	public String getMarea() {
		return marea;
	}
	public void setMarea(String marea) {
		this.marea = marea;
	}
	public Integer getMstatus() {
		return mstatus;
	}
	public void setMstatus(Integer mstatus) {
		this.mstatus = mstatus;
	}
	public Movie(Integer mid, String mname, String mactor, Double mprice, String muptime, Integer mtime, String mtype,
			String myear, String marea, Integer mstatus) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mactor = mactor;
		this.mprice = mprice;
		this.muptime = muptime;
		this.mtime = mtime;
		this.mtype = mtype;
		this.myear = myear;
		this.marea = marea;
		this.mstatus = mstatus;
	}
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", mactor=" + mactor + ", mprice=" + mprice + ", muptime="
				+ muptime + ", mtime=" + mtime + ", mtype=" + mtype + ", myear=" + myear + ", marea=" + marea
				+ ", mstatus=" + mstatus + "]";
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
