package cn.machine.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.machine.dao.MenuDao;
import cn.machine.pojo.GaoDe;
import cn.machine.pojo.Menu;
import cn.machine.pojo.User;
import cn.machine.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {
	
	@Resource
	private MenuDao menuDao;

	@Override
	public List<Menu> list(Integer userId) {
		List<Menu> menuList = menuDao.list(userId);
		return menuList;
	}

	@Override
	public List<Menu> findByParent(Integer id) {
		List<Menu> menus = menuDao.findByParent(id);
		return menus;
	}

	@Override
	public List<Menu> listPage(Integer pageSize, Integer offset) {
		List<Menu> menus = menuDao.listPage(pageSize, offset);
		return menus;
	}

	@Override
	public List<Menu> listAll() {
		List<Menu> list = menuDao.listAll();
		return list;
	}

	@Override
	public void addMenu(Menu menu) {
		menuDao.addMenu(menu);
		
	}

	@Override
	public void adduser(Integer userId,Integer menuId) {
		menuDao.adduser(userId,menuId);
		
	}

	@Override
	public List<Menu> addlist() {
		List<Menu> list = menuDao.addlist();
		return list;
	}

	@Override
	public void delete(Integer id) {
		menuDao.delete(id);
		
	}

	@Override
	public void delete1(Integer id) {
		menuDao.delete1(id);
		
	}
	
	@Override
	public List<Menu> findById(Integer id) {
		List<Menu> menus = menuDao.findById(id);
		return menus;
	}

	@Override
	public void update(Menu menu) {
		
		menuDao.update(menu);
	}

	@Override
	public List<GaoDe> addserch(Integer id) {
		List<GaoDe> list = menuDao.addserch(id);
		return list;
	}

	@Override
	public List<GaoDe> listPage1(Integer pageSize, Integer offset) {
		List<GaoDe> gaode = menuDao.listPage1(pageSize, offset);
		return gaode;
	}

	@Override
	public List<GaoDe> listAll1() {
		List<GaoDe> list = menuDao.listAll1();
		return list;
	}

	@Override
	public void updategaode(GaoDe gaoDe) {
	 menuDao.updategaode(gaoDe);
		
	}

//	@Override
//	public void updateuserid(User user,Integer userid) {
//		menuDao.updateuserid(user,userid);
//		
//	}




}
