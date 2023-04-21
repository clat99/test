package org.assignment.five.main;

import java.util.Comparator;

import org.assignment.five.domain.Product;

public class PriceComparator implements Comparator<Product>{
	
	@Override
	public int compare(Product o1, Product o2) {
		return (int) (o1.getPrice() - o2.getPrice());
		
		
	}

}
