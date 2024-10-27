package com.tcs.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImp implements UserDao {

	@Override
	public String finaName(Integer uid) {
		return "Jhon";
	}

}
