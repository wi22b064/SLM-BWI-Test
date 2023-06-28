package com.example.slmexam.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {

    @RequestMapping("/api/factorial")
    public int calculate(@RequestParam int number){
        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial = i * factorial;
        }
        return factorial;

    }
}
