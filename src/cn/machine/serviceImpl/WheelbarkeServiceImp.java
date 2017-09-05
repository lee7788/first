package cn.machine.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.machine.dao.WheelbrakeDao;
import cn.machine.pojo.Car;
import cn.machine.service.WheelbrakeService;
@Service
public class WheelbarkeServiceImp implements WheelbrakeService {
@Resource
 private WheelbrakeDao whellbrakedao;
	@Override
	public List<Car> listPage(Integer pageSize, Integer offset) {
		Map<String,Object> param=new HashMap<String,Object>();
		param.put("pageSize", pageSize);
		param.put("offset", offset);
		List<Car> cars=whellbrakedao.listPage(param);
		return cars;
	}

	@Override
	public List<Car> listAll() {
		List<Car> cars=whellbrakedao.listAll();
		return cars;
	}

	@Override
	public List<Car> serchid(Integer tId) {
		List<Car> cars=whellbrakedao.serchid(tId);
		return cars;
	}

	@Override
	public void typeupdate(Car car) {
		whellbrakedao.typeupdate(car);

	}

}
