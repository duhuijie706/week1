<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>

<script type="text/javascript">
	$(function() {
		$.post("queryInfo",function(data){
			var str ="";
			for ( var i in data) {
				str+="<option value='"+data[i].tid+"'>"+data[i].tname+"</option>"
			}
			$("#teacher").append(str);
		})
	})
</script>
</head>
<body>
	<form action="Add" enctype="multipart/form-data" method="post">
		宿舍:<input type="text" name="name"><br><br>
		老师:<select name="cid" id="teacher">
			<option value="">请选择老师</option>
		</select><br><br>
		状态:<select name="status">
			<option value="">请选择状态</option>
			<option value="1">已收被</option>
			<option value="0">晒被中</option>
		</select><br><br>
		<input type="submit" value="添加">
	</form>
</body>
</html>
