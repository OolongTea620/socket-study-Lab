package com.bid.soketstudy;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {
    @MessageMapping("/hello") // 실제 서비스는 config 때문에 /app/hello로 시지됨
    @SendTo("/topic/greetings") // 다른 서버의 종단 포인트 지정 destination
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay 1초 뒤 Greeting으로 보냄....
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }
    
}
