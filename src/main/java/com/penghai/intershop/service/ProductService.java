package com.penghai.intershop.service;

import com.alibaba.fastjson.JSONObject;
import com.penghai.intershop.bo.Select;

public interface ProductService {
	//模糊分页查询
	public JSONObject getAllProductData(Select select);
}
