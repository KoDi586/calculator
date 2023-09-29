package com.KoDi.calculator;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class FindValue {
    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        if (num2 != 0) {
            return num1 + " / " + num2 + " = " + (num1 / num2);
        } else {
            return "На ноль делить нельзя!";
        }
    }

//    public boolean isThereNums()

}

