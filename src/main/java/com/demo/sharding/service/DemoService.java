package com.demo.sharding.service;

import com.demo.sharding.dal.OrderItemMapper;
import com.demo.sharding.dal.OrderMapper;
import com.demo.sharding.entity.Order;
import com.demo.sharding.entity.OrderItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class DemoService {

    @Resource
    private OrderMapper orderMapper;

    @Resource
    private OrderItemMapper orderItemMapper;

    public void demo() {
    	
    	
        List<Long> orderIds = new ArrayList<>(10);
        log.info("1.Insert--------------");
        for (int i = 0; i < 15; i++) {
            Order order = new Order();
            String status = i > 5?"JP":"CN";
            
            order.setOrderId(Integer.valueOf(i).longValue());
            order.setUserId(51);
            order.setStatus(status);
            orderMapper.insert(order);
            long orderId = order.getOrderId();
            orderIds.add(orderId);

            OrderItem item = new OrderItem();
            item.setOrderItemId(Integer.valueOf(i).longValue());
            item.setOrderId(orderId);
            item.setUserId(51);
            item.setStatus(status);
            orderItemMapper.insert(item);
        }
        log.info("The order list : {}!", orderItemMapper.selectAll());

        log.info(">===================<");

        log.info("The order item count : {}!", orderItemMapper.selectCnt());
    }
}
