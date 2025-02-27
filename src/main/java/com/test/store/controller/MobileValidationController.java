package com.test.store.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.test.store.model.MobileRequest;
import com.test.store.model.ValidationResponse;
import com.test.store.service.MobileNumberService;

//import javax.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MobileValidationController {
    
    @Autowired
    private MobileNumberService mobileNumberService;
    
    @PostMapping("/validate")
    public ValidationResponse validateMobile(@RequestBody MobileRequest request) {
        String mobileNumber = request.getMobile();
        
        if (mobileNumber == null || !mobileNumber.matches("\\d{10}")) {
            return new ValidationResponse(false, "Invalid mobile number. Please enter a 10-digit number.");
        }
        
        mobileNumberService.saveMobileNumber(mobileNumber);
        return new ValidationResponse(true, "Mobile number saved successfully.");
    }
}