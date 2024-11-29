package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    private final MessagingService messagingService;

    public MessageController(MessagingService messagingService) {
        this.messagingService = messagingService;
    }

    @PostMapping("/queue")
    public void sendToQueue(@RequestParam String message) {
        messagingService.sendToQueue(message);
    }

    @PostMapping("/topic")
    public void sendToTopic(@RequestParam String message) {
        messagingService.sendToTopic(message);
    }
}
