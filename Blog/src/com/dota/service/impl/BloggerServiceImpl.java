package com.dota.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dota.dao.BloggerDao;
import com.dota.entity.Blogger;
import com.dota.service.BloggerService;

/**
 * ����Serviceʵ����
 * @author Administrator
 *
 */
@Service("bloggerService")
public class BloggerServiceImpl implements BloggerService{

	@Resource
	private BloggerDao bloggerDao;
	
	public Blogger getByUserName(String userName) {
		return bloggerDao.getByUserName(userName);
	}

	public Blogger find() {
		return bloggerDao.find();
	}

	public Integer update(Blogger blogger) {
		return bloggerDao.update(blogger);
	}

}
