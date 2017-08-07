package io.quarterbacks.qbapi.io.quarterbacks.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/qb")
public class QBController {

    @GetMapping
    public ResponseEntity<String> greetings() {
        return ResponseEntity.ok().body("Hello there !");
    }
}
