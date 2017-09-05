
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
			<c:forEach items="${men}" var="men" varStatus="vs">
				<table style="margin: auto;">
					<tr>
						<td><input type="hidden" name="tId" value="${men.tId}"></td>
					</tr>

					<tr>
						<td>品牌：</td>
						<td name="cName">${men.cName}</td>
					</tr>
					<tr>
						<td>系列：</td>
						<td name="cSeries">${men.cSeries}</td>

					</tr>
					<tr>
						<td>类型：</td>
						<td name="ctype">${men.ctype}</td>
					</tr>
			    <tr>
					<td>变速箱：</td>
					<td><input type="text" class="form-control input-sm"
						id="cTransmission" name="cTransmission" value="${men.cTransmission}"></td>
				</tr>
				<tr>
					<td>档位个数(个)：</td>
					<td><input type="text" class="form-control input-sm"
						id="cGear_Number" name="cGear_Number" value="${men.cGear_Number}"></td>
				</tr>
				<tr>
					<td>变速箱类型：</td>
					<td><input type="text" class="form-control input-sm"
						id="cType_Gearbox" name="cType_Gearbox" value="${men.cType_Gearbox}"></td>
				</tr>
				</table>
			</c:forEach>
		</form>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-primary" data-dismiss="modal"
			onclick="javascript:gearbox.update()">保存</button>
		<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>

	</div>
</body>
</html>