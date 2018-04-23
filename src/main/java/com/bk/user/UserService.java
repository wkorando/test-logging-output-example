package com.bk.user;

import java.util.List;

public interface UserService {

	List<User> findAllUsers();

	User addNewUser(User user);

}
