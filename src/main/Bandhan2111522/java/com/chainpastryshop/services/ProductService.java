package com.chainpastryshop.services;

import com.chainpastryshop.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> productList = new ArrayList<>();
    private Product selectedProduct;

    public ProductService() {
        // Sample products
        productList.add(new Product("Chocolate Cake", "Cakes", 20.00));
        productList.add(new Product("Strawberry Pastry", "Pastries", 5.50));
        productList.add(new Product("Oatmeal Cookie", "Cookies", 2.00));
        productList.add(new Product("Sourdough Bread", "Breads", 3.75));
    }

    public List<Product> searchProducts(String keyword) {
        List<Product> results = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().toLowerCase().contains(keyword.toLowerCase())) {
                results.add(product);
            }
        }
        return results;
    }

    public void setSelectedProduct(String productName) {
        for (Product product : productList) {
            if (productName.contains(product.getName())) {
                selectedProduct = product;
                break;
            }
        }
    }

    public Product getSelectedProduct() {
        return selectedProduct;
    }
}