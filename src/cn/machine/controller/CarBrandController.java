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
import cn.machine.service.CarBrandService;

@Controller
@RequestMapping("/carbrand")
public class CarBrandController {
	@Resource
	private CarBrandService carBrandService;

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
			List<CarBrand> cars = carBrandService.listPage(pageSize, offset);
			map.put("rows", cars);
			List<CarBrand> listAll = carBrandService.listAll();
			int total = listAll.size();
			map.put("total", total);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

	/**
	 * 进入 carbrand的新增页面
	 */
	@RequestMapping("/showAddModal")
	public ModelAndView showAddModal() {

		ModelAndView mView = new ModelAndView();

		mView.setViewName("houtai/center/menu/CarBrand_add");
		return mView;
	}

	/**
	 * carbrand的新增页面新增按钮实现
	 */
	@RequestMapping(params = "act=add")
	@ResponseBody
	public Map<String, Object> add(CarBrand carBrand) {
		Map<String, Object> map = new HashMap<String, Object>();
		carBrandService.add(carBrand);
		map.put("msg", "success");
		return map;
	}
	/**
	 * 进入carbrand 更新界面
	 * 
	 * */
	@RequestMapping("/showAddModal1")
	@ResponseBody
	public  ModelAndView update1(Integer id){
		ModelAndView mView = new ModelAndView();
		List<CarBrand>men=carBrandService.searchid(id);
		mView.addObject("men",men);
		mView.setViewName("houtai/center/menu/CarBrand_update");
		return mView;}
	/**
	 * carbrand的修改页面保存按钮实现
	 */
	@RequestMapping(params="act=update")
	@ResponseBody
	public void update(CarBrand carBrand) {
		Map<String, Object> map = new HashMap<String, Object>();
		carBrandService.update(carBrand);
		map.put("msg", "success");
	
	}
	/**
	 * 删除汽车品牌
	 * */
	@RequestMapping(params="act=delete")
	@ResponseBody
	public void delete(Integer id){
		  Map<String,Object> map=new HashMap<String,Object>();	  
		  carBrandService.delete(id);
		
	}
}
