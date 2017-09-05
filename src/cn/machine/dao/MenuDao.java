package cn.machine.dao;

import java.util.List;

import cn.machine.pojo.GaoDe;
import cn.machine.pojo.Menu;
import cn.machine.pojo.User;


public interface MenuDao {

	List<Menu> list(Integer userId);

	List<Menu> findByParent(Integer id);
	List<Menu> findById(Integer id);
	List<Menu> listPage(Integer pageSize, Integer offset);

	List<Menu> listAll();
	List<Menu> addlist();
	List<GaoDe> listPage1(Integer pageSize, Integer offset);

	List<GaoDe> listAll1();
	
	//新增
	 public void addMenu(Menu menu);
     public void adduser(Integer userId,Integer menuId);
    //更新
     public void update(Menu menu);
    //删除
     public void  delete(Integer id);
     public void  delete1(Integer id) ;
     //高德表的查询
 	List<GaoDe>addserch(Integer id);
 	 //更新高德表
    public void updategaode(GaoDe gaoDe);
	
//	 public void updateuserid(User user,Integer userid);
}
