package cn.machine.service;

import java.util.List;

import cn.machine.pojo.CarBrand;

public interface CarBrandService {
	List<CarBrand> listPage(Integer pageSize, Integer offset);//查询方法返回
	List<CarBrand> listAll();
	List<CarBrand> searchid(Integer id);
	public void add(CarBrand carBrand);
	public void update(CarBrand carBrand);
	public void delete(Integer id);
}
