package cn.machine.service;

import java.util.List;

import cn.machine.pojo.Car;
import cn.machine.pojo.CarBrand;
import cn.machine.pojo.Info;
import cn.machine.pojo.Series;
import cn.machine.pojo.User;

public interface InformationService {

	List<Info> listPage(Integer pageSize, Integer offset);//查询方法返回
	List<Info> listAll();

	List<Info> findById(Integer id);


	//新增
	public void add(Info info);
	//更新
	public void update(Info info);
	//删除
	public void delete(Integer id);

	List<User> showAll();
	List<CarBrand> showAll1();
	List<Car> showAll2();
	List<Series> showAll3();
}
