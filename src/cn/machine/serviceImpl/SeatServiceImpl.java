package cn.machine.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.machine.dao.SeatDao;
import cn.machine.pojo.Car;
import cn.machine.service.SeatService;

@Service
public class SeatServiceImpl implements SeatService {
	@Resource
	private SeatDao seatDao;
	@Override
	public List<Car> listPage(Integer pageSize, Integer offset) {
		Map<String,Object> param= new HashMap<>();
		param.put("pageSize", pageSize);
		param.put("offset", offset);
		List<Car> cars=seatDao.listPage(param);
		return cars;
	}
	@Override
	public List<Car> listAll() {
		List<Car>list=seatDao.listAll();
		return list;
	}
	@Override
	public List<Car> serchid(int id) {
		return this.seatDao.serchid(id);
	}

	@Override
	public void update(Car car) {
		seatDao.update(car);

	}

}
