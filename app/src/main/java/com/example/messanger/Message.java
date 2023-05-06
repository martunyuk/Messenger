package com.example.messanger;

public class Message {
    String user_name, message_text;

    public Message(String user_name, String message_text) {
        this.user_name = user_name;
        this.message_text = message_text;
    }

    public Message() {
    }

    public String getUser_name() {
        return user_name;
    }

    public String getMessage_text() {
        return message_text;
    }
}
