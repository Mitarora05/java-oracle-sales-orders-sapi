package com.mulesoft.javaoraclesalesorderssapi.model;

import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class PostSalesOrderRequest {
    private String SourceTransactionSystem;
    private String SourceTransactionId;
    private String SourceTransactionNumber;
    private String BusinessUnitName;
    private String BuyingPartyName;
    private String RequestingBusinessUnitName;
    private String TransactionalCurrencyCode;
    private Boolean FreezePriceFlag;
    private Boolean SubmittedFlag;
    private List<BillToCustomer> billToCustomer;
    private List<ShipToCustomer> shipToCustomer;
    private List<Lines> lines;
}

