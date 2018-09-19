package com.aws.singhnet.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {
	private static Logger LOG = LoggerFactory.getLogger(MailServiceImpl.class);
	@Autowired
	private MailSender mailSender;

	@Override
	public void sendSimpleMessage(String toAddress, String subject, String textMessage) {
		LOG.info("Sending Email Message To: {} ,Subject: {} Message: {}",toAddress,subject,textMessage);
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(toAddress);
		message.setSubject(subject);
		message.setText(textMessage);
		mailSender.send(message);
	}

}
