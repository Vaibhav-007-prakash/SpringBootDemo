package com.example.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroler {
    @GetMapping("hello")
    public String hello(){
        return "<h1>Hiiiii</h1>";

    }

    @GetMapping("Bye")
    public String abcBye() {
        return "<h1>Bye</h1>";
    }

    @GetMapping("I")
    public String a() {
        return "<h1>I</h1>";
    }

    @GetMapping("I2")
    public String ab() {
        return "<h1>Love</h1>";
    }

    @GetMapping("I3")
    public String abc() {
        return "<h1>I Love You</h1>";
    }
}
