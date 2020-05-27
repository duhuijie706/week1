package com.duhuijie.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duhuijie.bean.Info;
import com.duhuijie.bean.Teacher;
import com.duhuijie.mapper.InfoMapper;

@Service
public class InfoServiceImpl implements InfoService {

	// 实例化INfo
	@Autowired
	private InfoMapper infoMapper;

	// 查询
	@Override
	public List<Info> queryInfo(Map<String, Object> map) {
		return infoMapper.queryInfo(map);
	}

	//查询老师
	@Override
	public List<Teacher> queryTeacher() {
		// TODO Auto-generated method stub
		return null;
	}

	//添加
	@Override
	public void insertInfo(Info info) {
		// TODO Auto-generated method stub

	}
}
