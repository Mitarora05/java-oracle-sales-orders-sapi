
package com.mulesoft.javaoraclesalesorderssapi.controller;

import com.mulesoft.javaoraclesalesorderssapi.exception.ControllerCustomException;
import com.mulesoft.javaoraclesalesorderssapi.exception.ServiceCustomException;
import com.mulesoft.javaoraclesalesorderssapi.model.GetSalesOrderDataType;
import com.mulesoft.javaoraclesalesorderssapi.model.PostSalesOrderDataTypeResponse;
import com.mulesoft.javaoraclesalesorderssapi.model.InboundPostSalesOrderDataTypeRequest;
import com.mulesoft.javaoraclesalesorderssapi.model.GetSalesOrderByIdDataType;
import com.mulesoft.javaoraclesalesorderssapi.model.PatchSalesOrderDataTypeResponse;
import com.mulesoft.javaoraclesalesorderssapi.model.DeleteSalesOrderByIdDataType;
import com.mulesoft.javaoraclesalesorderssapi.service.SalesOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/salesOrders")
public class SalesOrdersController {

    @Autowired
    private SalesOrderService salesOrderService;

    @GetMapping
    public ResponseEntity<GetSalesOrderDataType> getSalesOrders() throws ControllerCustomException {
        try {
            GetSalesOrderDataType salesOrders = salesOrderService.getSalesOrders();
            return new ResponseEntity<>(salesOrders, HttpStatus.OK);
        } catch(ServiceCustomException e) {
            log.error("Error Occured :: {}", e.getMessage());
            throw new ControllerCustomException(e);
        }
    }

    @PostMapping
    public ResponseEntity<PostSalesOrderDataTypeResponse> createSalesOrder() throws ControllerCustomException {
        try {
            PostSalesOrderDataTypeResponse salesOrder = salesOrderService.createSalesOrder();
            return new ResponseEntity<>(salesOrder, HttpStatus.CREATED);
        } catch(ServiceCustomException e) {
            log.error("Error Occured :: {}", e.getMessage());
            throw new ControllerCustomException(e);
        }
    }

    @PostMapping("/inbound")
    public ResponseEntity<InboundPostSalesOrderDataTypeRequest> createSalesOrderFromSalesforce() throws ControllerCustomException {
        try {
            InboundPostSalesOrderDataTypeRequest salesOrder = salesOrderService.createSalesOrderFromSalesforce();
            return new ResponseEntity<>(salesOrder, HttpStatus.CREATED);
        } catch(ServiceCustomException e) {
            log.error("Error Occured :: {}", e.getMessage());
            throw new ControllerCustomException(e);
        }
    }

    @GetMapping("/{orderNumber}")
    public ResponseEntity<GetSalesOrderByIdDataType> getSalesOrderById(@PathVariable String orderNumber) throws ControllerCustomException {
        try {
            GetSalesOrderByIdDataType salesOrder = salesOrderService.getSalesOrderById(orderNumber);
            return new ResponseEntity<>(salesOrder, HttpStatus.OK);
        } catch(ServiceCustomException e) {
            log.error("Error Occured :: {}", e.getMessage());
            throw new ControllerCustomException(e);
        }
    }

    @PatchMapping("/{orderNumber}")
    public ResponseEntity<PatchSalesOrderDataTypeResponse> updateSalesOrderById(@PathVariable String orderNumber) throws ControllerCustomException {
        try {
            PatchSalesOrderDataTypeResponse salesOrder = salesOrderService.updateSalesOrderById(orderNumber);
            return new ResponseEntity<>(salesOrder, HttpStatus.OK);
        } catch(ServiceCustomException e) {
            log.error("Error Occured :: {}", e.getMessage());
            throw new ControllerCustomException(e);
        }
    }

    @DeleteMapping("/{orderNumber}")
    public ResponseEntity<DeleteSalesOrderByIdDataType> deleteSalesOrderById(@PathVariable String orderNumber) throws ControllerCustomException {
        try {
            DeleteSalesOrderByIdDataType salesOrder = salesOrderService.deleteSalesOrderById(orderNumber);
            return new ResponseEntity<>(salesOrder, HttpStatus.OK);
        } catch(ServiceCustomException e) {
            log.error("Error Occured :: {}", e.getMessage());
            throw new ControllerCustomException(e);
        }
    }
}
