package com.dota.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dota.dao.CommentDao;
import com.dota.entity.Comment;
import com.dota.service.CommentService;

/**
 * ����Serviceʵ����
 * @author Administrator
 *
 */
@Service("commentService")
public class CommentServiceImpl implements CommentService{

	@Resource
	private CommentDao commentDao;
	
	public List<Comment> list(Map<String, Object> map) {
		return commentDao.list(map);
	}

	public int add(Comment comment) {
		return commentDao.add(comment);
	}

	public Long getTotal(Map<String, Object> map) {
		return commentDao.getTotal(map);
	}

	public int update(Comment comment) {
		return commentDao.update(comment);
	}

	public Integer delete(Integer id) {
		return commentDao.delete(id);
	}

}
