package com.caseshop.Entity;

import javax.persistence.*;

@Entity
public class PhoneCase {

    @Id
    @GeneratedValue
    private long phoneCaseId;
    public String phoneCaseManufacturer;
    public String phoneCaseModel;
    public long quantity;


    public long getPhoneCaseId() {
        return phoneCaseId;
    }

    public void setPhoneCaseId(long phoneCaseId) {
        this.phoneCaseId = phoneCaseId;
    }


    public String getPhoneCaseManufacturer() {
        return phoneCaseManufacturer;
    }

    public void setPhoneCaseManufacturer(String phoneCaseManafacturer) {
        this.phoneCaseManufacturer = phoneCaseManafacturer;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PHONE_ID")
    private Phone phone;

    public String getPhone() {
        return phone.getPhoneModel();
    }

    public void setPhone(Phone phones) {
        this.phone = phones;
    }
}
