package cn.machine.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.machine.dao.AuxiliaryDao;
import cn.machine.pojo.Car;
import cn.machine.service.AuxiliaryService;


@Service
public class AuxiliaryServiceImpl implements AuxiliaryService {
	@Resource
	private AuxiliaryDao auxiliaryDao;
	@Override
	public List<Car> listPage(Integer pageSize, Integer offset) {
		Map<String,Object> param= new HashMap<>();
		param.put("pageSize", pageSize);
		param.put("offset", offset);
		List<Car> cars=auxiliaryDao.listPage(param);
		return cars;
	}
	@Override
	public List<Car> listAll() {
		List<Car>list=auxiliaryDao.listAll();
		return list;
	}
	@Override
	public List<Car> serchid(int id) {
		return this.auxiliaryDao.serchid(id);
	}

	@Override
	public void update(Car car) {
		auxiliaryDao.update(car);

	}

}
