package han.dhll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import han.dhll.dao.User;
import han.dhll.mapper.UserMapper;
import han.dhll.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	

	@Autowired
	private UserMapper UserMapper;
	
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return UserMapper.findAll();
	}

}
