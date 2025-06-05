package br.com.nathanfiorito.hexa.messaging.adapters.in.controller.handler;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StandardError {
    private Long timestamp;
    private Integer status;
    private String message;
    private String path;
}
