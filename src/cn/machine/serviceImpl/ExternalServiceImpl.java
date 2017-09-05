package cn.machine.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.machine.dao.ExternalDao;
import cn.machine.pojo.Car;
import cn.machine.service.ExternalService;


@Service
public class ExternalServiceImpl implements ExternalService {
	@Resource
	private ExternalDao externalDao;
	@Override
	public List<Car> listPage(Integer pageSize, Integer offset) {
		Map<String,Object> param= new HashMap<>();
		param.put("pageSize", pageSize);
		param.put("offset", offset);
		List<Car> cars=externalDao.listPage(param);
		return cars;
	}
	@Override
	public List<Car> listAll() {
		List<Car>list=externalDao.listAll();
		return list;
	}
	@Override
	public List<Car> serchid(int id) {
		return this.externalDao.serchid(id);
	}

	@Override
	public void update(Car car) {
		externalDao.update(car);

	}

}
