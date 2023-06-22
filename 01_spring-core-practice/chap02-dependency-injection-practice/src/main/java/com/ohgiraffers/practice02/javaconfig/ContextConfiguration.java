package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;

@Configuration
public class ContextConfiguration {

    @Bean
    public MemberDTO memberGenerator() {
        MemberDTO member = new MemberDTO();
        member.setId(1L);
        member.setNickname("아아아");

        return member;
    }

    @Bean
    public BoardDTO boardGenerator() {
        BoardDTO board = new BoardDTO();
        board.setId(1L);
        board.setTitle("의존성 주입 연습");
        board.setContent("게시글의 작성자 객체를 주입받기");
        board.setWriter(memberGenerator());

        return board;
    }
}
