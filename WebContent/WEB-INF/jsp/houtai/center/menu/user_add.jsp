<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>

	<div class="panel panel-default">
		<div class="panel-heading">
			<h3 class="panel-title">新增用户</h3>
		</div>
	</div>
	<div class="modal-body">
		<form id="form">
			<table style="margin: auto;">
		        <tr>
					<td>用户名：</td>
					<td><input type="text"  class="form-control input-sm"
						name="name" id="name"></td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><input type="text"  class="form-control input-sm"
						name="password" id="password"></td>
				</tr>
			</table>
		</form>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-primary" data-dismiss="modal"
			onclick="javascript:user.addSave()">保存</button>
		<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>

	</div>

</body>
</html>