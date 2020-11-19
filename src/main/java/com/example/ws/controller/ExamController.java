package com.example.ws.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExamController {

    @GetMapping("add")
    public ResponseEntity<Integer> add(@RequestParam int n1, @RequestParam int n2) {
        int sum = n1 + n2;
        System.out.println("Total: " + sum);
        return new ResponseEntity<>(sum, HttpStatus.OK);
    }

    @GetMapping("mul")
    public ResponseEntity<Integer> mul(@RequestParam int n1, @RequestParam int n2) {
        int mul = n1 * n2;
        System.out.println("Total: " + mul);
        return new ResponseEntity<>(mul, HttpStatus.OK);
    }

    @GetMapping("sub")
    public ResponseEntity<Integer> sub(@RequestParam int n1, @RequestParam int n2) {
        int sub = n1 - n2;
        System.out.println("Total: " + sub);
        return new ResponseEntity<>(sub, HttpStatus.OK);
    }

    @GetMapping("div")
    public ResponseEntity<Integer> div(@RequestParam int n1, @RequestParam int n2) {
        int div = n1 / n2;
        System.out.println("Total: " + div);
        return new ResponseEntity<>(div, HttpStatus.OK);
    }

}
