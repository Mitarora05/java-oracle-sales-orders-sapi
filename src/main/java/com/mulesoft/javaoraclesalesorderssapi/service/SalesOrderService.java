
package com.mulesoft.javaoraclesalesorderssapi.service;

import com.mulesoft.javaoraclesalesorderssapi.exception.ServiceCustomException;
import com.mulesoft.javaoraclesalesorderssapi.model.GetSalesOrderDataType;
import com.mulesoft.javaoraclesalesorderssapi.model.PostSalesOrderDataTypeResponse;
import com.mulesoft.javaoraclesalesorderssapi.model.InboundPostSalesOrderDataTypeRequest;
import com.mulesoft.javaoraclesalesorderssapi.model.GetSalesOrderByIdDataType;
import com.mulesoft.javaoraclesalesorderssapi.model.PatchSalesOrderDataTypeResponse;
import com.mulesoft.javaoraclesalesorderssapi.model.DeleteSalesOrderByIdDataType;

public interface SalesOrderService {

    GetSalesOrderDataType getSalesOrders() throws ServiceCustomException;

    PostSalesOrderDataTypeResponse createSalesOrder() throws ServiceCustomException;

    InboundPostSalesOrderDataTypeRequest createSalesOrderFromSalesforce() throws ServiceCustomException;

    GetSalesOrderByIdDataType getSalesOrderById(String orderNumber) throws ServiceCustomException;

    PatchSalesOrderDataTypeResponse updateSalesOrderById(String orderNumber) throws ServiceCustomException;

    DeleteSalesOrderByIdDataType deleteSalesOrderById(String orderNumber) throws ServiceCustomException;
}
