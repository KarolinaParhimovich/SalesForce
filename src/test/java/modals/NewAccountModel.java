package modals;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NewAccountModel {
    private String accountName;
    private String phone;
    private String type;
    private String industry;
    private String fax;
    private String website;
    private String employees;
    private String annualRevenue;
    private String description;
    private String billingStreet;
    private String shippingStreet;
    private String billingCity;
    private String billingState;
    private String shippingCity;
    private String shippingState;
    private String billingZip;
    private String billingCountry;
    private String shippingZip;
    private String shippingCountry;
}
