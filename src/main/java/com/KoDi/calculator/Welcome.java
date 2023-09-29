package com.KoDi.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping(path = "/calculator")
    public String welcomeInCalculator() {
        return "Добро пожаловать в калькулятор";
    }
}
