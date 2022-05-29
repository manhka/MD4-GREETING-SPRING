package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam String n, Model model) {
        model.addAttribute("ten",n );
        return "index";
    }
}
//@RequestParam: là annotation để đánh dấu rằng name là tham số được truyền vào
//        model: là đối tượng để truyền dữ liệu từ controller sang view
//        model.addAttribute(): là phương thức để truyền một dữ liệu từ controller sang view
//Trong đó:
//
//@Controller: là annotation để đánh dấu lớp GreetingController là một controller (đối tượng sẽ xử lý các request)
//@GetMapping: là annotation để đánh dấu phương thức greeting() là một phương thức dùng để xử lý request khi có một request GET được gửi đến đường dẫn "/greeting".
