package com.penghai.intershop.controller;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSONArray;
import com.penghai.intershop.bo.Select;
import com.penghai.intershop.service.ProductService;

@Controller
@Path("/select")
public class ProductController extends BaseController{
	@Autowired
	private ProductService productService;
	
	@POST
	@Path(value="/alldata")
	@Consumes("application/json") 
	@Produces(MediaType.APPLICATION_JSON)
	
	//传入参数为Product product
	
	public JSONArray getAllData(Select select){
		//通过模糊查询获得所有此商品的信息 
		String productname = select.getProductname();
		select.setProductname(productname);
		Integer page = select.getPage();
		Integer start = (page - 1) * 20;
		select.setPage(start);
		JSONArray result = productService.getAllProductData(select);
		return result;
	}
	
	

}
