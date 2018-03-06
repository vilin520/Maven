package com.dingcheng.sys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dingcheng.common.dao.BaseDao;
import com.dingcheng.common.service.BaseService;
import com.dingcheng.sys.dao.UserDao;
import com.dingcheng.sys.model.User;


@Service("userService")
public class UserService extends BaseService<User> {

	@Autowired
	private UserDao userDaoImpl;
	
	@Override
	public BaseDao<User> getBaseDao() {
		return userDaoImpl;
	}
	
}
