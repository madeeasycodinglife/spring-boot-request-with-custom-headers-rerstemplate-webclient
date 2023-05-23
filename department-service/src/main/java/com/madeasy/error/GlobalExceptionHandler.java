/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.madeasy.error;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author PABITRA
 */

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler(DepartmentNotFoundException.class)
    public ResponseEntity<ApiError> handleDepartmentNotFound(DepartmentNotFoundException exception,
                                                             WebRequest request,
                                                             Exception ex) {
        ApiError error;
        error = new ApiError(
                exception.getMessage(),
                HttpStatus.NOT_FOUND,
                LocalDateTime.now(),
                request.toString());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}
