package org.assignment.five.domain;

import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Product implements Comparator<Product>{
	
	String name;
	double price;
	String category;
	

	@Override
	public int compare(Product o1, Product o2) {
		return (int) (o1.getPrice() - o2.getPrice());
				
	}
	
	
	@Override
	public String toString() {
		return String.format("%-20s%%-10.2f%-20s", this.name, this.price, this.category);
	}

}
