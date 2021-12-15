package com.locationManagement.locationWeb.Utility;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtilityImplementation implements EmailUtility {

	@Autowired
	private JavaMailSender javaMailSender;
	
	@Override
	public void sendEmail(String clientEmailAddress, String emailSubject, String emailBody) {
		// TODO Auto-generated method stub
		MimeMessage message = this.javaMailSender.createMimeMessage();
		MimeMessageHelper messageHelper = new MimeMessageHelper(message);
		try {
			messageHelper.setTo(clientEmailAddress);
			messageHelper.setSubject(emailSubject);
			messageHelper.setText(emailBody);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.javaMailSender.send(message);

	}

}
