package com.example.testdemo1.service.impl

import com.example.testdemo1.entity.User
import com.example.testdemo1.mapper.UserMapper
import com.example.testdemo1.service.IUserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
@Service
open class UserService:IUserService {
	@Autowired
	lateinit var userMapper: UserMapper;
	
	override fun insertUser():User{
		var user = User("1","张三丰","20","2018123","张三丰","2018123","张三丰")
		userMapper.insert(user);
		return user
	}
	override  fun getUserList():List<User>{
		var userList = userMapper.selectList(null);		
		userList?.forEach{item -> println(item)}
		return userList
	}
	override  fun getUserById(id:String):User{
		var user = userMapper.selectById(id);
		return user;
	}
	
}