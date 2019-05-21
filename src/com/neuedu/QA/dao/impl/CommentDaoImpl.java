<<<<<<< HEAD
/**
 * 
 */
package com.neuedu.QA.dao.impl;

import java.sql.ResultSet;

import com.neuedu.QA.dao.CommentDao;
import com.neuedu.QA.entity.Comment;

/**
 * @author lenovo
 *
 */
public class CommentDaoImpl implements CommentDao {

	/* (non-Javadoc)
	 * @see com.neuedu.QA.dao.CommentDao#SelectComment(int, int, int)
	 */
	@Override
	public ResultSet SelectComment(int answer_id, int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.neuedu.QA.dao.CommentDao#SelectSecondComment(int[])
	 */
	@Override
	public ResultSet SelectSecondComment(int[] secondComment_id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.neuedu.QA.dao.CommentDao#SelectUserComment(int)
	 */
	@Override
	public ResultSet SelectUserComment(int User_id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.neuedu.QA.dao.CommentDao#SelectOneComment(int)
	 */
	@Override
	public Comment SelectOneComment(int comment_id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.neuedu.QA.dao.CommentDao#addComment(com.neuedu.QA.entity.Comment)
	 */
	@Override
	public int addComment(Comment d) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.neuedu.QA.dao.CommentDao#updateComment(com.neuedu.QA.entity.Comment)
	 */
	@Override
	public int updateComment(Comment d) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.neuedu.QA.dao.CommentDao#deleteComment(int)
	 */
	@Override
	public int deleteComment(int Comment_id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
=======
package com.neuedu.QA.dao.impl;

import java.sql.ResultSet;

import com.neuedu.QA.dao.CommentDao;
import com.neuedu.QA.entity.Comment;

public class CommentDaoImpl implements CommentDao{

	@Override
	public ResultSet SelectComment(int answer_id, int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet SelectSecondComment(int[] secondComment_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet SelectUserComment(int User_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment SelectOneComment(int comment_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addComment(Comment d) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateComment(Comment d) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteComment(int Comment_id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
>>>>>>> a2071e8187c1f699e304bf9af15016f4c0989902
