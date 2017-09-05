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
import cn.machine.pojo.CarBrand;
import cn.machine.pojo.Info;
import cn.machine.pojo.Series;
import cn.machine.pojo.User;
import cn.machine.service.InformationService;


@Controller
@RequestMapping("/info")
public class InformationController {

	@Resource
	private InformationService informationService;
	
	
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
			List<Info> info = informationService.listPage(pageSize, offset);
			map.put("rows", info);
			List<Info> listAll = informationService.listAll();
			int total = listAll.size();		
			System.err.println("total");
			map.put("total", total);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}
	
	/**
	 * 进入Info 更新界面
	 * 
	 * */
	@RequestMapping("/showAddModal")
	@ResponseBody
	public  ModelAndView update1(Integer id){
		ModelAndView mView = new ModelAndView();
		List<Info>  info =informationService.findById(id);
		List<User> users = informationService.showAll();
		mView.addObject("info",info);	
		mView.addObject("users",users);
		
		for (User user : users) {
			System.err.println(user.getId());
			System.err.println(user.getName());
		}
		mView.setViewName("houtai/center/menu/info_update");
		return mView;
		
	}
	/**
	 * 修改页面保存按钮实现
	 */
	@RequestMapping(params="act=update")
	@ResponseBody
	public void update(Info info) {
		Map<String, Object> map = new HashMap<String, Object>();
		informationService.update(info);
		map.put("msg", "success");
	
	}
	
	/**
	 * 进入 新增页面
	 */
	@RequestMapping("/showAddModal1")
	public ModelAndView showAddModal() {

		ModelAndView mView = new ModelAndView();
		List<User> users = informationService.showAll();
		List<CarBrand>carBrands = informationService.showAll1();
		List<Car> cars = informationService.showAll2();
		List<Series> series = informationService.showAll3();
		mView.addObject("users",users);
		mView.addObject("carBrands",carBrands);
		mView.addObject("cars",cars);
		mView.addObject("series",series);
		
		mView.setViewName("houtai/center/menu/info_add");
		return mView;
	}
	
	/**
	 * 新增页面新增按钮实现
	 */
	@RequestMapping(params = "act=add")
	@ResponseBody
	public Map<String, Object> add(Info info) {
		Map<String, Object> map = new HashMap<String, Object>();
		informationService.add(info);
		map.put("msg", "success");
		return map;
	}
	
	/**
	 * 删除
	 * */
	@RequestMapping(params="act=delete")
	@ResponseBody
	public void delete(Integer id){
		  Map<String,Object> map=new HashMap<String,Object>();	  
		  informationService.delete(id);
		
	}
}
