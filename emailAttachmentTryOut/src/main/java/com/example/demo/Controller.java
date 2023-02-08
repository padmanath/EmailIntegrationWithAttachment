package com.example.demo;

import org.apache.naming.factory.SendMailFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	private EmailSenderService emailSenderService;

	public String sendMailAttachment(@RequestBody EmailSenderService emailSenderService ) {
		return.emailSenderService.sendMailAttachme
		
	}
	
	
}
