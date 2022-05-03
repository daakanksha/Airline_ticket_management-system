package com.fisglobal.users.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fisglobal.users.model.User;

@Repository
@Transactional
public interface UserDao extends JpaRepository<User,String> {
	
	@Query("Select u from User u where u.userId=?1 and u.pass=?2")
	public User validateUser(String userid,String pass);

}
