/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.madeasy.error;

import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 *
 * @author PABITRA
 */
public class ApiError {

    private String message;
    private HttpStatus httpStatus;
    private LocalDateTime timeStamp;
    private String pathAndIpAddress;


    public ApiError(String message, HttpStatus httpStatus, LocalDateTime timeStamp, String pathAndIpAddress) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.timeStamp = timeStamp;
        this.pathAndIpAddress = pathAndIpAddress;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getPathAndIpAddress() {
        return pathAndIpAddress;
    }

    public void setPathAndIpAddress(String pathAndIpAddress) {
        this.pathAndIpAddress = pathAndIpAddress;
    }

    @Override
    public String toString() {
        return "ApiError{" + "message=" + message + ", httpStatus=" + httpStatus + ", timeStamp=" + timeStamp + ", pathAndIpAddress=" + pathAndIpAddress + '}';
    }

 

    
}
