package com.anden.learn.kubernetes.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    private Map<String, String> storage = new HashMap<>();

    @GetMapping(path = "/user/{name}/{phone}")
    public ResponseEntity<String> add(@PathVariable(name = "name") String name, @PathVariable(name="phone") String phone) {
        storage.put(name, phone);
        return ResponseEntity.ok("Success");
    }

    @GetMapping(path = "/user/{name}")
    public ResponseEntity<String> get(@PathVariable(name = "name") String name) {
        String phone = storage.get(name);
        if(null != phone) {
            return ResponseEntity.ok(phone);
        }
        return ResponseEntity.status(400).body("Not Found");
    }
}
