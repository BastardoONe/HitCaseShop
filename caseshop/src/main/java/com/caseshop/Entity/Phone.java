package com.caseshop.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Phone {

    @Id
    @GeneratedValue
    private long phoneId;

    private String phoneManufacturer;
    private String phoneModel;


    public long getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(long phoneId) {
        this.phoneId = phoneId;
    }

    public String getPhoneManufacturer() {
        return phoneManufacturer;
    }

    public void setPhoneManufacturer(String phoneManafacturer) {
        this.phoneManufacturer = phoneManafacturer;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    @OneToMany(mappedBy = "phone")
    private List<PhoneCase> phoneCase;

    public List<PhoneCase> getPhoneCase() {
        return phoneCase;
    }

    public void setPhoneCase(List<PhoneCase> phoneCase) {
        this.phoneCase = phoneCase;
    }
}
