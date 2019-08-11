package han.dhll.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import han.dhll.dao.User;
import han.dhll.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/findAall")
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userService.findAll();
	}

}
