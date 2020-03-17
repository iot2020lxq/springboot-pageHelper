package cn.iot.pagehelper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;


import cn.iot.pagehelper.entity.User;
import cn.iot.pagehelper.mapper.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	public PageInfo<User> findUserList(Integer pageNum,Integer pageSize){
		PageInfo<User> pageInfo = userMapper.findUserModel(pageNum, pageSize);
		return pageInfo;
	}
	
}
