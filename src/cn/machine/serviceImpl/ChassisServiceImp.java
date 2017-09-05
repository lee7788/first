package cn.machine.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.machine.dao.ChassisDao;

import cn.machine.pojo.Car;
import cn.machine.service.ChassisService;
import cn.machine.service.GearboxService;
@Service
public class ChassisServiceImp implements ChassisService {
@Resource
 private ChassisDao chassisDao;
	@Override
	public List<Car> listPage(Integer pageSize, Integer offset) {
		
		
		Map<String,Object> param=new HashMap<String,Object>();
		param.put("pageSize", pageSize);
		param.put("offset", offset);
		List<Car> cars=chassisDao.listPage(param);
		return cars;
	}

	@Override
	public List<Car> listAll() {
		List<Car> cars=chassisDao.listAll();
		return cars;
	}

	@Override
	public List<Car> serchid(Integer tId) {
		List<Car> cars=chassisDao.serchid(tId);
		return cars;
	}

	@Override
	public void typeupdate(Car car) {
		chassisDao.typeupdate(car);

	}

}
