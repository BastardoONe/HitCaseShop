package com.caseshop.Controller;

import com.caseshop.Entity.Phone;
import com.caseshop.Entity.request.AddPhoneRequest;
import com.caseshop.Repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/phones")
public class PhoneController {

    private PhoneRepository phoneRepository;



    @Autowired
    public PhoneController(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    @RequestMapping(value = "/get")
    public List<Phone> findAllPhones() {
        return phoneRepository.findAll();
    }


    @RequestMapping(value = "/postPhone")
    public void addPhone(@RequestBody AddPhoneRequest addPhoneRequest ){

        Phone phone = new Phone();
        phone.setPhoneManufacturer(addPhoneRequest.getPhoneManufacturer());
        phone.setPhoneModel(addPhoneRequest.getPhoneModel());
        phoneRepository.save(phone);

    }


}
