package org.example.services;

import java.util.ArrayList;
import java.util.List;

public class MessageService {
    private final List<String> messages = new ArrayList<>();

    public void addMessage(String message) {
        messages.add(message);
    }

    public List<String> getMessages() {
        return messages;
    }
}