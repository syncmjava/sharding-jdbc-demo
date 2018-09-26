package com.demo.sharding.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItem {
	
    private long orderItemId;

    private long orderId;

    private int userId;

    private String status;

    @Override
    public String toString() {
        return String.format("item_id:%s, order_id: %s, user_id: %s, status: %s", orderItemId, orderId, userId, status);
    }
}
