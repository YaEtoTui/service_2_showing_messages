package com.example.service_2_showing_messages.service;

import com.example.service_2_showing_messages.domain.event.CreatedMessageListener;

public interface RabbitListenerService {
    public void listen(CreatedMessageListener messageListener);
}
