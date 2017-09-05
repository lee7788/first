package cn.machine.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.machine.dao.BasicParameterDao;
import cn.machine.pojo.Car;
import cn.machine.service.BasicParameterService;
@Service
public class BasicParameterServiceImp implements BasicParameterService {
@Resource
  private BasicParameterDao  basicParameterDao;

@Override
public List<Car> listPage(Integer pageSize, Integer offset) {
	List<Car> cars= basicParameterDao.listPage(pageSize, offset);
	return cars;
}

@Override
public List<Car> listAll() {
	List<Car>list=basicParameterDao.listAll();
	return list;
}

@Override
public void typeadd(Car car) {
	 basicParameterDao.typeadd(car);
	
}

@Override
public void typeupdate(Car car) {
	// TODO Auto-generated method stub
	 basicParameterDao.typeupdate(car);
}

@Override
public void delete1(Integer tId) {
	// TODO Auto-generated method stub
	basicParameterDao.delete1(tId);
}

@Override
public Car serchid(Integer tId) {
	// TODO Auto-generated method stub
	return this.basicParameterDao.serchid(tId);
}
}
