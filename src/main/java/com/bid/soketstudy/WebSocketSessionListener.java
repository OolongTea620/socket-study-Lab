package com.bid.soketstudy;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectEvent;
@Component
public class WebSocketSessionListener implements ApplicationListener {
    @Override
    @EventListener
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("WebSocket session connected: " + event.getSource().toString());

    }
}
