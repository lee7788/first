package cn.machine.service;

import java.util.List;

import cn.machine.pojo.Car;

public interface ParameterService {

	//分页
		List<Car> listPage(Integer pageSize, Integer offset);
		//查询所有
		List<Car> listAll();
}
