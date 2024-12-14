package com.chainpastryshop.models;

public class Order {
    private int orderId;
    private String status;
    private String estimatedDelivery;

    public Order(int orderId, String status, String estimatedDelivery) {
        this.orderId = orderId;
        this.status = status;
        this.estimatedDelivery = estimatedDelivery;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getStatus() {
        return status;
    }

    public String getEstimatedDelivery() {
        return estimatedDelivery;
    }
}