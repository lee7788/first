package cn.machine.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.machine.pojo.Car;
import cn.machine.pojo.CarBrand;
import cn.machine.pojo.Menu;
import cn.machine.pojo.Supplier;
import cn.machine.pojo.User;
import cn.machine.service.CarBrandService;
import cn.machine.service.Carservice;
import cn.machine.service.MenuService;
import cn.machine.service.UserService;

@Controller
@RequestMapping("index")
public class IndexContorller {

	@Resource
	private UserService userService;
	@Resource
	private MenuService menuService;
	@Resource
	private Carservice carservice;
	@Resource
	private CarBrandService carbrandservice;
	/**
	 * 返回首页
	 * @param model
	 * @return
	 */
	@RequestMapping("/")
	public String index(Model model){
		return "qiantai/index/index";
	}
	/**
	 * 跳转到a3页面
	 * 
	 * */

	@RequestMapping("/a3")
	public ModelAndView toLogin2(String ctype){
		List<Car> li = this.carservice.search(ctype);
		for(Car list :li){
			System.err.println(list.getcName());
			System.err.println(list.getcOil());
			System.err.println(list.getcVolume());
			System.err.println(list.getCtype());
			System.err.println(list.getcEngine());
		}
		List<Car> list = this.carservice.searchPicture(ctype);
		List<Supplier> li1 = this.carservice.searchsuppiler(ctype);
		for(Supplier list1 :li1){
			System.err.println(list1.getsName());
			System.err.println(list1.getsAddress());
			System.err.println(list1.getcPrice());	
		}

		ModelAndView mv = new ModelAndView();
		mv.addObject("picture",list);
		mv.addObject("list", li);
		mv.addObject("list1", li1);
		mv.setViewName("qiantai/index/a3");
		return mv;
	}

	@RequestMapping(params="act=serch")
	@ResponseBody
	public Map<String, Object>serch(Car car){
		Map<String,Object> map=new HashMap<String,Object>();
		carservice.serch();
		return map;
	}

	/**
	 * 返回登录页面
	 * @return
	 */
	@RequestMapping("/toLogin")
	public ModelAndView toLogin(){
		return new ModelAndView("houtai/login");
	}

