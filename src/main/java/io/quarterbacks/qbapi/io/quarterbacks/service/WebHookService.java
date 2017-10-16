package io.quarterbacks.qbapi.io.quarterbacks.service;

import io.quarterbacks.qbapi.io.quarterbacks.web.dto.WebHookPayloadDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by Abderrazak BOUADMA
 * on 10/08/2017.
 */
@Service
@Slf4j
public class WebHookService {

    public void process(WebHookPayloadDto payload) {
        log.info("payload {} ", payload);
    }
}
