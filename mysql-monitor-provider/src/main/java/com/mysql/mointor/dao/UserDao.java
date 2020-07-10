package com.mysql.mointor.dao;

import java.util.List;

import com.mysql.mointor.domain.UserTable;

public interface UserDao {
	
	List<UserTable> getAll();

	UserTable getOne(Long id);


    void update(UserTable user);

    void delete(Long id);

	UserTable getUserByName(String user_name);

	void addUser(UserTable user);

	
	
	
}