	/**
	 * 验证登录
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping(value = "/checkLogin")
	@ResponseBody
	public Map<String, Object> checkLogin(HttpSession session, String username, String password){
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			User user = userService.checkLogin(username, password);
			if (user != null) {
				session.setAttribute("userName", user.getName());
				session.setAttribute("userId", user.getId());
				map.put("msg", "success");
			} else {
				map.put("msg", "error");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

	/**
	 * 进入后台首页
	 * @return
	 */
	@RequestMapping("/toBackIndex")
	public ModelAndView toBackIndex(HttpSession session){
		ModelAndView mView = new ModelAndView();
		try {
			String userName = session.getAttribute("userName").toString();
			Integer userId = Integer.parseInt(session.getAttribute("userId").toString());
			List<Menu> menuList = menuService.list(userId);
			mView.addObject("userName", userName);
			mView.addObject("menuList", menuList);
			mView.setViewName("houtai/index/index");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mView;
	}

	/**
	 * 返回菜单页面
	 * @return
	 */
	@RequestMapping("/menu")
	public ModelAndView menu(){
		ModelAndView mView = new ModelAndView();
		try {
			mView.addObject("menuName", "菜单管理");
			mView.setViewName("houtai/center/menu/menu_list");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mView;
	}

	/**
	 * 后台进入汽车品牌页面
	 * */
	@RequestMapping("/carbrand")
	public ModelAndView carBrand(){
		ModelAndView mView = new ModelAndView();
		try {
			mView.addObject("car1", "汽车品牌");
			mView.setViewName("houtai/center/menu/CarBrand");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mView;
	}
	/**
	 * 后台入车身页面
	 * 
	 * */
	@RequestMapping("/carbody")
	public ModelAndView carbody(){
		ModelAndView mView = new ModelAndView();
		try {
			mView.addObject("carbody", "车身");
			mView.setViewName("houtai/center/menu/Carbody");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mView;
		}
	/**
	 * 后台入发动机页面
	 * 
	 * */
	@RequestMapping("/engine")
	public ModelAndView Engine(){
		ModelAndView mView = new ModelAndView();
		try {
			mView.addObject("engine", "发动机");
			mView.setViewName("houtai/center/menu/Engine");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mView;}
	/**
	 * 后台入变速箱页面
	 * 
	 * */
	@RequestMapping("/gearbox")
	public ModelAndView gearbox(){
		ModelAndView mView = new ModelAndView();
		try {
			mView.addObject("gearbox", "变速箱");
			mView.setViewName("houtai/center/menu/Gearbox");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mView;}
	/**
	 * 后台入车轮制动页面
	 * 
	 * */
	@RequestMapping("/wheelbrake")
	public ModelAndView wheelbrake(){
		ModelAndView mView = new ModelAndView();
		try {
			mView.addObject("wheelbrake", "车轮制动");
			mView.setViewName("houtai/center/menu/Wheelbrake");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mView;}
	/**
	 * 后台入底盘转向页面
	 * 
	 * */
	@RequestMapping("/chassis")
	public ModelAndView chassis(){
		ModelAndView mView = new ModelAndView();
		try {
			mView.addObject("chassis", "底盘转向");
			mView.setViewName("houtai/center/menu/Chassis");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mView;}
	/**
	 * 后台入安全设备页面
	 * 
	 * */
	@RequestMapping("/safetydevice")
	public ModelAndView safetydevice(){
		ModelAndView mView = new ModelAndView();
		try {
			mView.addObject("safetydevice", "安全设备");
			mView.setViewName("houtai/center/menu/Safetydevice");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mView;}

	/**
	 * 后台进入报价信息页面 
	 * */
	@RequestMapping("/info")
	public ModelAndView info(){
		ModelAndView mView = new ModelAndView();
		try {
			mView.addObject("infoName", "报价信息");
			mView.setViewName("houtai/center/menu/info_list");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mView;
	}

	/**
	 * 后台进入用户信息页面 
	 * */
	@RequestMapping("/user")
	public ModelAndView user(){
		ModelAndView mView = new ModelAndView();
		try {
			mView.addObject("userName", "用户信息");
			mView.setViewName("houtai/center/menu/user_list");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mView;
	}

	/**
	 * 后台进入汽车系列页面
	 * */
	@RequestMapping("/series")
	public ModelAndView series(){
		ModelAndView mView = new ModelAndView();
		try {
			mView.addObject("series", "汽车系列");
			mView.setViewName("houtai/center/menu/Series");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mView;
	}

	/**
	 * 后台入基本配置页面
	 * */
	@RequestMapping("/parameter")
	public ModelAndView parameter(){
		ModelAndView mView = new ModelAndView();
		try {
			mView.addObject("parameter", "基本配置");
			mView.setViewName("houtai/center/menu/Parameter");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mView;
	}
	
	/** 
	 * 后台进入辅助、操控配置表
	 * */	
	@RequestMapping("/auxiliary")
	public ModelAndView auxiliary(){
		ModelAndView mView = new ModelAndView();
		try {
			mView.addObject("external", "辅助、操控配置");
			mView.setViewName("houtai/center/menu/auxiliary_list");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mView;
	}
	
	/** 
	 * 后台进入外部/防盗配置表
	 * */	
	@RequestMapping("/external")
	public ModelAndView external(){
		ModelAndView mView = new ModelAndView();
		try {
			mView.addObject("external", "外部/防盗配置");
			mView.setViewName("houtai/center/menu/external_list");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mView;
	}
	
	/** 
	 * 后台进入内部配置表
	 * */	
	@RequestMapping("/internal")
	public ModelAndView internal(){
		ModelAndView mView = new ModelAndView();
		try {
			mView.addObject("internal", "内部配置");
			mView.setViewName("houtai/center/menu/internal_list");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mView;
	}
	
	/**
	 * 后台进入座椅配置表 
	 * */	
	@RequestMapping("/seat")
	public ModelAndView seat(){
		ModelAndView mView = new ModelAndView();
		try {
			mView.addObject("seat", "座椅配置");
			mView.setViewName("houtai/center/menu/seat_list");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mView;
	}
	
	/**
	 * 后台进入多媒体配置表 
	 * */	
	@RequestMapping("/multimedia")
	public ModelAndView multimedia(){
		ModelAndView mView = new ModelAndView();
		try {
			mView.addObject("multimedia", "多媒体配置");
			mView.setViewName("houtai/center/menu/multimedia_list");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mView;
	}

	/**
	 * 后台进入灯光配置表
	 * */	
	@RequestMapping("/light")
	public ModelAndView glass(){
		ModelAndView mView = new ModelAndView();
		try {
			mView.addObject("light", "灯光配置");
			mView.setViewName("houtai/center/menu/light_list");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mView;
	}

	/** 
	 * 后台进入玻璃/后视镜配置表 
	 * */	
	@RequestMapping("/glass")
	public ModelAndView addserch1(){
		ModelAndView mView = new ModelAndView();
		try {
			mView.addObject("glass", "玻璃/后视镜");
			mView.setViewName("houtai/center/menu/glass_list");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mView;
	}

	/** 
	 * 后台进入空调/冰箱配置表 
	 * */	
	@RequestMapping("/condition")
	public ModelAndView addserch(){
		ModelAndView mView = new ModelAndView();
		try {
			mView.addObject("condition", "空调/冰箱");
			mView.setViewName("houtai/center/menu/condition_list");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mView;
	}
	
	/**
	 *  返回高德页面
	 * */
	@RequestMapping("/menu1")
	public ModelAndView menu1(){
		ModelAndView mView = new ModelAndView();
		try {
			mView.addObject("menuName1", "关于高德");
			mView.setViewName("houtai/center/menu/menu_list1");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mView;
	}

	/**
	 * 后台进入权限设置页面
	 * */
	@RequestMapping("/power")
	public ModelAndView Power(){
		ModelAndView mView = new ModelAndView();
		try {
			mView.addObject("power", "权限设置");
			mView.setViewName("houtai/center/menu/power_list");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mView;
	}

	/**
	 * 图片返回 
	 * */
	@RequestMapping(value="/showPicture")
	public String readImage(@RequestParam String imgPath,HttpServletRequest request,HttpServletResponse response){
		ServletOutputStream out = null;  
		FileInputStream ips = null; 
		try {  
			//获取图片存放路径  
			ips = new FileInputStream(new File(new String(imgPath.getBytes("ISO-8859-1"),"UTF-8")));  
			response.setContentType("multipart/form-data");  
			out = response.getOutputStream();  
			//读取文件流  
			int len = 0;  
			byte[] buffer = new byte[1024 * 10];  
			while ((len = ips.read(buffer)) != -1){  
				out.write(buffer,0,len);  
			}  
			out.flush();  
		}catch (Exception e){  
			e.printStackTrace();  
		}finally {  
			try {
				out.close();
				ips.close();  
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}    
		}   
		return null;
	}
}
