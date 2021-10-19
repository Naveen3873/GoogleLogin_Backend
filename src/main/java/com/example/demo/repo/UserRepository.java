package com.example.demo.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.User;


public interface UserRepository extends CrudRepository<User, Integer> {
	
	@Query("SELECT u FROM User u WHERE u.username = ?1 and u.password = ?2")
	public User findByUsernameAndPassword(String username, String password);
}

//package com.example.demo.repo;
//
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//
//import com.example.demo.model.Admin;
//
//public interface AdminRepository extends CrudRepository<Admin, Integer> {
//
//	@Query("SELECT ad FROM Admin ad WHERE ad.userName = ?1 and ad.password = ?2")
//	public Admin findByUsernameAndPassword(String userName, String password);
//}
