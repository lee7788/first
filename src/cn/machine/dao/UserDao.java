package cn.machine.dao;

import java.util.List;

import cn.machine.pojo.User;

public interface UserDao {
	
	//验证用户登录
	public User checkLogin(String username, String password);

	List<User> listPage(Integer pageSize, Integer offset);//查询方法返回
	
	List<User> listAll();
	
	List<User> searchid(int id);
	//新增
	public void add(User user);
	//更新
	public void update(User user);
	//删除
	public void delete(int id);
	
	
	
}