package cn.machine.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.machine.dao.CarBrandDao;
import cn.machine.dao.CarDao;
import cn.machine.pojo.Car;
import cn.machine.pojo.Supplier;
import cn.machine.service.Carservice;

@Service
public class CarServiceImp implements Carservice {
	@Resource
	private CarDao cardao;
	@Resource
	private CarBrandDao carbranddao;
	@Override
	public List<Car> serch() {
		List<Car>carlist=cardao.serch();
		return carlist;
	}
	@Override
	public List<Car> search(String ctype) {
		return this.cardao.search(ctype);
	}
	@Override
	public List<Car> carserch(Integer id) {
		List<Car>carlist1=cardao.carserch(id);
		return carlist1;
	}
	@Override
	public List<Car> searchPicture(String ctype) {
		return this.cardao.searchPicture(ctype);
	}
	@Override
	public List<Supplier> searchsuppiler(String ctype) {

		return this.cardao.searchsuppiler(ctype);
	}
	@Override
	public List<Car> listPage(Integer pageSize, Integer offset) {
		Map<String,Object> param= new HashMap<>();
		param.put("pageSize", pageSize);
		param.put("offset", offset);
		List<Car> cars=cardao.listPage(param);
		return cars;
	}
	@Override
	public List<Car> listAll() {
		List<Car>list=cardao.listAll();
		return list;
	}
	
	@Override
	public List<Car> serchid(int id) {
		return this.cardao.serchid(id);
	}
	@Override
	public void add(Car car) {
		cardao.add(car);
		
	}
	@Override
	public void update(Car car) {
		cardao.update(car);
	}
	@Override
	public void delete(Integer id) {
		cardao.delete(id);
	}
	
	
	/*@Override
	public int caradd(Car car) {
		return cardao.caradd(car);

	}
	@Override
	public void typeadd(Car car) {

		cardao.typeadd(car);	
	}
	@Override
	public void typeupdate(Car car) {
		cardao.typeupdate(car);

	}
	@Override
	public void delete1(Integer tId) {
		// TODO Auto-generated method stub
		cardao.delete1(tId);
	}
	@Override
	public void typea(Integer id) {
		carbranddao.searchid(id);

	}
*/


}
