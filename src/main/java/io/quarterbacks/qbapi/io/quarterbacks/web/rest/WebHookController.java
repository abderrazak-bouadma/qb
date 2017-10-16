package io.quarterbacks.qbapi.io.quarterbacks.web.rest;

import io.quarterbacks.qbapi.io.quarterbacks.service.WebHookService;
import io.quarterbacks.qbapi.io.quarterbacks.web.dto.WebHookPayloadDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/qb/webhook")
public class WebHookController {

    @Autowired
    private WebHookService webHookService;

    @PostMapping
    public ResponseEntity<?> gitWebHook(@RequestBody WebHookPayloadDto payload) {
        webHookService.process(payload);
        return ResponseEntity.ok().build();
    }
}
