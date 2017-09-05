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

import cn.machine.pojo.GaoDe;
import cn.machine.pojo.Menu;
import cn.machine.service.MenuService;

@Controller
@RequestMapping("/menu1")
public class GaoDeController {

	@Resource
	private MenuService menuService;
	
	@RequestMapping("/gaode")
	public ModelAndView addserch(){
		ModelAndView mView = new ModelAndView();
		
		
		mView.setViewName("houtai/center/menu/menu_list1");
		return mView;
		
	}
	
	/*关于高德界面弹出  及分页
	 * 
	 * */
	@RequestMapping(params="act=serch")
	@ResponseBody
	public Map<String, Object> listPage1(Integer pageSize, Integer offset){
		Map<String, Object> map = new HashMap<String, Object>();
		
		try {
			List<GaoDe> list = menuService.listPage1(pageSize, offset);
			for(GaoDe g :list){
				System.err.println(g.getProfile());
			}
			map.put("rows", list);
			List<GaoDe> listAll = menuService.listAll1();
			int total = listAll.size();
			map.put("total", total);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}
	
/*修改界面弹出
 * */	
@RequestMapping("/showAddModel")
@ResponseBody
public  ModelAndView showaddmodel(Integer id){
	ModelAndView mView = new ModelAndView();
	List<GaoDe> men=menuService.addserch(id);
	mView.addObject("men",men);
	mView.setViewName("houtai/center/menu/gaode_update");
	return mView;
	}
/*
 * 修改
 * 
 * */
@RequestMapping(params="act=update")
@ResponseBody
public Map<String, Object>update(GaoDe gaoDe){
	   Map<String,Object> map=new HashMap<String,Object>();	  
	   menuService.updategaode(gaoDe);
	   map.put("msg", "success");
	   return map;
	   }
}
