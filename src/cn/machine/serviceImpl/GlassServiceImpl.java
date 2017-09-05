package cn.machine.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.machine.dao.GlassDao;
import cn.machine.pojo.Car;
import cn.machine.service.GlassService;

@Service
public class GlassServiceImpl implements GlassService {
	@Resource
	private GlassDao glassDao;
	@Override
	public List<Car> listPage(Integer pageSize, Integer offset) {
		Map<String,Object> param= new HashMap<>();
		param.put("pageSize", pageSize);
		param.put("offset", offset);
		List<Car> cars=glassDao.listPage(param);
		return cars;
	}
	@Override
	public List<Car> listAll() {
		List<Car>list=glassDao.listAll();
		return list;
	}
	@Override
	public List<Car> serchid(int id) {
		return this.glassDao.serchid(id);
	}

	@Override
	public void update(Car car) {
		glassDao.update(car);

	}

}
