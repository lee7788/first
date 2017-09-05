package cn.machine.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.machine.pojo.Menu;
import cn.machine.pojo.Power;
import cn.machine.pojo.User;
import cn.machine.service.PowerService;


@Controller
@RequestMapping("/power")
public class PowerController {
	@Resource
	private PowerService powerService;

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
			List<Power> users = powerService.listPage(pageSize, offset);
			map.put("rows", users);
			List<Power> listAll = powerService.listAll();
			int total = listAll.size();
			map.put("total", total);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

	/**
	 * 进入的新增页面
	 */
	@RequestMapping("/showAddModal")
	public ModelAndView showAddModal() {

		ModelAndView mView = new ModelAndView();
		List<User> users = powerService.showAll();
		List<Menu> menus = powerService.showAll1();
		mView.addObject("users",users);
		mView.addObject("menus",menus);
		mView.setViewName("houtai/center/menu/power_add");
		return mView;
	}

	/**
	 * 新增页面新增按钮实现
	 */
	@RequestMapping(params = "act=add")
	@ResponseBody
	public Map<String, Object> add(Power power) {
		Map<String, Object> map = new HashMap<String, Object>();
		powerService.add(power);
		map.put("msg", "success");
		return map;
	}
	/**
	 * 进入更新界面
	 * 
	 * */
	@RequestMapping("/showAddModal1")
	@ResponseBody
	public  ModelAndView update1(int id){
		ModelAndView mView = new ModelAndView();
		List<Power> power=powerService.searchid(id);
		List<User> users = powerService.showAll();
		List<Menu> menus = powerService.showAll1();	
		mView.addObject("power",power);
		mView.addObject("users",users);
		mView.addObject("menus",menus);
		mView.setViewName("houtai/center/menu/power_update");
		return mView;}
	/**
	 * 修改页面保存按钮实现
	 */
	@RequestMapping(params="act=update")
	@ResponseBody
	public void update(Power power) {
		Map<String, Object> map = new HashMap<String, Object>();
		powerService.update(power);
		map.put("msg", "success");
	
	}
	/**
	 * 删除用户
	 * */
	@RequestMapping(params="act=delete")
	@ResponseBody
	public void delete(int id){
		  Map<String,Object> map=new HashMap<String,Object>();	  
		  powerService.delete(id);
		
	}
}
