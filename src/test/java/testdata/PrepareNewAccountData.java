package testdata;

import modals.NewAccountModel;
import utils.FakeMessageGenerator;

public class PrepareNewAccountData {
    public static NewAccountModel getValidData(){
        return NewAccountModel.builder()
                .accountName(FakeMessageGenerator.generateAccountNme())
                .phone(FakeMessageGenerator.generatePhone())
                .type("Analyst")
                .industry("Banking")
                .fax(FakeMessageGenerator.generateFax())
                .website(FakeMessageGenerator.generateWebsite())
                .employees(FakeMessageGenerator.generateAEmployees())
                .annualRevenue(FakeMessageGenerator.generateAnnualRevenue())
                .description(FakeMessageGenerator.generateDescription())
                .billingStreet(FakeMessageGenerator.generatebillingStreet())
                .shippingStreet(FakeMessageGenerator.generateshippingStreet())
                .billingCity(FakeMessageGenerator.generatesBillingCity())
                .billingState(FakeMessageGenerator.generatesBillingState())
                .shippingCity(FakeMessageGenerator.generatesShippingCity())
                .shippingState(FakeMessageGenerator.generatesShippingState())
                .billingZip(FakeMessageGenerator.generatesBillingZip())
                .billingCountry(FakeMessageGenerator.generatesBillingCountry())
                .shippingZip(FakeMessageGenerator.generatesShippingZip())
                .shippingCountry(FakeMessageGenerator.generatesShippingCountry())
                .build();
    }
}
