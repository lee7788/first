package cn.machine.service;

import java.util.List;
import java.util.Map;

import cn.machine.pojo.Car;

public interface AuxiliaryService {
	

	//分页
	List<Car> listPage(Integer pageSize, Integer offset);
	//查询所有
	List<Car> listAll();
	//按照id查询
	List<Car> serchid(int id);
	//更新
	public void update(Car car);
	
}
