
package com.mulesoft.javaoraclesalesorderssapi.service.impl;

import com.mulesoft.javaoraclesalesorderssapi.exception.ServiceCustomException;
import com.mulesoft.javaoraclesalesorderssapi.model.GetSalesOrderDataType;
import com.mulesoft.javaoraclesalesorderssapi.model.PostSalesOrderDataTypeResponse;
import com.mulesoft.javaoraclesalesorderssapi.model.InboundPostSalesOrderDataTypeRequest;
import com.mulesoft.javaoraclesalesorderssapi.model.GetSalesOrderByIdDataType;
import com.mulesoft.javaoraclesalesorderssapi.model.PatchSalesOrderDataTypeResponse;
import com.mulesoft.javaoraclesalesorderssapi.model.DeleteSalesOrderByIdDataType;
import com.mulesoft.javaoraclesalesorderssapi.service.SalesOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

@Slf4j
public class SalesOrderServiceImpl implements SalesOrderService {

    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public GetSalesOrderDataType getSalesOrders() throws ServiceCustomException {
        try {
            log.info("Get Sales Order Flow Started");
            HttpHeaders headers = new HttpHeaders();
            HttpEntity<String> entity = new HttpEntity<>(headers);
            GetSalesOrderDataType response = restTemplate.exchange("URL", HttpMethod.GET, entity, GetSalesOrderDataType.class);
            log.info("Get Sales Order Flow Ended");
            return response;
        } catch (Exception e) {
            log.error("Error Occured :: {}", e.getMessage());
            throw new ServiceCustomException(e);
        }
    }

    @Override
    public PostSalesOrderDataTypeResponse createSalesOrder() throws ServiceCustomException {
        try {
            log.info("Post Inbound Sales Order Flow Started");
            HttpHeaders headers = new HttpHeaders();
            HttpEntity<String> entity = new HttpEntity<>(headers);
            PostSalesOrderDataTypeResponse response = restTemplate.exchange("URL", HttpMethod.POST, entity, PostSalesOrderDataTypeResponse.class);
            log.info("Post Inbound Sales Order Flow Ended");
            return response;
        } catch (Exception e) {
            log.error("Error Occured :: {}", e.getMessage());
            throw new ServiceCustomException(e);
        }
    }

    @Override
    public InboundPostSalesOrderDataTypeRequest createSalesOrderFromSalesforce() throws ServiceCustomException {
        try {
            log.info("Post Inbound Sales Order Flow Started");
            HttpHeaders headers = new HttpHeaders();
            HttpEntity<String> entity = new HttpEntity<>(headers);
            InboundPostSalesOrderDataTypeRequest response = restTemplate.exchange("URL", HttpMethod.POST, entity, InboundPostSalesOrderDataTypeRequest.class);
            log.info("Post Inbound Sales Order Flow Ended");
            return response;
        } catch (Exception e) {
            log.error("Error Occured :: {}", e.getMessage());
            throw new ServiceCustomException(e);
        }
    }

    @Override
    public GetSalesOrderByIdDataType getSalesOrderById(String orderNumber) throws ServiceCustomException {
        try {
            log.info("Get Sales Order By Id Flow Started");
            HttpHeaders headers = new HttpHeaders();
            HttpEntity<String> entity = new HttpEntity<>(headers);
            GetSalesOrderByIdDataType response = restTemplate.exchange("URL/" + orderNumber, HttpMethod.GET, entity, GetSalesOrderByIdDataType.class);
            log.info("Get Sales Order By Id Flow Ended");
            return response;
        } catch (Exception e) {
            log.error("Error Occured :: {}", e.getMessage());
            throw new ServiceCustomException(e);
        }
    }

    @Override
    public PatchSalesOrderDataTypeResponse updateSalesOrderById(String orderNumber) throws ServiceCustomException {
        try {
            log.info("Patch Sales Order Flow Started");
            HttpHeaders headers = new HttpHeaders();
            HttpEntity<String> entity = new HttpEntity<>(headers);
            PatchSalesOrderDataTypeResponse response = restTemplate.exchange("URL/" + orderNumber, HttpMethod.PATCH, entity, PatchSalesOrderDataTypeResponse.class);
            log.info("Patch Sales Order Flow Ended");
            return response;
        } catch (Exception e) {
            log.error("Error Occured :: {}", e.getMessage());
            throw new ServiceCustomException(e);
        }
    }

    @Override
    public DeleteSalesOrderByIdDataType deleteSalesOrderById(String orderNumber) throws ServiceCustomException {
        try {
            log.info("Delete Sales Order Flow Started");
            HttpHeaders headers = new HttpHeaders();
            HttpEntity<String> entity = new HttpEntity<>(headers);
            DeleteSalesOrderByIdDataType response = restTemplate.exchange("URL/" + orderNumber, HttpMethod.DELETE, entity, DeleteSalesOrderByIdDataType.class);
            log.info("Delete Sales Order Flow Ended");
            return response;
        } catch (Exception e) {
            log.error("Error Occured :: {}", e.getMessage());
            throw new ServiceCustomException(e);
        }
    }
}
