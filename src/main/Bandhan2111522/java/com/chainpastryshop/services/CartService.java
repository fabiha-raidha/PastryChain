package com.chainpastryshop.services;

import com.chainpastryshop.models.Product;
import java.util.ArrayList;
import java.util.List;

public class CartService {
    private List<Product> cartItems = new ArrayList<>();

    public CartService() {
        // For demonstration, adding a sample product
        cartItems.add(new Product("Chocolate Cake", "Cakes", 20.00));
    }

    public List<Product> getCartItems() {
        return cartItems;
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product product : cartItems) {
            total += product.getPrice();
        }
        return total;
    }

    public double applyVoucher(String voucherCode) {
        // Simulating voucher application (10% discount for "DISCOUNT10")
        if ("DISCOUNT10".equalsIgnoreCase(voucherCode)) {
            return getTotalPrice() * 0.10;
        }
        return 0;
    }
}