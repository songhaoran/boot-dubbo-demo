package com.meixin.product.service;


import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * Created by Song on 2018/07/11.
 */
@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}",
        timeout = 1200000
)
@Component
public class HelloServiceImpl implements HelloService {
    public String hello() {
        return "hello apache dubbo in boot!";
    }
}
