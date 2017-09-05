package cn.machine.dao;

import java.util.List;
import java.util.Map;

import cn.machine.pojo.Menu;
import cn.machine.pojo.Power;
import cn.machine.pojo.User;

public interface PowerDao {

	List<Power> listPage(Map param);//查询方法返回
	
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
