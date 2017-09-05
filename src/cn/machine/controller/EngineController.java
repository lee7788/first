package cn.machine.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.machine.pojo.Car;
import cn.machine.service.Carservice;
import cn.machine.service.EngineService;

@Controller
@RequestMapping("/engine")
public class EngineController {
@Resource
  private EngineService  engineService;
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
		List<Car>cars = engineService.listPage(pageSize, offset);
		map.put("rows", cars);
		List<Car> listAll =engineService.listAll();
		int total = listAll.size();
		map.put("total", total);
	} catch (Exception e) {
		e.printStackTrace();
	}
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
	List<Car> men=engineService.serchid(tId);
	mView.addObject("men",men);
	mView.setViewName("houtai/center/menu/Engine_update");
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
engineService.typeupdate(car);
map.put("msg", "success");
return map;
	   }	
}
