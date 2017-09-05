package cn.machine.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.machine.dao.InternalDao;
import cn.machine.pojo.Car;
import cn.machine.service.InternalService;


@Service
public class InternalServiceImpl implements InternalService {
	@Resource
	private InternalDao internalDao;
	@Override
	public List<Car> listPage(Integer pageSize, Integer offset) {
		Map<String,Object> param= new HashMap<>();
		param.put("pageSize", pageSize);
		param.put("offset", offset);
		List<Car> cars=internalDao.listPage(param);
		return cars;
	}
	@Override
	public List<Car> listAll() {
		List<Car>list=internalDao.listAll();
		return list;
	}
	@Override
	public List<Car> serchid(int id) {
		return this.internalDao.serchid(id);
	}

	@Override
	public void update(Car car) {
		internalDao.update(car);

	}

}
