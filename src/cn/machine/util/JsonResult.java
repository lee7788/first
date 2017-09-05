package cn.machine.util;

import java.util.HashMap;
import java.util.Map;

public class JsonResult {
	
	private boolean success = true;
	private String msg = "";
	private Map<String,Object> map = new HashMap<String,Object>();
	private Integer status = 0 ;
	

	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
	
	
}
