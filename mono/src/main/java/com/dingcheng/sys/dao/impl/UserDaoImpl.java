package com.dingcheng.sys.dao.impl;

import org.springframework.stereotype.Repository;

import com.dingcheng.common.dao.impl.BaseDaoImpl;
import com.dingcheng.sys.dao.UserDao;
import com.dingcheng.sys.model.User;

@Repository("userDaoImpl")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

}
