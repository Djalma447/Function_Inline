package models.services;

import java.util.List;
import java.util.function.Predicate;

import models.entities.Product;

public class ProductService {

	public double filteredSums(List<Product> list, Predicate<Product> condition) {
		double sum = 0;
		for (Product p : list) {
			if (condition.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
