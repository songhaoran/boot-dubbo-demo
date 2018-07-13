package com.meixin.order.service;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by Song on 2018/07/13.
 */
@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}",
        timeout = 1200000
)
public class OrderServiceImpl implements OrderService {
    @Override
    public String createOrder(Integer amount) {
        return "create order with amount" + amount;
    }
}
