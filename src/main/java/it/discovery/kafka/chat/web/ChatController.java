package it.discovery.kafka.chat.web;

import it.discovery.kafka.chat.producer.v2.ChatProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("chats")
@RequiredArgsConstructor
public class ChatController {

    private final ChatProducer chatProducer;

    @PostMapping("/{name}")
    public void sendMessage(@PathVariable String name) {
        chatProducer.createChat(name);
    }
}
