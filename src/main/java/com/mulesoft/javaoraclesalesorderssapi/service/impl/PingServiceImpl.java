
package com.mulesoft.javaoraclesalesorderssapi.service.impl;

import com.mulesoft.javaoraclesalesorderssapi.exception.ServiceCustomException;
import com.mulesoft.javaoraclesalesorderssapi.model.PingResponse;
import com.mulesoft.javaoraclesalesorderssapi.service.PingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class PingServiceImpl implements PingService {

    private final RestTemplate restTemplate;

    public PingServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public ResponseEntity<PingResponse> getPing() throws ServiceCustomException {
        try {
            log.info("Trigger Ping Flow Started");
            ResponseEntity<PingResponse> response = restTemplate.getForEntity("URL", PingResponse.class);
            log.info("Trigger Ping Flow Ended");
            return response;
        } catch (Exception e) {
            log.error("Error Occured :: {}", e.getMessage());
            throw new ServiceCustomException(e);
        }
    }
}
