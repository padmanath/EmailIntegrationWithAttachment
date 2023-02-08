package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Entity {

	String toemail;
	String body;
	String attachement;
	String subject;
	
	
	public String getToemail() {
		return toemail;
	}
	public void setToemail(String toemail) {
		this.toemail = toemail;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getAttachement() {
		return attachement;
	}
	public void setAttachement(String attachement) {
		this.attachement = attachement;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
}
