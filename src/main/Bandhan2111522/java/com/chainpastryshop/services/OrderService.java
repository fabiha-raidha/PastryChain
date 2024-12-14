package com.chainpastryshop.services;

import com.chainpastryshop.models.Order;
import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private List<Order> orderHistory = new ArrayList<>();

    public OrderService() {
        // Sample orders for demonstration
        orderHistory.add(new Order(1, "Delivered", "2024-12-10"));
        orderHistory.add(new Order(2, "Processing", "2024-12-15"));
        orderHistory.add(new Order(3, "Shipped", "2024-12-12"));
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public Order getOrderById(int orderId) {
        return orderHistory.stream()
                .filter(order -> order.getOrderId() == orderId)
                .findFirst()
                .orElse(null);  // Return null if no matching order is found
    }
}