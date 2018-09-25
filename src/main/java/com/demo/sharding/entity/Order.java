package com.demo.sharding.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {

    private long orderId;

    private int userId;

    private String status;

    @Override
    public String toString() {
        return String.format("order_id: %s, user_id: %s, status: %s", orderId, userId, status);
    }
}
