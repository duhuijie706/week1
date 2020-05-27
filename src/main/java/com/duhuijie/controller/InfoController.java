package com.duhuijie.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.duhuijie.bean.Info;
import com.duhuijie.bean.Teacher;
import com.duhuijie.service.InfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class InfoController {
	//实例化InfoService
	@Autowired
	private InfoService infoService;
	
	//查询
	@RequestMapping("queryInfo")
	public String sayQueryInfo(Model model,@RequestParam(defaultValue = "1")Integer pageNum,
			@RequestParam(defaultValue = "")String name,
			@RequestParam(defaultValue = "")String tname){
		//将分页的数据存储到域中
		PageHelper.startPage(pageNum, 2);
		//实例化Map容器
		Map<String, Object> map = new HashMap<String, Object>();
		//将数据存储到容器中
		map.put("name", name);
		map.put("tname", tname);
		//执行查询
		List<Info> ilist = infoService.queryInfo(map);
		//开始分页
		PageInfo<Info> plist = new PageInfo<Info>(ilist);
		//获取到的Map容器中的数据存储到Model域中
		model.addAttribute("plist", plist);
		//存储到域中
		model.addAttribute("name", name);
		model.addAttribute("tname", tname);
		//页面分发
		return "list";
	}
	
	//查询老师
	@RequestMapping("queryTeacher")
	public List<Teacher> sayQueryTeacher(){
		//执行查询老师方法
		List<Teacher> tlist = infoService.queryTeacher();
		//返回值
		return tlist;
	}
	
	//添加
	@RequestMapping("Add")
	public String sayInsert(Info info){
		try {
			//执行添加方法
			infoService.insertInfo(info);
			//添加成功后
			return "redirect:queryAll";
		} catch (Exception e) {
			return "add";
		}
	}
}	