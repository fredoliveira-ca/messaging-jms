package com.fredoliveira;

import com.fredoliveira.model.Email;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    @JmsListener(destination = "mailbox", containerFactory = "mailFactory")
    public void receiveMessage(Email email) {
        log.info("Receive: " + email);
    }
}
