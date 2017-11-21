package com.stackroute.websocket.messenger;

import java.util.concurrent.CountDownLatch;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import com.stackroute.websocket.model.ChatMessage;

public class Listener {


	  private CountDownLatch latch = new CountDownLatch(1);

	  public CountDownLatch getLatch() {
	    return latch;
	  }
	
	  private static Logger logger = LogManager.getLogger("MethodLogger.class");
	 
	 
	  @Autowired
	  SimpMessagingTemplate template;
	  
	  @KafkaListener(topics = "urls", 
			  containerFactory = "kafkaListenerContainerFactory") 
			public void messageListener(String message) {
			    logger.info("message" + message);
			    latch.countDown();
			    this.template.convertAndSend("/chatbot", new ChatMessage(message, "~chatbot") );
			    
			} 
	
	  
	
	
}
