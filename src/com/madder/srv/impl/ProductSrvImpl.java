package com.madder.srv.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.madder.srv.ProductSrv;
import com.madder.util.ConstantsUtil;
import com.madder.util.GetJsonUtil;

@Service("ProductSrv")
public class ProductSrvImpl implements ProductSrv{

	@SuppressWarnings("unchecked")
	@Override
	public List<Map<String, Object>> getProducts(int type) {
		String json = GetJsonUtil.getJson(ConstantsUtil.jsonPath);
		Map<String, Object> map = GetJsonUtil.toMap(json);
		List<Map<String, Object>> products = (List<Map<String, Object>>) map.get("products");
		return products;
	}

}
