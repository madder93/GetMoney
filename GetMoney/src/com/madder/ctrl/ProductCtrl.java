package com.madder.ctrl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.madder.srv.ProductSrv;

@Controller
public class ProductCtrl {

	@Resource
	private ProductSrv productSrv;

	@ResponseBody 
	@RequestMapping("/products.do")
	public List<Map<String, Object>> getProducts(int type){
		List<Map<String, Object>> list = productSrv.getProducts(type);
		return list;
	}
}
