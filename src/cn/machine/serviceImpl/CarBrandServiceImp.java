package cn.machine.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.machine.dao.CarBrandDao;
import cn.machine.pojo.CarBrand;
import cn.machine.service.CarBrandService;

@Service
public class CarBrandServiceImp implements CarBrandService {
@Resource
private CarBrandDao carBrandDao;

@Override
public List<CarBrand> listPage(Integer pageSize, Integer offset) {
   List<CarBrand> carBrands=carBrandDao.listPage(pageSize, offset);
	return carBrands;
}

@Override
public List<CarBrand> listAll() {
	 List<CarBrand> carBrands=carBrandDao.listAll();
	return carBrands;
}

@Override
public void add(CarBrand carBrand) {
	carBrandDao.add(carBrand);
	
}

@Override
public void update(CarBrand carBrand) {
carBrandDao.update(carBrand);
	
}

@Override
public List<CarBrand> searchid(Integer id) {
	   return this.carBrandDao.searchid(id);
}

@Override
public void delete(Integer id) {
	carBrandDao.delete(id);
}
}
