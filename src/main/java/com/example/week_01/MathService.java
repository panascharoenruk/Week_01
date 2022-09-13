package com.example.week_01;

import org.springframework.web.bind.annotation.*;

@RestController
public class MathService {

    @RequestMapping(value = "/add/{num1}/{num2}", method = RequestMethod.GET)
    public String add(@PathVariable("num1") double n1, @PathVariable("num2") double n2 ){
        return "" + (n1 + n2);
    }

    @RequestMapping(value = "/minus/{num1}/{num2}", method = RequestMethod.GET)
    public String minus(@PathVariable("num1") double n1, @PathVariable("num2") double n2 ){
        return "" + (n1 - n2);
    }

    @RequestMapping(value = "/multiply", method = RequestMethod.GET)
    public String multipl(@RequestParam double num3, @RequestParam double num4 ){
        return "" + (num3 * num4);
    }

    @RequestMapping(value = "/divide", method = RequestMethod.GET)
    public String divide(@RequestParam double num1, @RequestParam double num2 ){
        return "" + (num1 / num2);
    }
}
