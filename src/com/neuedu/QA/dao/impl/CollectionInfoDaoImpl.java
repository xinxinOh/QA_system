package com.neuedu.QA.dao.impl;

import java.sql.ResultSet;

import com.neuedu.QA.dao.CollectionInfoDao;
import com.neuedu.QA.dbutil.BaseDao;

public class CollectionInfoDaoImpl extends BaseDao implements CollectionInfoDao {

	@Override
	public ResultSet SelectAllCollection(String user_id) {
		// TODO Auto-generated method stub
		String sql_1 = "select question_id from collect where u_id = ?";
		String sql = "select * from question where question_id in ("+sql_1+")";
		String params[] = {user_id};
		return executeSelect(sql, params);
	}

	@Override
	public int AddCollection(String user_id, int question_id) {
		// TODO Auto-generated method stub
		String sql = "insert into collect (u_id,question_id) values(?,?)";
		String params[] = {user_id , question_id+""};
		return executeIUD(sql, params);
	}

	@Override
	public int DeleteCollection(String user_id, int question_id) {
		// TODO Auto-generated method stub//更新数据库不通过主键，mysql会报错，需要把set——safe——update设置为0才能执行
		String set_safe_0 = "set sql_safe_updates = 0;";
		//sql语句
		String sql = "delete from collect where u_id = ? and question_id = ?;";
		//恢复安全设置
		String set_safe_1 = "set sql_safe_updates = 1;";
				
		String params[] = {user_id , question_id+""};
		return executeIUD(set_safe_0+sql+set_safe_1, params);
	}

}
