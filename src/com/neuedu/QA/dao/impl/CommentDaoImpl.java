package com.neuedu.QA.dao.impl;

import java.sql.ResultSet;

import com.neuedu.QA.dao.CommentDao;
import com.neuedu.QA.dbutil.BaseDao;
import com.neuedu.QA.entity.Comment;

public class CommentDaoImpl extends BaseDao implements CommentDao{

	@Override
	public ResultSet SelectComment(int answer_id, int start, int end) {
		
		Object[] params =new Object[]{answer_id,start,end-start};
		
		try {
			
			ResultSet rs = super.executeSelect("select * from comment where answer_id=? LIMIT ?,?", params);
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			super.closeAll(BaseDao.con, BaseDao.pst, rs);
		}
		return rs;
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
