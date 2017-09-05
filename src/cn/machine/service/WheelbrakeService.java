package cn.machine.service;

import java.util.List;

import cn.machine.pojo.Car;

public interface WheelbrakeService {
	List<Car> listPage(Integer pageSize, Integer offset);// 查询方法返回

	List<Car> listAll();


	List<Car> serchid(Integer tId);
	// 更新
	public void typeupdate(Car car);

}
