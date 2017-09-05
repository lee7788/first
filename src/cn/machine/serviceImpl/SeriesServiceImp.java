package cn.machine.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.machine.dao.SeriesDao;
import cn.machine.pojo.Series;
import cn.machine.service.SeriesService;
@Service
public class SeriesServiceImp implements SeriesService {
@Resource
private  SeriesDao  seriesDao;

@Override
public List<Series> listPage(Integer pageSize, Integer offset) {
	List<Series> series=seriesDao.listPage(pageSize, offset);
	return series;
}

@Override
public List<Series> listAll() {
	List<Series> series=seriesDao.listAll();
	return series;
}

@Override
public List<Series> searchid(Integer id) {
	// TODO Auto-generated method stub
	return this.seriesDao.searchid(id);
}

@Override
public void add(Series series) {
	seriesDao.add(series);
}

@Override
public void update(Series series) {
	// TODO Auto-generated method stub
	seriesDao.update(series);
}

@Override
public void delete(Integer id) {
	seriesDao.delete(id);
	
}
}
