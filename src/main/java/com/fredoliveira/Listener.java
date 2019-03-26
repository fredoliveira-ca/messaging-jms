package com.fredoliveira;

import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.stereotype.Component;

import javax.jms.ConnectionFactory;

@Component
public class Listener {

    @Bean
    public JmsListenerContainerFactory<?> mailFactory(ConnectionFactory connectionFactory,
                                                      DefaultJmsListenerContainerFactoryConfigurer configurer) {

        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();

        configurer.configure(factory, connectionFactory);

        return factory;
    }

}
