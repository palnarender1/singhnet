package com.aws.singhnet.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aws.singhnet.model.User;

@RestController
@RequestMapping("/usermgmt")
public class UserMgmtController {
	private static final Logger LOG = LoggerFactory.getLogger(UserMgmtController.class);

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
	public User getUser(@PathVariable(name = "recordId") int recordId) {

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

		List<User> userList = new ArrayList<User>();
		for (int i = 0; i < 10; i++) {
			User user = new User();
			user.setRecordId(1);
			user.setEmail("pal.narender1@gmail.como");
			user.setFirstName("Narender");
			user.setLastName("Singh");
			userList.add(user);
		}
		return userList;

	}

}
