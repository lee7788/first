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
import cn.machine.service.AuxiliaryService;

@Controller
@RequestMapping("/auxiliary")
public class AuxiliaryController {
	@Resource
	private AuxiliaryService auxiliaryService;
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
			List<Car> cars = auxiliaryService.listPage(pageSize, offset);
			map.put("rows", cars);
			List<Car> listAll = auxiliaryService.listAll();
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
		List<Car> cars =auxiliaryService.serchid(id);		
		mView.addObject("cars",cars);	
		mView.setViewName("houtai/center/menu/auxiliary_update");
		return mView;
		
	}
	/**
	 * 修改页面保存按钮实现
	 */
	@RequestMapping(params="act=update")
	@ResponseBody
	public void update(Car car) {
		Map<String, Object> map = new HashMap<String, Object>();
		auxiliaryService.update(car);
		map.put("msg", "success");
	
	}
}
