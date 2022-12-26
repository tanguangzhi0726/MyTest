/**
* 大连交通大学-谭广志-1818120115
* 外国语学院
* 版权所有
*/	

package com.how2java.wuer.comparator;


import java.util.Comparator;

import com.how2java.wuer.pojo.Product;

public class ProductSaleCountComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return p2.getSaleCount()-p1.getSaleCount();
	}

}

/**
* 大连交通大学-谭广志-1818120115
* 外国语学院
* 版权所有
*/	
