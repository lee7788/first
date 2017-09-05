package cn.machine.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.machine.dao.EngineDao;
import cn.machine.pojo.Car;
import cn.machine.service.EngineService;
@Service
public class EngineServiceImp implements EngineService {
@Resource
  private EngineDao engindao;
	@Override
	public List<Car> listPage(Integer pageSize, Integer offset) {
		Map<String,Object> param=new HashMap<>();
		param.put("pageSize", pageSize);
		param.put("offset", offset);
		List<Car> cars= engindao.listPage(param);
		return cars;
	}

	@Override
	public List<Car> listAll() {
		List<Car>list=engindao.listAll();
		return list;
	}

	@Override
	public List<Car> serchid(Integer tId) {
		List<Car> cars=engindao.serchid(tId);
		return cars;
	}

	@Override
	public void typeupdate(Car car) {
		engindao.typeupdate(car);

	}

}
