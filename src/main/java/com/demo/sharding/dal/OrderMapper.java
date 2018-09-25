package com.demo.sharding.dal;

import com.demo.sharding.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {

    Long insert(Order model);

    void delete(Long orderId);

}
