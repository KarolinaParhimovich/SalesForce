package utils;

import com.github.javafaker.Faker;

public class FakeMessageGenerator {
    public static String generateAccountNme(){
        return new Faker().company().name();
    }
    public static String generatePhone(){
        return new Faker().phoneNumber().phoneNumber();
    }
    public static String generateFax(){
        return new Faker().phoneNumber().phoneNumber();
    }
    public static String generateWebsite(){
        return new Faker().company().url();
    }
    public static String generateAEmployees(){
        return new Faker().company().profession();
    }
    public static String generateAnnualRevenue(){
        return new Faker().commerce().price();
    }
    public static String generateDescription(){
        return new Faker().company().catchPhrase();
    }
    public static String generatebillingStreet(){
        return new Faker().address().streetName();
    }
    public static String generateshippingStreet(){
        return new Faker().address().streetName();
    }
    public static String generatesBillingCity(){
        return new Faker().address().cityName();
    }
    public static String generatesBillingState(){
        return new Faker().address().country();
    }
    public static String generatesShippingCity(){
        return new Faker().address().cityName();
    }
    public static String generatesShippingState(){
        return new Faker().address().country();
    }
    public static String generatesBillingZip(){
        return new Faker().address().zipCode();
    }
    public static String generatesBillingCountry(){
        return new Faker().address().country();
    }
    public static String generatesShippingZip(){
        return new Faker().address().zipCode();
    }
    public static String generatesShippingCountry(){
        return new Faker().address().country();
    }
}
