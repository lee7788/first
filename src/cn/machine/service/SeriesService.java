package cn.machine.service;

import java.util.List;

import cn.machine.pojo.Series;

public interface SeriesService {
	List<Series> listPage(Integer pageSize, Integer offset);//查询方法返回
	List<Series> listAll();
	List<Series> searchid(Integer id);
	//新增
	public void add(Series series);
	//更新
	public void update(Series series);
	//删除
	public void delete(Integer id);
	
}
