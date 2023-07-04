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
public class BillToCustomer {
    private Integer AddressId;
    private Integer CustomerAccountId;
    private String PartyName;
    private String AccountNumber;
    private Object PersonFirstName;
    private Object PersonLastName;
    private Object PersonMiddleName;
    private Object PersonNameSuffix;
    private Object PersonTitle;
    private Integer SiteUseId;
    private String Address1;
    private Object Address2;
    private Object Address3;
    private Object Address4;
    private Object City;
    private Object State;
    private Object PostalCode;
    private Object County;
    private Object Province;
    private Object Country;
    private Integer ContactId;
    private Object ContactName;
    private Object ContactNumber;
    private Object ContactFirstName;
    private Object ContactMiddleName;
    private Object ContactLastName;
    private Object ContactNameSuffix;
    private Object ContactTitle;
    private Integer PreferredContactPointId;
    private Object SourceAddressId;
}