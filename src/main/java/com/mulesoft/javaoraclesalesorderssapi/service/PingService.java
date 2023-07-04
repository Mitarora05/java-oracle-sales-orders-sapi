
package com.mulesoft.javaoraclesalesorderssapi.service;

import com.mulesoft.javaoraclesalesorderssapi.exception.ServiceCustomException;
import com.mulesoft.javaoraclesalesorderssapi.model.PingResponse;
import org.springframework.http.ResponseEntity;

public interface PingService {

    // getPingImplFlow
    ResponseEntity<PingResponse> getPing() throws ServiceCustomException;
}
