package cn.machine.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import cn.machine.dao.GearboxDao;
import cn.machine.pojo.Car;
import cn.machine.service.GearboxService;
@Service
public class GearboxServiceImp implements GearboxService {
@Resource
private  GearboxDao  gearboxdao;
	@Override
	public List<Car> listPage(Integer pageSize, Integer offset) {
		
		
		Map<String,Object> param=new HashMap<String,Object>();
		param.put("pageSize", pageSize);
		param.put("offset", offset);
		List<Car> cars=gearboxdao.listPage(param);
		return cars;
	}

	@Override
	public List<Car> listAll() {
		List<Car> cars=gearboxdao.listAll();
		return cars;
	}

	@Override
	public List<Car> serchid(Integer tId) {
		List<Car> cars=gearboxdao.serchid(tId);
		return cars;
	}

	@Override
	public void typeupdate(Car car) {
		gearboxdao.typeupdate(car);

	}

}
