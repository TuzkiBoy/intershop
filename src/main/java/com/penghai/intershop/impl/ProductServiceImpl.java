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
	public JSONArray getAllProductData(Select select) {
		
		//1.通过输入的关键字进行模糊查询，例如输入联想查询出联想相关数据，然后对其进行分页
		List<Product> productData = productMapper.selectByFuzzyAndPage(select);
		JSONArray jsonArray = new JSONArray();
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
			return jsonArray;
		
		} 

	}


