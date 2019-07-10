package com.caseshop.Repository;

import com.caseshop.Entity.PhoneCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhoneCaseRepository extends JpaRepository<PhoneCase,Long> {
    List<PhoneCase> findAllByPhonePhoneModel(String phoneManufacturer);
}
