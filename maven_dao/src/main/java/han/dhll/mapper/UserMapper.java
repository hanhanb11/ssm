package han.dhll.mapper;

import java.util.List;

import han.dhll.dao.User;

public interface UserMapper {
	
	/**
	 * 查询全部
	 * @return
	 */
	public List<User> findAll();

}
