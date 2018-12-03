package com.example.testdemo1.entity

import org.springframework.boot.autoconfigure.domain.EntityScan

data  class User(
    var id: String? = null,

    var name: String? = null,

    var age: String? = null,
	
    var addTime: String? = null,
	
    var addUser: String? = null,
	
    var updateTime: String? = null,
	
    var updateUser: String? = null
)
	
