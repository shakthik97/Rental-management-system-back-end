package org.example.exceptions;

import org.example.responseObjects.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

public ResponseEntity<ErrorResponse> handleCustomerNotFoundException(CustomerNotFoundException message){
    ErrorResponse res = ErrorResponse.builder().errorMessage(message.getMessage()).status("FAILD").build();
    return ResponseEntity.ok().body(res);
}
}
