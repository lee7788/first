package cn.machine.service;

import java.util.List;

import cn.machine.pojo.Car;
import cn.machine.pojo.CarBrand;
import cn.machine.pojo.Supplier;

public interface Carservice {
	List<Car> serch();
	List<Car> carserch(Integer id);
	List<Car> search(String ctype);
	List<Car> searchPicture(String ctype);
	List<Supplier> searchsuppiler(String ctype);
	
	//分页
	List<Car> listPage(Integer pageSize, Integer offset);
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
