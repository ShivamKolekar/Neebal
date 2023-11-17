package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import model.Product;
import service.ProductService;

import static org.junit.Assert.assertEquals;

public class ProductServiceTest {

    @Test
    public void testIncreasePriceByCategory() {
        Product mobile = new Product(1, "Mobile", 500, "Mobiles");
        Product laptop = new Product(2, "Laptop", 1000, "Laptops");

        ProductService productService = new ProductService();

        Product updatedMobile = productService.increasePriceByCategory(mobile);
        Product updatedLaptop = productService.increasePriceByCategory(laptop);

        assertEquals(510.0, updatedMobile.getPrice(), 0.001);
        assertEquals(1010.0, updatedLaptop.getPrice(), 0.001);
    }

    @Test
    public void testComputeTotalPrice() {
        Product mobile = new Product(1, "Mobile", 500, "Mobiles");
        Product laptop = new Product(2, "Laptop", 1000, "Laptops");

        ProductService productService = new ProductService();
        double totalPrice = productService.computeTotalPrice(new Product[]{mobile, laptop});

        assertEquals(1500.0, totalPrice, 0.001);
    }

    @Test
    public void testComputeGreaterPrice() {
        Product mobile = new Product(1, "Mobile", 500, "Mobiles");
        Product laptop = new Product(2, "Laptop", 1000, "Laptops");

        ProductService productService = new ProductService();
        //productService.computeGreaterPrice(mobile, laptop);
        
        assertEquals("Product1 has a greater price than Product2", productService.computeGreaterPrice(mobile, laptop));

    }
}


