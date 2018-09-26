package com.demo.sharding.dal;

import com.demo.sharding.entity.OrderItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderItemMapper {

    Long insert(OrderItem model);

    List<OrderItem> selectAll();
    
    int selectCnt();
}
