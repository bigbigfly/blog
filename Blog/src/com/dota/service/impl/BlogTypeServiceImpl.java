package com.dota.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dota.dao.BlogTypeDao;
import com.dota.entity.BlogType;
import com.dota.service.BlogTypeService;

/**
 * ��������Serviceʵ����
 * @author Administrator
 *
 */
@Service("blogTypeService")
public class BlogTypeServiceImpl implements BlogTypeService{

	@Resource
	private BlogTypeDao blogTypeDao;
	
	public List<BlogType> countList() {
		return blogTypeDao.countList();
	}

	public List<BlogType> list(Map<String, Object> map) {
		return blogTypeDao.list(map);
	}

	public Long getTotal(Map<String, Object> map) {
		return blogTypeDao.getTotal(map);
	}

	public Integer add(BlogType blogType) {
		return blogTypeDao.add(blogType);
	}

	public Integer update(BlogType blogType) {
		return blogTypeDao.update(blogType);
	}

	public Integer delete(Integer id) {
		return blogTypeDao.delete(id);
	}

	
}
