package com.duhuijie.bean;

import java.util.Date;

public class Info {
	private Integer id;
	private String name;
	private Date uptime;
	private Integer status;
	
	//临时字段
	private String tname;

	public Info() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Info(Integer id, String name, Date uptime, Integer status, String tname) {
		super();
		this.id = id;
		this.name = name;
		this.uptime = uptime;
		this.status = status;
		this.tname = tname;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getUptime() {
		return uptime;
	}

	public void setUptime(Date uptime) {
		this.uptime = uptime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "Info [id=" + id + ", name=" + name + ", uptime=" + uptime + ", status=" + status + ", tname=" + tname
				+ "]";
	}
}