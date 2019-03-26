package com.fredoliveira;

import com.fredoliveira.model.Email;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
@EnableJms
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);

        log.info("Send: Sending an email message.");

        jmsTemplate.convertAndSend("mailbox", new Email("fredoliveira@mail.com", "Hi"));

        log.info("Email has been sent.");
    }
}
