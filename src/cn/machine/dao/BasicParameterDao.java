package cn.machine.dao;

import java.util.List;
import java.util.Map;

import cn.machine.pojo.Car;

public interface BasicParameterDao {
	List<Car> listPage(Integer pageSize, Integer offset);//查询方法返回
	List<Car> listAll();
//	List<Car> listPage(Map<String, Object> param);
	public void  typeadd(Car car);
	Car serchid(Integer tId);
	//更新
	public void typeupdate(Car car);
	//删除
	public void  delete1(Integer tId);
}
