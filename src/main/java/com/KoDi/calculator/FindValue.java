package com.KoDi.calculator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class FindValue {
    private final FindValueService findValSer = new FindValueService();
    Integer num1 = null;
    Integer num2 = null;

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(required = false) Integer num1,
                       @RequestParam(required = false) Integer num2) {

        return findValSer.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(required = false) Integer num1,
                        @RequestParam(required = false) Integer num2) {
        return findValSer.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(required = false) Integer num1,
                           @RequestParam(required = false) Integer num2) {
        return findValSer.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(required = false) Integer num1,
                         @RequestParam(required = false) Integer num2) {
        return findValSer.divide(num1, num2);
    }
}

