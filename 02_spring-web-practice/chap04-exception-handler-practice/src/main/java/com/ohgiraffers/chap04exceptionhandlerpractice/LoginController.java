package com.ohgiraffers.chap04exceptionhandlerpractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

@Controller
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
        if (!(username.equals("user01") && password.equals("pass01"))) {
            throw new InvalidCredentialsException("401 error : 유효한 자격 증명 없음");
        }
        return "redirect:/main";
    }
}

