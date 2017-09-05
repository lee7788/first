package cn.machine.serviceImpl;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import cn.machine.dao.CarbodyDao;
import cn.machine.pojo.Car;

import cn.machine.service.CarbodyService;
@Service
public class CarbodyServiceImp implements CarbodyService {
@Resource
  private CarbodyDao carbodyDao;

@Override
public List<Car> listPage(Integer pageSize, Integer offset) {
	List<Car> cars= carbodyDao.listPage(pageSize, offset);
	return cars;
}

@Override
public List<Car> listAll() {
	List<Car>list=carbodyDao.listAll();
	return list;
}
@Override
public void typeupdate(Car car) {
	// TODO Auto-generated method stub
	carbodyDao.typeupdate(car);
}



@Override
public List<Car> serchid(Integer tId) {
	List<Car> cars=carbodyDao.serchid(tId);
	return cars;
}
}