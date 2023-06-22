package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("practice2JavaConfiguration")
public class ContextConfiguration {

    @Bean(name="board")
    public BoardDTO getBoard() {

        return new BoardDTO(2L, "오늘만 버스 4번째 놓친 사람", "등하교 넘 힘들어요", "갈매주민");
    }
}
