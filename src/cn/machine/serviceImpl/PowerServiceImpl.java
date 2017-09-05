package cn.machine.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.machine.dao.PowerDao;
import cn.machine.pojo.Menu;
import cn.machine.pojo.Power;
import cn.machine.pojo.User;
import cn.machine.service.PowerService;

@Service
public class PowerServiceImpl implements PowerService {

	@Resource
	private PowerDao powerdao;
	@Override
	public List<Power> listPage(Integer pageSize, Integer offset) {
		Map<String,Object> param=new HashMap<>();
		param.put("pageSize", pageSize);
		param.put("offset", offset);
		List<Power> powers = powerdao.listPage(param);
		return powers;
	}

	@Override
	public List<Power> listAll() {
		List<Power> powers = powerdao.listAll();
		return powers;
	}

	@Override
	public List<Power> searchid(int id) {
		List<Power> powers = powerdao.searchid(id);
		return powers;
	}

	@Override
	public void add(Power power) {
		powerdao.add(power);

	}

	@Override
	public void update(Power power) {
		powerdao.update(power);

	}

	@Override
	public void delete(int id) {
		powerdao.delete(id);

	}

	@Override
	public List<User> showAll() {
		List<User> users = powerdao.showAll();
		return users;
	}

	@Override
	public List<Menu> showAll1() {
		List<Menu> menus = powerdao.showAll1();
		return menus;
	}

}
