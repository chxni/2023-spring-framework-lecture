package com.ohgiraffers.chap04exceptionhandlerpractice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(InvalidCredentialsException.class)
    public String loginExceptionHandler(Model model, InvalidCredentialsException exception) {

        model.addAttribute("exception", exception);
        return "error/401";
    }
}
