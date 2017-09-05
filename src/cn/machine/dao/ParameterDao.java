package cn.machine.dao;

import java.util.List;
import java.util.Map;

import cn.machine.pojo.Car;

public interface ParameterDao {

	//分页
	List<Car> listPage(Map param);
	//查询所有
	List<Car> listAll();
}
