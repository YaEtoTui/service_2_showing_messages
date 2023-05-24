package com.example.service_2_showing_messages.service.impl;

import com.example.service_2_showing_messages.domain.event.CreatedMessageListener;
import com.example.service_2_showing_messages.service.RabbitListenerService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class RabbitListenerServiceImpl implements RabbitListenerService {
    @Override
    @RabbitListener(queues = {"message.queue"})
    public void listen(@Payload CreatedMessageListener messageListener) {
        System.out.println(messageListener.getMessage());
    }
}
