
package com.dao;



import java.util.List;



import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;



import com.model.User;





@Repository

public interface UserDAO extends CrudRepository<User, Integer> {

	public User findByUserName(String userName);

	

}