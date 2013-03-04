package com.techiekernel.easylocate.ws;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

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
	public User getUser(@PathVariable int userId, HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		return userService.getUser(userId);
	}

	@RequestMapping(method = RequestMethod.GET, headers = "Accept=application/json", produces = { "application/json" })
	@ResponseBody
	public List<User> getUsers(HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		return userService.getUsers();
	}

	@RequestMapping(method = RequestMethod.POST, headers = "Accept=application/json", produces = { "application/json" }, consumes = { "application/json" })
	@ResponseBody
	public boolean createUser(@RequestBody User user,
			HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		return userService.saveOrUpdateUser(user);
	}

	@RequestMapping(value = "/{userId}", method = RequestMethod.PUT, headers = "Accept=application/json", produces = { "application/json" }, consumes = { "application/json" })
	@ResponseBody
	public boolean editFoobar(@RequestBody User user, @PathVariable int userId,
			HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		if (user.getUserId() == userId)
			return userService.saveOrUpdateUser(user);
		else
			return false;
	}

	@RequestMapping(value = "/{userId}", method = RequestMethod.DELETE, headers = "Accept=application/json", produces = { "application/json" })
	@ResponseBody
	public boolean deleteUser(@PathVariable int userId,
			HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");
		return userService.deleteUser(userId);
	}

}
