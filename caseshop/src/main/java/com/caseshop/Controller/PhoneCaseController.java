package com.caseshop.Controller;

import com.caseshop.Entity.Phone;
import com.caseshop.Entity.PhoneCase;
import com.caseshop.Entity.request.AddPhoneCaseRequest;
import com.caseshop.Repository.PhoneCaseRepository;
import com.caseshop.Repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/phoneCases")
public class PhoneCaseController {

    private PhoneCaseRepository phoneCaseRepository;
    private PhoneRepository phoneRepository;

    @Autowired
    public PhoneCaseController(PhoneCaseRepository phoneCaseRepository, PhoneRepository phoneRepository) {
        this.phoneCaseRepository = phoneCaseRepository;
        this.phoneRepository = phoneRepository;
    }

    @RequestMapping(value = "/get")
    public List<PhoneCase> findAllPhoneCases() {
        return phoneCaseRepository.findAll();
    }

    @RequestMapping(value = "/postPhoneCase")
    public void addPhoneCase(@RequestBody AddPhoneCaseRequest addPhoneCaseRequest ){

        Phone phone = getPhone(addPhoneCaseRequest.getPhone());
        PhoneCase phoneCase = new PhoneCase();
        phoneCase.setPhoneCaseManufacturer(addPhoneCaseRequest.getPhoneCaseManufacturer());
        phoneCase.setPhoneCaseModel(addPhoneCaseRequest.getPhoneCaseModel());
        phoneCase.setPhone(phone);
        phoneCase.setQuantity(addPhoneCaseRequest.getQuantity());
        phoneCaseRepository.save(phoneCase);

    }

    private Phone getPhone(long id){
        return phoneRepository.getOne(id);
    }

    @RequestMapping(path = "/getPhoneCaseByPhoneModel/{phoneId}")
    public List<PhoneCase> getPhoneCaseForPhoneModel(@PathVariable long phoneId){
        return phoneCaseRepository.findAllByPhonePhoneModel(getPhone(phoneId).getPhoneModel());

    }
}
