package br.com.nathanfiorito.hexa.messaging.adapters.in.controller.handler;

import br.com.nathanfiorito.hexa.messaging.application.core.exceptions.CustomerNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {


    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<StandardError> customerNotFoundExceptionHandler(
            CustomerNotFoundException exception,
            HttpServletRequest request
    ) {
        StandardError standardError = new StandardError(
                System.currentTimeMillis(),
                HttpStatus.NOT_FOUND.value(),
                exception.getMessage(),
                request.getContextPath()
                );

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(standardError);
    }
}
