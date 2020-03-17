package cn.iot.pagehelper.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;

import cn.iot.pagehelper.entity.User;
import cn.iot.pagehelper.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/index")
	public Object index(int pageNum,int pageSize,HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		session.invalidate();
		
		PageInfo<User> userList = userService.findUserList(pageNum, pageSize);
		
		return userList;
	}
	
}
