package com.ohgiraffers.chap01requestmappingandhandlermethodpractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

    @PostMapping("orders")
    public String orderProduct(@ModelAttribute("order") OrderDTO order) {

        System.out.println(order);

        return "confirm";
    }
}
