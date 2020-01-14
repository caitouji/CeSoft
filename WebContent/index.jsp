<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
	request.setAttribute("path", path);
	request.setAttribute("basePath", basePath);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<br>
	<div>
		<a href="${path}/getAccountsToMap">getAccountsToMap</a>
	</div>
	<div>
		<a href="${path}/getAccountBasesToMap">getAccountBasesToMap</a>
	</div>

	<div>
		<a href="${path}/getUsersToList">getUsersToList</a>
	</div>
	<div>
		<a href="${path}/getUserByUserId/667">getUserByUserId</a>
	</div>

	<div>
		<a href="${path}/getDepartmentsToMap">getDepartmentsToMap</a>
	</div>
	<div>
		<a href="${path}/getDepartmentsToList">getUserByDeptIdToList</a>
	</div>
	<div>
		<a href="${path}/getDepartmentById/67">getDepartmentById</a>
	</div>
	<div>
		<a href="${path}/getDepartmentsToTreeNode">getDepartmentsToTreeNode</a>
	</div>


	<form action="${path}/testValid" method="POST">
		<div>
			<input id="id" name="id" value="3">
		</div>
		<div>
			<input id="name" name="name" value="ame">
		</div>
		<div>
			<input id="age" name="age" value="33">
		</div>
		<div>
			<input id="birthday" name="birthday" value="2020-01-08">
		</div>

		<input type="submit" value="submit">
	</form>

</body>
</html>