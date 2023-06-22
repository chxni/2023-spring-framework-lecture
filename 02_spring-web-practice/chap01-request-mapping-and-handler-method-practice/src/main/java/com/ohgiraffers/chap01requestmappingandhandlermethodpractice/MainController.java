package com.ohgiraffers.chap01requestmappingandhandlermethodpractice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @PostMapping("main")
    public String sessionNickname(Model model, @RequestParam String nickname) {

        model.addAttribute("nickname", nickname);
        System.out.println(nickname);

        return "main";
    }
}
