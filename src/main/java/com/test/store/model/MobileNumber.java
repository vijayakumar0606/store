package com.test.store.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MobileNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mobile;

    public MobileNumber() {}

    public MobileNumber(String mobile) {
        this.mobile = mobile;
    }

    public Long getId() {
        return id;
    }

    public String getMobile() {
        return mobile;
    }
}
