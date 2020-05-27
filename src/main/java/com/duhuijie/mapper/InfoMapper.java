package com.duhuijie.mapper;

import java.util.List;
import java.util.Map;

import com.duhuijie.bean.Info;
import com.duhuijie.bean.Teacher;

public interface InfoMapper {
	
	
	//查询
	public List<Info> queryInfo(Map<String, Object> map);
	
	//查询老师
	public List<Teacher> queryTeacher();
	
	//添加
	public void insertInfo(Info info);
}
