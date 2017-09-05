<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%-- <jsp:include page="../../../base/taglib.jsp"></jsp:include> --%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>

	<div class="panel panel-default">
		<div class="panel-heading">
			<h3 class="panel-title">新增页面</h3>
		</div>
	</div>
	<div class="modal-body">
		<form id="form">
			<table  style="margin: auto;">
			
				<tr>
						<td>用户名：</td>						
						<td>
						<select name="userId" id="userId" style="width: 240px;" class="form-control input-sm">
							<option value="0">-用户名-</option>
							<c:forEach items="${users}" var="users" varStatus="vs">
								<option value="${users.id}" <c:if test="${users.id==power.userId}">selected="selected"</c:if>>${users.name }</option>
			             	</c:forEach>
						</select>
						</td>
					</tr>
				<tr>
						<td>模块名：</td>
						<td>
						<select name="menuId" id="menuId" style="width: 240px;" class="form-control input-sm">
							<option value="0">-模块名-</option>
							<c:forEach items="${menus}" var="menus" varStatus="vs">
								<option value="${menus.id}" <c:if test="${menus.id==power.menuId}">selected="selected"</c:if>>${menus.name }</option>
			             	</c:forEach>
						</select>
						</td>
					</tr>
				
			</table>
		</form>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-primary" data-dismiss="modal"
			onclick="javascript:power.addSave()">保存</button>
		<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>

	</div>

</body>
</html>