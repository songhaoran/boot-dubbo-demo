package com.meixin.consumerdemo.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.meixin.order.service.OrderService;
import com.meixin.product.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Song on 2018/07/13.
 */
@RestController
public class HelloConsumerController {
    @Reference(version = "${demo.service.version}",
            application = "${dubbo.application.id}",
            url = "${hello.service.url}")
    private HelloService helloService;

    @Reference(version = "${demo.service.version}",
            application = "${dubbo.application.id}",
            url = "${order.service.url}")
    private OrderService orderService;

    @RequestMapping("/hello")
    public String hello() {
        return helloService.hello();
    }

    @RequestMapping("/create_order")
    public String createOrder() {
        return orderService.createOrder(10000);
    }
}
