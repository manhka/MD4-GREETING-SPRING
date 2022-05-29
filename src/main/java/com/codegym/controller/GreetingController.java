package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting() {
        return "views/index";
    }
}
//Trong đó:
//
//@Controller: là annotation để đánh dấu lớp GreetingController là một controller (đối tượng sẽ xử lý các request)
//@GetMapping: là annotation để đánh dấu phương thức greeting() là một phương thức dùng để xử lý request khi có một request GET được gửi đến đường dẫn "/greeting".
