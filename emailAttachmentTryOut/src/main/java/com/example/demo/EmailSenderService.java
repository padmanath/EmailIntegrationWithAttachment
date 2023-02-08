package com.example.demo;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailSenderService {
	
	@Autowired
	private JavaMailSender mailSender;
	
	public void sendMailAttachment(String toemail,String body,String attachement,String subject) throws MessagingException {
		
		MimeMessage createMimeMessage = mailSender.createMimeMessage();
	    MimeMessageHelper messageHelper=new MimeMessageHelper(createMimeMessage,true);
		messageHelper.setTo(toemail);
		messageHelper.setFrom("perfectpadmanathan@gmail.com");
		messageHelper.setText(body);
		messageHelper.setSubject(subject);
		
		FileSystemResource fileSystemResource=new FileSystemResource(new File(attachement));
		messageHelper.addAttachment(fileSystemResource.getFilename(), fileSystemResource );
		mailSender.send(createMimeMessage);
		
		System.out.println("mail with attachment sent successfully");
		
	}
	

}
