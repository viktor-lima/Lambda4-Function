package utils;

import java.util.function.Function;

import entities.Product;

public class ToUpperCase implements Function<Product, String>{

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
