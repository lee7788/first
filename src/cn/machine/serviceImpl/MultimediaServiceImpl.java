package cn.machine.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.machine.dao.MultimediaDao;
import cn.machine.pojo.Car;
import cn.machine.service.MultimediaService;

@Service
public class MultimediaServiceImpl implements MultimediaService {
	@Resource
	private MultimediaDao multimediaDao;
	@Override
	public List<Car> listPage(Integer pageSize, Integer offset) {
		Map<String,Object> param= new HashMap<>();
		param.put("pageSize", pageSize);
		param.put("offset", offset);
		List<Car> cars=multimediaDao.listPage(param);
		return cars;
	}
	@Override
	public List<Car> listAll() {
		List<Car>list=multimediaDao.listAll();
		return list;
	}
	@Override
	public List<Car> serchid(int id) {
		return this.multimediaDao.serchid(id);
	}

	@Override
	public void update(Car car) {
		multimediaDao.update(car);

	}

}
