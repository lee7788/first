package cn.machine.service;

import java.util.List;

import cn.machine.pojo.GaoDe;
import cn.machine.pojo.Menu;
import cn.machine.pojo.User;

public interface MenuService {

	/**
	 * 根据userId查询菜单
	 * 
	 * @param userId
	 * @return
	 */
	List<Menu> list(Integer userId);

	/**
	 * 根据parent=0的id查询菜单
	 * 
	 * @param id
	 * @return
	 */
	List<Menu> findByParent(Integer id);

	/**
	 * 分页，查询parent=0时所有
	 * 
	 * @param pageSize
	 * @param offset
	 * @return
	 */
	List<Menu> listPage(Integer pageSize, Integer offset);

	/**
	 * 查询所拥有
	 * 
	 * @return
	 */
	List<Menu> listAll();

	List<Menu> addlist();
	List<GaoDe> listPage1(Integer pageSize, Integer offset);

	/**
	 * 查询所拥有
	 * 
	 * @return
	 */
	List<GaoDe> listAll1();

	// MEun 添加功能实现
	public void addMenu(Menu menu);

	public void adduser(Integer userId, Integer menuId);

	//修改
    public void update(Menu menu);
	
	List<Menu> findById(Integer id);

	//删除
	public void delete(Integer id);
	

	public void delete1(Integer id);
	
	
	
	//高德表查询
	
	List<GaoDe>addserch(Integer id);
	
	//更新高德表
	
    public void updategaode(GaoDe gaoDe);
	// public void updateuserid(User user,Integer userid);
}
