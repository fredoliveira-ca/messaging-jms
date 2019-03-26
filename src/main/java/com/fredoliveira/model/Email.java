package com.fredoliveira.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Email implements Serializable {

    private String to;
    private String body;

    @Override
    public String toString() {
        return String.format("%s sended an email with the body (%s)", getTo(), getBody());
    }

}
