package cn.machine.service;

import java.util.List;

import cn.machine.pojo.Menu;
import cn.machine.pojo.Power;
import cn.machine.pojo.User;

public interface PowerService {

List<Power> listPage(Integer pageSize, Integer offset);//查询方法返回
	
	List<Power> listAll();
	
	List<Power> searchid(int id);
	//新增
	public void add(Power power);
	//更新
	public void update(Power power);
	//删除
	public void delete(int id);
	
	List<User> showAll();
	
	List<Menu> showAll1();
}
