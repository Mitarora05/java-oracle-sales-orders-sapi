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
public class PatchSalesOrderResponse {
    private Integer HeaderId;
    private String OrderNumber;
    private String SourceTransactionNumber;
    private String SourceTransactionSystem;
    private String SourceTransactionId;
    private Integer BusinessUnitId;
    private String BusinessUnitName;
    private String TransactionOn;
    private Integer BuyingPartyId;
    private String BuyingPartyName;
    private String BuyingPartyNumber;
    private Object BuyingPartyPersonFirstName;
    private Object BuyingPartyPersonLastName;
    private Object BuyingPartyPersonMiddleName;
    private Object BuyingPartyPersonNameSuffix;
    private Object BuyingPartyPersonTitle;
    private Object BuyingPartyContactId;
    private Object BuyingPartyContactName;
    private Object BuyingPartyContactNumber;
    private Object BuyingPartyContactFirstName;
    private Object BuyingPartyContactLastName;
    private Object BuyingPartyContactMiddleName;
    private Object BuyingPartyContactNameSuffix;
    private Object BuyingPartyContactTitle;
    private Object PreferredSoldToContactPointId;
    private Object CustomerPONumber;
    private Object TransactionTypeCode;
    private Object TransactionType;
    private Boolean SubstituteAllowedFlag;
    private String PackingInstructions;
    private String ShippingInstructions;
    private Boolean ShipsetFlag;
    private Boolean PartialShipAllowedFlag;
    private String RequestedShipDate;
    private Object RequestedArrivalDate;
    private Object LatestAcceptableShipDate;
    private Object LatestAcceptableArrivalDate;
    private Object EarliestAcceptableShipDate;
    private Object ShipmentPriorityCode;
    private Object ShipmentPriority;
    private Integer ShippingCarrierId;
    private String ShippingCarrier;
    private String ShippingServiceLevelCode;
    private String ShippingServiceLevel;
    private String ShippingModeCode;
    private String ShippingMode;
    private String FOBPointCode;
    private String FOBPoint;
    private Object DemandClassCode;
    private Object DemandClass;
    private Object FreightTermsCode;
    private Object FreightTerms;
    private Integer RequestedFulfillmentOrganizationId;
    private String RequestedFulfillmentOrganizationCode;
    private String RequestedFulfillmentOrganizationName;
    private Object SupplierId;
    private Object SupplierName;
    private Object SupplierSiteId;
    private Integer PaymentTermsCode;
    private String PaymentTerms;
    private Object SalespersonId;
    private Object Salesperson;
    private Object PricedOn;
    private String TransactionalCurrencyCode;
    private String TransactionalCurrencyName;
    private Object AppliedCurrencyCode;
    private Object CurrencyConversionDate;
    private Object CurrencyConversionRate;
    private Object CurrencyConversionType;
    private String PricingSegmentCode;
    private String PricingSegment;
    private Object PricingStrategyId;
    private Object PricingStrategyName;
    private Boolean AllowCurrencyOverrideFlag;
    private Object SegmentExplanationMessageName;
    private String PricingSegmentExplanation;
    private Object StrategyExplanationMessageName;
    private Object PricingStrategyExplanation;
    private Object SalesChannelCode;
    private Object SalesChannel;
    private Object Comments;
    private String StatusCode;
    private String Status;
    private Boolean OnHoldFlag;
    private Boolean CanceledFlag;
    private Object CancelReasonCode;
    private Object CancelReason;
    private Object RequestedCancelDate;
    private Integer RequestingBusinessUnitId;
    private String RequestingBusinessUnitName;
    private Integer RequestingLegalEntityId;
    private String RequestingLegalEntity;
    private Boolean FreezePriceFlag;
    private Boolean FreezeShippingChargeFlag;
    private Boolean FreezeTaxFlag;
    private Boolean SubmittedFlag;
    private String SubmittedBy;
    private String SubmittedDate;
    private Object TransactionDocumentTypeCode;
    private Boolean PreCreditCheckedFlag;
    private String RevisionSourceSystem;
    private Integer SourceTransactionRevisionNumber;
    private Object TradeComplianceResultCode;
    private Object TradeComplianceResult;
    private String LastUpdatedBy;
    private String LastUpdateDate;
    private String CreatedBy;
    private String CreationDate;
    private Boolean OpenFlag;
    private Object OrigSystemDocumentReference;
    private String OrderKey;
    private Object AppliedCurrencyName;
    private Object SupplierSiteName;
    private Object MessageText;
    private Object AgreementHeaderId;
    private Object AgreementNumber;
    private Object AgreementVersionNumber;
}
