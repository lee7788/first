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
			<h3 class="panel-title">修改菜单</h3>
		</div>
	</div>
	<div class="modal-body" id="update">
		<form id="form1">
			<c:forEach items="${info}" var="info" varStatus="vs">
				<table style="margin: auto;">
					<tr>
						<td><input type="hidden" name="id" value="${info.id}"></td>
					</tr>
					<tr>
						<td>品牌：</td>
						<%-- <td><input type="text" class="form-control input-sm"
							id="cName" name="cName" value="${info.cName}"></td> --%>
						<td name="cName">${info.cName}</td>
					</tr>
					<tr>
						<td>系列：</td>
						<%-- <td><input type="text" class="form-control input-sm"
							id="cSeries" name="cSeries" value="${info.cSeries}"></td> --%>
						<td name="cSeries">${info.cSeries}</td>
					</tr>
					<tr>
						<td>系列类型：</td>
						<%-- <td><input type="text" class="form-control input-sm"
							id="cType" name="cType" value="${info.cType}"></td> --%>
						<td name="cType">${info.cType}</td>
					</tr>
					<tr>
						<td>供应商：</td>
						
						
						<td>
						<select name="cSupplier" id="cSupplier" style="width: 240px;" class="form-control input-sm">
							<c:forEach items="${users}" var="users" varStatus="vs">
								<option value="${users.id}" <c:if test="${user.id==info.cSupplier}">selected="selected"</c:if>>${users.name }</option>
			             	</c:forEach>
						</select>
						</td>
					</tr>

				</table>
			</c:forEach>

		</form>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-primary" data-dismiss="modal"
			onclick="javascript:info.update()">保存</button>
		<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>

	</div>
</body>
</html>