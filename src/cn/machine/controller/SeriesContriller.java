package cn.machine.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.machine.pojo.CarBrand;
import cn.machine.pojo.Series;
import cn.machine.service.SeriesService;

@Controller
@RequestMapping("/series")
public class SeriesContriller {
	@Resource
	private SeriesService seriesService;
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
			List<Series> series = seriesService.listPage(pageSize, offset);
			map.put("rows", series);
			List<Series> listAll =seriesService.listAll();
			int total = listAll.size();
			map.put("total", total);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}
	/**
	 * 进入 series的新增页面
	 */
	@RequestMapping("/showAddModal")
	public ModelAndView showAddModal() {

		ModelAndView mView = new ModelAndView();

		mView.setViewName("houtai/center/menu/Series_add");
		return mView;
	}

	/**
	 * series的新增页面新增按钮实现
	 */
	@RequestMapping(params = "act=add")
	@ResponseBody
	public Map<String, Object> add(Series series) {
		Map<String, Object> map = new HashMap<String, Object>();
		seriesService.add(series);
		map.put("msg", "success");
		return map;
	}
	/**
	 * 进入series 更新界面
	 * 
	 * */
	@RequestMapping("/showAddModal1")
	@ResponseBody
	public  ModelAndView update1(Integer id){
		ModelAndView mView = new ModelAndView();
		List<Series>men=seriesService.searchid(id);
		mView.addObject("men",men);
		mView.setViewName("houtai/center/menu/Series_update");
		return mView;}
	/**
	 * series的修改页面保存按钮实现
	 */
	@RequestMapping(params="act=update")
	@ResponseBody
	public void update(Series series) {
		Map<String, Object> map = new HashMap<String, Object>();
		seriesService.update(series);
		map.put("msg", "success");
	
	}
	/**
	 * 删除汽车系列
	 * */
	@RequestMapping(params="act=delete")
	@ResponseBody
	public void delete(Integer id){
		  Map<String,Object> map=new HashMap<String,Object>();	  
		  seriesService.delete(id);
		
	}
	
	

}
