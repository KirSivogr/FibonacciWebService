package com.example.kollokvium2;

import com.example.kollokvium2.Fibonacci;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("fibonacci")
public class FibonacciController {
    private final Fibonacci fibonacci = new Fibonacci();

    @GetMapping("{id}")
    public Integer getOne(@PathVariable String id) {
        return fibonacci.getNNumberFib(Integer.parseInt(id));
    }

    @GetMapping("numbers/{id}")
    public List<Integer> getN(@PathVariable String id) {
        return fibonacci.getFirstNNumbersFib(Integer.parseInt(id));
    }
}