package com.example.jwtsample.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public ResponseEntity<Hello> firstPage() {
        return ResponseEntity.ok(new Hello("Hello world"));
    }


}
@Data
@AllArgsConstructor
class Hello {
    private String message;
}