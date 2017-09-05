package cn.machine.controller;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.machine.pojo.Car;
import cn.machine.pojo.CarBrand;
import cn.machine.pojo.Series;
import cn.machine.service.BasicParameterService;
import cn.machine.service.CarBrandService;
import cn.machine.service.Carservice;
import cn.machine.service.SeriesService;
import javafx.scene.shape.LineTo;

@Controller
@RequestMapping("/parameter")
public class ParameterController {
@Resource
	private BasicParameterService  basicParameterService;
@Resource
    private CarBrandService carbrandservice;
@Resource
    private  SeriesService  seriesservice;

@Resource
private Carservice carservice;
/**
 * 分页 -- rows/total
 * 
 * @param pageSize
 * @param offset
 * @return
 */
@RequestMapping("/listPage")
@ResponseBody
public Map<String, Object> listPage(Integer pageSize, Integer offset) {
	Map<String, Object> map = new HashMap<String, Object>();
	try {
		List<Car>cars = basicParameterService.listPage(pageSize, offset);
		map.put("rows", cars);
		List<Car> listAll =basicParameterService.listAll();
		int total = listAll.size();
		map.put("total", total);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return map;
}
/**
 * 进入基础配置的新增页面
 * */
@RequestMapping("/showAddModal")
public  ModelAndView showAddModal(){
	
	ModelAndView mView = new ModelAndView();
	List<CarBrand>men=carbrandservice.listAll();
	mView.addObject("men",men);
	List<Series> series=seriesservice.listAll();
	mView.addObject("series",series);
	mView.setViewName("houtai/center/menu/Parameter_add");
	return mView;
} 

/**
 *  保存按钮实现方法
 *  
 * */


@RequestMapping(params="act=add" )
@ResponseBody
public Map<String,Object> add(Car car){	
Map<String,Object> map=new HashMap<String,Object>();
basicParameterService.typeadd(car);
map.put("msg", "success");
return map;
	   }
/**
 * 更新界面
 * 
 * */
@RequestMapping("/showAddModel1")
@ResponseBody
public  ModelAndView showaddmodel(Integer tId){
	ModelAndView mView = new ModelAndView();
	Car men=basicParameterService.serchid(tId);
	List<CarBrand> car = carbrandservice.listAll();
	mView.addObject("men",men);
	mView.addObject("car",car);
	List<Series> series=seriesservice.listAll();
	mView.addObject("series",series);
	mView.setViewName("houtai/center/menu/Parameter_update");
	return mView;
	}
/**
 *  更新按钮实现方法
 *  
 * */
@RequestMapping(params="act=update" )
@ResponseBody
public Map<String,Object> update(Car car){	
Map<String,Object> map=new HashMap<String,Object>();	
basicParameterService.typeupdate(car);

map.put("msg", "success");
return map;
	   }	
/**
 *  删除
 * 
 * 
 * */

@RequestMapping (params="act=delete")
@ResponseBody
public  void  delete(Integer tId,HttpSession session){
	   Map<String,Object> map=new HashMap<String,Object>();	  
	   basicParameterService.delete1(tId);
	
	
	
}


}
