package com.example.testdemo1.web

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import com.example.testdemo1.service.impl.UserService
import javax.annotation.Resource
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import com.example.testdemo1.entity.User
import org.springframework.web.bind.annotation.PathVariable

@RestController
class UserController {
	
	@Autowired
	lateinit var userService: UserService;
	
	@PostMapping("/user")
	fun insertUser():User{
		return userService.insertUser();
	}
	@GetMapping("/user/list")
	fun getUserList():List<User>{
		return userService.getUserList();
	}
	@GetMapping("/user/{id}")
	fun getUserById(@PathVariable id:String):User{
		return userService.getUserById(id);
	}
}