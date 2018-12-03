package com.example.testdemo1.service

import com.example.testdemo1.entity.User

interface IUserService {
	fun insertUser():User
	fun getUserList():List<User>
	fun getUserById(id:String):User
}