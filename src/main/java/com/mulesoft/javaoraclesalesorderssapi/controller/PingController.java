
package com.mulesoft.javaoraclesalesorderssapi.controller;

import com.mulesoft.javaoraclesalesorderssapi.exception.ControllerCustomException;
import com.mulesoft.javaoraclesalesorderssapi.exception.ServiceCustomException;
import com.mulesoft.javaoraclesalesorderssapi.model.PingResponse;
import com.mulesoft.javaoraclesalesorderssapi.service.PingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/ping")
public class PingController {

    @Autowired
    private PingService pingService;

    @GetMapping
    public ResponseEntity<PingResponse> getPing() throws ControllerCustomException {
        try {
            return pingService.getPing();
        } catch(ServiceCustomException e) {
            log.error("Error Occured :: {}", e.getMessage());
            throw new ControllerCustomException(e);
        }
    }
}
