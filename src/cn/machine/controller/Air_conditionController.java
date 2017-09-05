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

@Controller
@RequestMapping("/condition")
public class Air_conditionController {
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
			List<Car> cars = carservice.listPage(pageSize, offset);
			map.put("rows", cars);
			List<Car> listAll = carservice.listAll();
			int total = listAll.size();		
			map.put("total", total);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}
	
	/**
	 * 进入更新界面
	 * 
	 * */
	@RequestMapping("/showAddModal")
	@ResponseBody
	public  ModelAndView update(Integer id){
		ModelAndView mView = new ModelAndView();
		List<Car> cars =carservice.serchid(id);		
		mView.addObject("cars",cars);	
		mView.setViewName("houtai/center/menu/condition_update");
		return mView;
		
	}
	/**
	 * 修改页面保存按钮实现
	 */
	@RequestMapping(params="act=update")
	@ResponseBody
	public void update(Car car) {
		Map<String, Object> map = new HashMap<String, Object>();
		carservice.update(car);
		map.put("msg", "success");
	
	}

	/**
	 * 进入 新增页面
	 */
	/*
	@RequestMapping("/showAddModal1")
	public ModelAndView showAddModal() {
		ModelAndView mView = new ModelAndView();
		mView.setViewName("houtai/center/menu/condition_add");
		return mView;
	}
	
	*//**
	 * 新增页面新增按钮实现
	 *//*
	@RequestMapping(params = "act=add")
	@ResponseBody
	public Map<String, Object> add(Car car) {
		Map<String, Object> map = new HashMap<String, Object>();
		carservice.add(car);
		map.put("msg", "success");
		return map;
	}
	
	*//**
	 * 删除
	 * *//*
	@RequestMapping(params="act=delete")
	@ResponseBody
	public void delete(Integer id){
		  Map<String,Object> map=new HashMap<String,Object>();	  
		  carservice.delete(id);
		
	}*/
}
