/**
 * 
 */
package com.neuedu.QA.service.impl;

import java.util.ArrayList;

import com.neuedu.QA.entity.UserFollow;
import com.neuedu.QA.service.FollowService;

/**
 * @author lenovo
 *
 */

public class FollwServiceImpl implements FollowService {
	@Override
	public int AddFollow(int user_id,int to_user_id) {
		return 0;
	}
	@Override
	public ArrayList<UserFollow>  ShowFollow(int user_id,int start,int end){
		return null;
	}
	@Override
    public int DeleteFollow(int user_id,int to_user_id) {
    	return 0;
    }
	

}
