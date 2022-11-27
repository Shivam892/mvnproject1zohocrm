package com.zohocrm_2.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailUtilImpl implements EmailUtil {
	
	@Autowired
    private JavaMailSender emailSender;

	@Override
	public void sendEmail(String to, String sub, String emailBody) {
		SimpleMailMessage message = new SimpleMailMessage(); 
        message.setFrom("shivamace892@gmail.com");
        message.setTo(to); 
        message.setSubject(sub); 
        message.setText(emailBody);
        emailSender.send(message);
	}

}
