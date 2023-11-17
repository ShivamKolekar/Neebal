package service;

import model.Product;

public class ProductService {
    public Product increasePriceByCategory(Product p) {
        double incrementPercentage = 0;

        if ("Mobiles".equals(p.getCategory())) {
            incrementPercentage = 0.02; // 2%
        } else if ("Laptops".equals(p.getCategory())) {
            incrementPercentage = 0.01; // 1%
        }

        double increasedPrice = p.getPrice() * (1 + incrementPercentage);
        p.setPrice(increasedPrice);

        return p;
    }

    public double computeTotalPrice(Product[] products) {
        double totalPrice = 0;

        for (Product product : products) {
            totalPrice += product.getPrice();
        }

        return totalPrice;
    }

    public String computeGreaterPrice(Product p1, Product p2) {
    	String result="";
    	if (p1.getPrice() > p2.getPrice()) {
    		result = p1.getTitle() + " has a greater price than " + p2.getTitle();
        } else if (p1.getPrice() < p2.getPrice()) {
           result =  p2.getTitle() + " has a greater price than " + p1.getTitle();
        } else {
        	result = p1.getTitle() + " and " + p2.getTitle() + " have the same price.";
        }
		return result;
    	
    }
}

