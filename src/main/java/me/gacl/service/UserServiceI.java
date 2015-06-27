package me.gacl.service;

import java.io.Serializable;

import me.gacl.model.User;

import com.ancs.core.service.IBaseManager;

/**
 * 测试
 * 
 * @author gacl
 *
 */
public interface UserServiceI{

	/**
	 * 测试方法
	 */
	void test();

	/**
	 * 保存用户
	 * 
	 * @param user
	 * @return*/
	 
	Serializable save(User user);

}