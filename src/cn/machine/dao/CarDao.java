package cn.machine.dao;

import java.util.List;
import java.util.Map;

import cn.machine.pojo.Car;
import cn.machine.pojo.Supplier;

public interface CarDao {
	List<Car> serch();
	List<Car> carserch(Integer id);
	List<Car> search(String ctype);
	List<Car> searchPicture(String ctype);
	List<Supplier> searchsuppiler(String ctype);
	
	//分页
	List<Car> listPage(Map param);
	//查询所有
	List<Car> listAll();
	//按照id查询
	List<Car> serchid(int id);
	//增加信息
	public void add(Car car);
	//更新
	public void update(Car car);
	//删除
	public void delete(Integer id);

	
	
	
	
	/*//新增
	public  int  caradd(Car car);
	public  void typea(Integer id);

	public void  typeadd(Car car);
	//更新
	public void typeupdate(Car car);
	//删除
	public void  delete1(Integer tId);
*/
	
}
