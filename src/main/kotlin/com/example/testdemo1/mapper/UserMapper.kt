package com.example.testdemo1.mapper

import com.example.testdemo1.common.TestBaseMapper
import com.example.testdemo1.entity.User
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper

@Mapper
interface UserMapper: TestBaseMapper<User>{
	
	@Insert("insert into user (id,name,age,add_time,add_user,update_time,update_user)"+
			"values (#{id},#{name},#{age},#{addTime},#{addUser},#{updateTime},#{updateUser})")
	fun addUser(user:User);
}