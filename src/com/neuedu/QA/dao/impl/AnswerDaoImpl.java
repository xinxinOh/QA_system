/**
 * 
 */
package com.neuedu.QA.dao.impl;

import java.sql.ResultSet;

import com.neuedu.QA.dao.AnswerDao;
import com.neuedu.QA.entity.Answer;

/**
 * @author lenovo
 *
 */
public class AnswerDaoImpl implements AnswerDao {

	/* (non-Javadoc)
	 * @see com.neuedu.QA.dao.AnswerDao#SelectAllAnswer(int)
	 */
	@Override
	public ResultSet SelectAllAnswer(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.neuedu.QA.dao.AnswerDao#SelectAnswer(int, int, int)
	 */
	@Override
	public ResultSet SelectAnswer(int question_id, int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.neuedu.QA.dao.AnswerDao#SelectOneAnswer(int)
	 */
	@Override
	public Answer SelectOneAnswer(int answer_id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.neuedu.QA.dao.AnswerDao#addAnswer(com.neuedu.QA.entity.Answer)
	 */
	@Override
	public int addAnswer(Answer a) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.neuedu.QA.dao.AnswerDao#updateAnswer(com.neuedu.QA.entity.Answer)
	 */
	@Override
	public int updateAnswer(Answer a) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.neuedu.QA.dao.AnswerDao#deleteAnswer(int)
	 */
	@Override
	public int deleteAnswer(int Answer_id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
