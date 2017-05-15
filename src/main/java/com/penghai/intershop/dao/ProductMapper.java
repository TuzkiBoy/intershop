package com.penghai.intershop.dao;

import java.util.List;

import com.penghai.intershop.bo.Product;
import com.penghai.intershop.bo.Select;

public interface ProductMapper {
	
	//模糊查询
	public List<Product> selectByFuzzyAndPage(Select select);
	
}
