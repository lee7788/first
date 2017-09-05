 package cn.machine.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import cn.machine.pojo.Menu;
import cn.machine.pojo.User;
import cn.machine.service.MenuService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/menu")
public class MenuController {
	
	@Resource
	private MenuService menuService;

	
	/**
	 * 分页  -- rows/total
	 * @param pageSize
	 * @param offset
	 * @return
	 */
	@RequestMapping("/listPage")
	@ResponseBody
	public Map<String, Object> listPage(Integer pageSize, Integer offset){
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			List<Menu> list = menuService.listPage(pageSize, offset);
			map.put("rows", list);
			List<Menu> listAll = menuService.listAll();
			int total = listAll.size();
			map.put("total", total);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}
	
	/**
	 * 进入新增页面
	 * @return
	 */
	@RequestMapping("/showAddModal")
	public ModelAndView showAddModal(){
		ModelAndView mView = new ModelAndView();
		try {
			List<Menu> menus = menuService.findByParent(0);
			mView.addObject("menus", menus);
			mView.setViewName("houtai/center/menu/menu_add");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mView;
	}
	//修改界面
	@RequestMapping("/showAddModal1")
	@ResponseBody
	public ModelAndView showAddModal1(Integer id){
		ModelAndView mView = new ModelAndView();
		try {
			List<Menu> menus = menuService.findByParent(0);
			List<Menu> men=menuService.findById(id)	;	// 更具id 返回近模态窗值		
			mView.addObject("menus", menus);
			mView.addObject("men", men);
			mView.setViewName("houtai/center/menu/menu_update");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return  mView;
	}
	//增加按钮 保存到数据库
   @RequestMapping(params="act=add")
   @ResponseBody
   public  Map<String,Object> add(Menu menu,User user,HttpSession session){
	   System.err.println(menu.getId() );
	   Map<String,Object> map=new HashMap<String,Object>();	    
	   Integer userId = Integer.parseInt(session.getAttribute("userId").toString());//获取userID	    
	   menuService.addMenu(menu);
	   Integer menuId = menu.getId();//获取menuid
	  
	   menuService.adduser(userId,menuId);	  
	   map.put("msg", "success");
	   return map;	    
   }
//修改
   @RequestMapping(params="act=update")
   @ResponseBody
   public Map<String, Object>update(Menu menu){
	   Map<String,Object> map=new HashMap<String,Object>();	  
	   menuService.update(menu);
	   map.put("msg", "success");
	   return map;
	   }
//删除
   @RequestMapping(params="act=delete")
   @ResponseBody
 public void  delete(Integer id,HttpSession session){
	   Map<String,Object> map=new HashMap<String,Object>();	  
	
	   menuService.delete(id);
	   menuService.delete1(id);
   }
	
   
   
}
