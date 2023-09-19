package service;

import dao.UserDao;

public class UserServiceImpl implements UserService{

	UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean login(String name, String password) {
		// TODO Auto-generated method stub
		return userDao.login(name,password);
	}
	
}
