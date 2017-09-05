package cn.machine.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.machine.dao.LightDao;
import cn.machine.pojo.Car;
import cn.machine.service.LightService;

@Service
public class LightServiceImpl implements LightService {
	@Resource
	private LightDao lightDao;
	@Override
	public List<Car> listPage(Integer pageSize, Integer offset) {
		Map<String,Object> param= new HashMap<>();
		param.put("pageSize", pageSize);
		param.put("offset", offset);
		List<Car> cars=lightDao.listPage(param);
		return cars;
	}
	@Override
	public List<Car> listAll() {
		List<Car>list=lightDao.listAll();
		return list;
	}
	@Override
	public List<Car> serchid(int id) {
		return this.lightDao.serchid(id);
	}

	@Override
	public void update(Car car) {
		lightDao.update(car);

	}

}
