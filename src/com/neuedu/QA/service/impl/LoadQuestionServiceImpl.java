/**
 * 
 */
package com.neuedu.QA.service.impl;

import java.util.ArrayList;

import com.neuedu.QA.dao.impl.QuestionDaoImpl;
import com.neuedu.QA.entity.Question;
import com.neuedu.QA.service.LoadQuestionService;

/**
 * @author lenovo
 *
 */
public class LoadQuestionServiceImpl implements LoadQuestionService {

	/* (non-Javadoc)
	 * @see com.neuedu.QA.service.LoadQuestionService#LoadPopularQuestion()
	 */
	private QuestionDaoImpl questionDaoImpl = QuestionDaoImpl();
	@Override
	public ArrayList<Question> LoadPopularQuestion() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return
	 */
	private QuestionDaoImpl QuestionDaoImpl() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.neuedu.QA.service.LoadQuestionService#LoadCategoryQuestion(int, int, int)
	 */
	@Override
	public ArrayList<Question> LoadCategoryQuestion(int type, int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.neuedu.QA.service.LoadQuestionService#LoadUserQuestion(int)
	 */
	@Override
	public ArrayList<Question> LoadUserQuestion(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
