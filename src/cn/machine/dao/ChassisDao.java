package cn.machine.dao;

import java.util.List;
import java.util.Map;

import cn.machine.pojo.Car;

public interface ChassisDao {
	List<Car> listPage(Map param);//查询方法返回
	List<Car> listAll();

	List<Car> serchid(Integer tId);
	//更新
	public void typeupdate(Car car);

}
