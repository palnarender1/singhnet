package com.aws.singhnet.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mail.MailSender;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aws.codestar.projecttemplates.Response;
import com.aws.singhnet.model.MessageModel;
import com.aws.singhnet.model.User;
import com.aws.singhnet.services.MailService;
import com.aws.singhnet.services.UserService;

@RestController
@RequestMapping("/usermgmt")
public class UserMgmtController {
	private static final Logger LOG = LoggerFactory.getLogger(UserMgmtController.class);

	@Autowired
	private UserService userService;
	@Autowired
	private MailService mailService;

	@RequestMapping(value = "/insertUser", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public User addUser(@RequestBody User user) {

		LOG.info("Adding user into DB {}", user);
		return user;

	}

	@RequestMapping(value = "/updateUser", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public User updateUser(User user) {

		LOG.info("Updating user into DB {}", user);
		return user;

	}

	@RequestMapping(value = "/getUser/{recordID}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public User getUser(@PathVariable int recordId) {

		LOG.info("Fetching User Information with Record ID {}", recordId);
		User user = new User();
		user.setRecordId(recordId);
		user.setEmail("pal.narender1@gmail.como");
		user.setFirstName("Narender");
		user.setLastName("Singh");
		return user;

	}

	@RequestMapping(value = "/getUsers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getUsers() {
		LOG.info("Fetching all user records from DB");
		return userService.getUsers();

	}

	@RequestMapping(value = "/testEmail", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Response testEmail(@RequestBody MessageModel messageModel) {
		mailService.sendSimpleMessage(messageModel.getToAddress(), messageModel.getSubject(),messageModel.getTextMessage());
		Response response = new Response("Successfull");
		return response;

	}

}
