package com.madder.srv;

import java.util.List;
import java.util.Map;

public interface ProductSrv {

	public List<Map<String, Object>> getProducts(int type);
}
