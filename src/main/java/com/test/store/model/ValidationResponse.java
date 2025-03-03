package com.test.store.model;

public class ValidationResponse {
    private boolean success;
    private String message;

    public ValidationResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}