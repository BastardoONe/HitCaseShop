package com.caseshop.Entity.request;

import com.caseshop.Entity.Phone;

public class AddPhoneCaseRequest {

    private String phoneCaseManufacturer;
    private String phoneCaseModel;
    private long quantity;
    private long phone;

    public String getPhoneCaseManufacturer() {
        return phoneCaseManufacturer;
    }

    public void setPhoneCaseManufacturer(String phoneCaseManufacturer) {
        this.phoneCaseManufacturer = phoneCaseManufacturer;
    }

    public String getPhoneCaseModel() {
        return phoneCaseModel;
    }

    public void setPhoneCaseModel(String phoneCaseModel) {
        this.phoneCaseModel = phoneCaseModel;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
