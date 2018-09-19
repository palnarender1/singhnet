package com.aws.singhnet.services;

public interface MailService {
	
	public void sendSimpleMessage(String toAddress,String subject,String message);

}
