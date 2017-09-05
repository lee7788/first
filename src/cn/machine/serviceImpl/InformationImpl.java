package cn.machine.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.machine.dao.InformationDao;
import cn.machine.pojo.Car;
import cn.machine.pojo.CarBrand;
import cn.machine.pojo.Info;
import cn.machine.pojo.Series;
import cn.machine.pojo.User;
import cn.machine.service.InformationService;

@Service
public class InformationImpl implements InformationService {

	@Resource
	public InformationDao informationDao;
	@Override
	public List<Info> listPage(Integer pageSize, Integer offset) {
		Map<String,Object> param=new HashMap<>();
		param.put("pageSize", pageSize);
		param.put("offset", offset);
		List<Info> info =informationDao.listPage(param);
		return info;
	}

	@Override
	public List<Info> listAll() {
		List<Info> info =informationDao.listAll();
		return info;
	}

	@Override
	public List<Info> findById(Integer id) {
		List<Info> info =informationDao.findById(id);
		return info;
	}

	@Override
	public void add(Info info) {
		informationDao.add(info);
		
	}

	@Override
	public void update(Info info) {
		informationDao.update(info);
		
	}

	@Override
	public void delete(Integer id) {
		informationDao.delete(id);
		
	}

	@Override
	public List<User> showAll() {
		List<User> users = informationDao.showAll();
 		return users;
	}

	@Override
	public List<CarBrand> showAll1() {
		List<CarBrand> carBrands = informationDao.showAll1();
		return carBrands;
	}

	@Override
	public List<Car> showAll2() {
		List<Car> cars = informationDao.showAll2();
				return cars;
	}

	@Override
	public List<Series> showAll3() {
		List<Series> series = informationDao.showAll3();
				return series;
	}


}
