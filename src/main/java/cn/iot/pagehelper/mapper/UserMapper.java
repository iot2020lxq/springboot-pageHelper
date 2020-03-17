package cn.iot.pagehelper.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.iot.pagehelper.entity.User;

public interface UserMapper {

	@Select("select * from users")
	public List<User> findUserList();
	
	default PageInfo<User> findUserModel(int pageNum,int pageSize ) {
		PageHelper.startPage(pageNum,pageSize);
		List<User> userList = findUserList();
		PageInfo<User> pageInfo = new PageInfo<User>(userList,5);
		return pageInfo;
	}
	
}
