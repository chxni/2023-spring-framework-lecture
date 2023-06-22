package com.ohgiraffers.chap04exceptionhandlerpractice;

import org.springframework.web.bind.annotation.GetMapping;

public class InvalidCredentialsException extends RuntimeException {

    public InvalidCredentialsException(String message) {
        super(message);
    }
}
