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

    @Test
    void addFactorial(){
        FactorialController controller = new FactorialController();
        int result = controller.add();
        assertEquals(result, 0);
    }

    @Test
    void addFactorialFlowTest(){
        FactorialController controller = new FactorialController();
        //print total
        int result = controller.add();
        assertEquals(result, 0);
        //calculate
        result = controller.calculate(5);
        assertEquals(result, 120);
        //calculate
        result = controller.calculate(4);
        assertEquals(result, 24);
        //print total
        result = controller.add();
        assertEquals(result, 144);
    }


}
