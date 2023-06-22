package com.ohgiraffers.chap05interceptorpractice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    @GetMapping("")
    public String list(Model model) {
        // 기능 수행 코드 생략
        List<BookDTO> bookList = new ArrayList<>();
        bookList.add(new BookDTO("1", "책1", "저자1", "출판사1"));
        bookList.add(new BookDTO("2", "책2", "저자2", "출판사2"));

        model.addAttribute("bookList", bookList);

        return "book/list";
    }

    @GetMapping("/{bookCode}")
    public String detail(@PathVariable String bookCode, Model model) {
        // 기능 수행 코드 생략
        List<BookDTO> bookList = new ArrayList<>();
        bookList.add(new BookDTO("1", "책1", "저자1", "출판사1"));
        bookList.add(new BookDTO("2", "책2", "저자2", "출판사2"));

        BookDTO bookDTO = null;
        for (BookDTO book : bookList) {
            if (book.getBookCode().equals(bookCode)) {
                bookDTO = book;
                break;
            }
        }

        model.addAttribute("bookDTO", bookDTO);

        return "book/detail";
    }
}
