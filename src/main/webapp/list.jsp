<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<table>
		<tr>
			<th colspan="8">
				<form action="queryInfo" method="post">
					宿舍号:<input type="text" name="name">-->负责老师:<input type="text" name="tname">
					<input type="submit" value="搜索">
				</form>
			</th>
		</tr>
		<tr>
			<th>ID</th>
			<th>宿舍号</th>
			<th>负责老师</th>
			<th>晾被时间</th>
			<th>状态</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${plist.list }" var="tt">
		<tr>
			<td>${tt.id }</td>
			<td>${tt.name }</td>
			<td>${tt.tname }</td>
			<td>${tt.uptime }</td>
			<td>${tt.status}</td>
			<td>
				<a href="add.jsp">添加</a>
			</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="8">
				当前${plist.pageNum }/${plist.pages }页,总共${plist.total }条数据
				<a href="?pageNum=1">首页</a>
				<a href="?pageNum=${plist.prePage }">上一页</a>
				<a href="?pageNum=${plist.nextPage }">下一页</a>
				<a href="?pageNum=${plist.lastPage }">末页</a>
			</td>
		</tr>
	</table>

</body>
</html>