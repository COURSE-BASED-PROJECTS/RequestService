package com.up.RequestService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/request")
public class RequestController {
    @GetMapping
    public ResponseEntity<String> getAllAccount(){
        return new ResponseEntity<>("Hello. I'm request service", HttpStatus.OK);
    }
}
