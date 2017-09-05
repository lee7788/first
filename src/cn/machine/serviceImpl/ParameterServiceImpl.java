package cn.machine.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.machine.dao.ParameterDao;
import cn.machine.pojo.Car;
import cn.machine.service.ParameterService;

@Service
public class ParameterServiceImpl implements ParameterService {
	@Resource
	private ParameterDao paramterdao;

	@Override
	public List<Car> listPage(Integer pageSize, Integer offset) {
		Map<String,Object> param= new HashMap<>();
		param.put("pageSize", pageSize);
		param.put("offset", offset);
		List<Car> cars=paramterdao.listPage(param);
		return cars;
	}

	@Override
	public List<Car> listAll() {
		List<Car>list=paramterdao.listAll();
		return list;
	}

}


