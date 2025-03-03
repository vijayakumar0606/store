package com.test.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.store.repository.*;
import com.test.store.model.MobileNumber;

@Service
public class MobileNumberService {
    @Autowired
    private MobileNumberRepository repository;

    public void saveMobileNumber(String mobile) {
        MobileNumber mobileNumber = new MobileNumber(mobile);
        repository.save(mobileNumber);
    }
}