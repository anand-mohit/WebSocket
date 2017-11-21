package com.stackroute.websocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.stackroute.websocket.model.ChatMessage;


@Controller
public class ChatController {

    @MessageMapping("/websocket")
    @SendTo("/topic/chatbot")
    public ChatMessage sendMessage(@Payload ChatMessage chatMessage) {
        return chatMessage;
    }



}