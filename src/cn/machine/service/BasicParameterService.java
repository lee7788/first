package cn.machine.service;

import java.util.List;

import cn.machine.pojo.Car;

public interface BasicParameterService {
	List<Car> listPage(Integer pageSize, Integer offset);// 查询方法返回

	List<Car> listAll();

	public void typeadd(Car car);
	Car serchid(Integer tId);
	// 更新
	public void typeupdate(Car car);

	// 删除
	public void delete1(Integer tId);
}
