package com.guames.restful.api.restfulapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("hello")
public class HelloRestController {

    @GetMapping
    public ResponseEntity get(){
        return ResponseEntity.status(HttpStatus.OK).body(Collections.singletonMap("name","Gustavo"));
    }

    @PostMapping
    public ResponseEntity post(@RequestBody Map<String, Object> genericMap){
        System.out.println(genericMap);
        return ResponseEntity.status(HttpStatus.OK).body(genericMap);
    }
}
