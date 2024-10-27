package com.tcs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.dao.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	public String getName(Integer uid) {
		System.out.println(userDao.getClass().getName());
		String name = userDao.finaName(uid);
		System.out.println(name);
		return name;
	}

}
