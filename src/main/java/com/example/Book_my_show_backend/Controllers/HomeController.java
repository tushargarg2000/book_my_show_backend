package com.example.Book_my_show_backend.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

//    @GetMapping("/error")
//    public String home(){
//        return "Hello World!";
//    }

    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/error")
    public String index1() {
        return "Greetings from Spring Boot!";
    }
}
