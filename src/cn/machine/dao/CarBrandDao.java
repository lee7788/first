package cn.machine.dao;

import java.util.List;


import cn.machine.pojo.CarBrand;

public interface CarBrandDao {
	List<CarBrand> listPage(Integer pageSize, Integer offset);//查询方法返回
	List<CarBrand> listAll();
	List<CarBrand> searchid(Integer id);
	//新增
	public void add(CarBrand carBrand);
	//更新
	public void update(CarBrand carBrand);
	//删除
	public void delete(Integer id);
}
