package com.company;

public class VipCustomer {
    public String name;
    public String emailAddress;
    public double creditLimit;

    public VipCustomer(){
        this("Default name","Default address",2000.0);
    }

    public VipCustomer(String name,String emailAddress){
        this(name,emailAddress,2500.0);

    }

    public VipCustomer(String default_name, String default_address, double v) {
        this.name =default_name;
        this.emailAddress = default_address;
        this.creditLimit = v;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
}
