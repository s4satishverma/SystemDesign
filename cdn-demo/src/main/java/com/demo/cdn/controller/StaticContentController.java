
package com.demo.cdn.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StaticContentController {

    @GetMapping("/data")
    public ResponseEntity<String> getData() {
        System.out.println("Origin server hit!");
        return ResponseEntity.ok()
                .header(HttpHeaders.CACHE_CONTROL, "public, max-age=60")
                .body("Hello from Origin Server at " + System.currentTimeMillis());
    }
}
