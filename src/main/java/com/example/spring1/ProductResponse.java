package com.example.spring1;

import java.time.LocalDateTime;

public class ProductResponse<T> {
    private LocalDateTime dateTime;
    private Integer status;
    private String message;
    private T payload;

    public ProductResponse() {
    }

    public ProductResponse(LocalDateTime dateTime, Integer status, String message, T payload) {
        this.dateTime = dateTime;
        this.status = status;
        this.message = message;
        this.payload = payload;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }
}
