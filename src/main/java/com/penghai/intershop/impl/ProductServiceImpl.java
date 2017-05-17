package com.penghai.intershop.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.penghai.intershop.bo.Product;
import com.penghai.intershop.bo.Select;
import com.penghai.intershop.dao.ProductMapper;
import com.penghai.intershop.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductMapper productMapper;

	//模糊分页查询
	public JSONObject getAllProductData(Select select) {
		
		//1.通过输入的关键字进行模糊查询并同时获取到数据长度
		List<Product> productData = productMapper.selectByFuzzyAndPage(select);
		int productDataNum = productMapper.selectDataNum(select);
		JSONArray jsonArray = new JSONArray();
		JSONObject jsonObj = new JSONObject();
			for (int i = 0; i < productData.size(); i++) {
				Product p = productData.get(i);
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("id", p.getId());
				jsonObject.put("productname", p.getProductname());
				jsonObject.put("price", p.getPrice());
				jsonObject.put("shop", p.getShop());
				jsonObject.put("picture", p.getPicture());
				jsonArray.add(jsonObject);
			}
			jsonObj.put("dataNum", productDataNum);
			jsonObj.put("data", jsonArray);
			
			
			//返回数据长度
			return jsonObj;
		
		} 

	}


