package it.discovery.kafka.chat.producer.v2;

import java.util.concurrent.Future;

public interface ChatProducer<T> {

    Future<T> send(ChatMessage message);
}
