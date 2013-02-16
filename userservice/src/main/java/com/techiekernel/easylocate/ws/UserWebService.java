package com.techiekernel.easylocate.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.techiekernel.easylocate.pojo.User;
import com.techiekernel.easylocate.service.UserService;

@Controller
@RequestMapping("/api/user")
public class UserWebService {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/{userId}", method = RequestMethod.GET, headers = "Accept=application/json", produces = { "application/json" })
	@ResponseBody
	public User getUser(@PathVariable int userId) {
		return userService.getUser(userId);
	}

	@RequestMapping(method = RequestMethod.GET, headers = "Accept=application/json", produces = { "application/json" })
	@ResponseBody
	public List<User> getUsers() {
		return userService.getUsers();
	}

	@RequestMapping(method = RequestMethod.POST, headers = "Accept=application/json", produces = { "application/json" }, consumes = { "application/json" })
	@ResponseBody
	public boolean createUser(@RequestBody User user) {
		return userService.saveOrUpdateUser(user);
	}

	@RequestMapping(value = "/{userId}", method = RequestMethod.PUT, headers = "Accept=application/json", produces = { "application/json" }, consumes = { "application/json" })
	@ResponseBody
	public boolean editFoobar(@RequestBody User user, @PathVariable int userId) {
		if (user.getUserId() == userId)
			return userService.saveOrUpdateUser(user);
		else
			return false;
	}

	@RequestMapping(value = "/{userId}", method = RequestMethod.DELETE, headers = "Accept=application/json", produces = { "application/json" })
	@ResponseBody
	public boolean deleteUser(@PathVariable int userId) {
		return userService.deleteUser(userId);
	}

}
