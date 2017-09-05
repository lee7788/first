package cn.machine.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.machine.dao.UserDao;
import cn.machine.pojo.Menu;
import cn.machine.pojo.User;
import cn.machine.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
	
	@Override
	public User checkLogin(String username, String password) {
		return userDao.checkLogin(username, password);
	}

	@Override
	public List<User> listPage(Integer pageSize, Integer offset) {
		List<User> users = userDao.listPage(pageSize, offset);
		return users;
	}

	@Override
	public List<User> listAll() {
		List<User> users = userDao.listAll();
		return users;
	}

	@Override
	public List<User> searchid(int id) {
		List<User> users = userDao.searchid(id);
		return users;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public void delete(int id) {
		userDao.delete(id);
		
	}
	
}
