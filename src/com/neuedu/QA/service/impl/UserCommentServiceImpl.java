package com.neuedu.QA.service.impl;

import com.neuedu.QA.dao.impl.CommentDaoImpl;
import com.neuedu.QA.entity.Comment;
import com.neuedu.QA.service.UserCommentService;

public class UserCommentServiceImpl implements UserCommentService{

	CommentDaoImpl commentDaoImpl=new CommentDaoImpl();
	
	@Override
	public int AddComment(Comment comment) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int AddSecondComment(Comment comment, int comment_id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
