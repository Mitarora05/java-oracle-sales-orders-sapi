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
public class PatchSalesOrderRequest {
    private String PackingInstructions;
    private String ShippingInstructions;
    private String FOBPointCode;
}