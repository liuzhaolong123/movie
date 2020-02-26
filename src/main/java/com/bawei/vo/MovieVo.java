package com.bawei.vo;

public class MovieVo{
	
	private Integer pageNum;
	private String  mname;
	private String  mactor;
	private String  myear;
	
	private String  s1;//上映时间
	private String  s2;//上映时间
	
    private Double  p1;//价格
    private Double  p2;//价格
    
    private String  b1;//播放时间
    private String  b2;//播放时间
    
    private String  orderName;//排序名称
    private String  orderMethod;//排序方式
    
    
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderMethod() {
		return orderMethod;
	}
	public void setOrderMethod(String orderMethod) {
		this.orderMethod = orderMethod;
	}
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
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
	public String getMyear() {
		return myear;
	}
	public void setMyear(String myear) {
		this.myear = myear;
	}
	public String getS1() {
		return s1;
	}
	public void setS1(String s1) {
		this.s1 = s1;
	}
	public String getS2() {
		return s2;
	}
	public void setS2(String s2) {
		this.s2 = s2;
	}
	public Double getP1() {
		return p1;
	}
	public void setP1(Double p1) {
		this.p1 = p1;
	}
	public Double getP2() {
		return p2;
	}
	public void setP2(Double p2) {
		this.p2 = p2;
	}
	public String getB1() {
		return b1;
	}
	public void setB1(String b1) {
		this.b1 = b1;
	}
	public String getB2() {
		return b2;
	}
	public void setB2(String b2) {
		this.b2 = b2;
	}
	public MovieVo(Integer pageNum, String mname, String mactor, String myear, String s1, String s2, Double p1,
			Double p2, String b1, String b2) {
		super();
		this.pageNum = pageNum;
		this.mname = mname;
		this.mactor = mactor;
		this.myear = myear;
		this.s1 = s1;
		this.s2 = s2;
		this.p1 = p1;
		this.p2 = p2;
		this.b1 = b1;
		this.b2 = b2;
	}
	@Override
	public String toString() {
		return "MovieVo [pageNum=" + pageNum + ", mname=" + mname + ", mactor=" + mactor + ", myear=" + myear + ", s1="
				+ s1 + ", s2=" + s2 + ", p1=" + p1 + ", p2=" + p2 + ", b1=" + b1 + ", b2=" + b2 + "]";
	}
	public MovieVo() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
    

}
