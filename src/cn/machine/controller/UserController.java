package cn.machine.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.machine.pojo.User;
import cn.machine.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;

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
			List<User> users = userService.listPage(pageSize, offset);
			map.put("rows", users);
			List<User> listAll = userService.listAll();
			int total = listAll.size();
			map.put("total", total);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

	/**
	 * 进入user的新增页面
	 */
	@RequestMapping("/showAddModal")
	public ModelAndView showAddModal() {

		ModelAndView mView = new ModelAndView();

		mView.setViewName("houtai/center/menu/user_add");
		return mView;
	}

	/**
	 * user的新增页面新增按钮实现
	 */
	@RequestMapping(params = "act=add")
	@ResponseBody
	public Map<String, Object> add(User user) {
		Map<String, Object> map = new HashMap<String, Object>();
		userService.add(user);
		map.put("msg", "success");
		return map;
	}
	/**
	 * 进入user 更新界面
	 * 
	 * */
	@RequestMapping("/showAddModal1")
	@ResponseBody
	public  ModelAndView update1(int id){
		ModelAndView mView = new ModelAndView();
		List<User>men=userService.searchid(id);
		mView.addObject("men",men);
		mView.setViewName("houtai/center/menu/user_update");
		return mView;}
	/**
	 * user的修改页面保存按钮实现
	 */
	@RequestMapping(params="act=update")
	@ResponseBody
	public void update(User user) {
		Map<String, Object> map = new HashMap<String, Object>();
		userService.update(user);
		map.put("msg", "success");
	
	}
	/**
	 * 删除用户
	 * */
	@RequestMapping(params="act=delete")
	@ResponseBody
	public void delete(int id){
		  Map<String,Object> map=new HashMap<String,Object>();	  
		  userService.delete(id);
		
	}

}
