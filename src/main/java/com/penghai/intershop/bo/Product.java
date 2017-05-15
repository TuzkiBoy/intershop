package com.penghai.intershop.bo;


public class Product {
	private Integer id;             //商品id 
	private String productname;		//商品名称
	private String price;			//商品价格
	private String shop;			//店铺
	private String evaluate;		//评价数
	private String picture;			//商品图片
	private String category;		//商品类别
	

	
	public Integer getId() {
		return id;
	}
	
	public void SetId(Integer id) {
		this.id=id;
	} 
	
	public String getProductname() {
		return productname;
	}
	
	public void setProductname(String productname) {
		this.productname=productname;
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price=price;
	}
	
	public String getShop() {
		return shop;
	}
	
	public void setShop(String shop) {
		this.shop=shop;
	}
	
	public String getEvaluate() {
		return evaluate;
	}
	
	public void setEvaluate(String evaluate) {
		this.evaluate=evaluate;
	}
	
	public String getPicture() {
		return picture;
	}
	
	public void setPicture(String picture) {
		this.picture=picture;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category=category;
	}
}
