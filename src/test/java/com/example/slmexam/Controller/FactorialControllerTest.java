package com.example.slmexam.Controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialControllerTest {

    @Test
    void calculateFactorial(){
        FactorialController controller = new FactorialController();
        int result = controller.calculate(5);
        assertEquals(result, 120);
    }
}
