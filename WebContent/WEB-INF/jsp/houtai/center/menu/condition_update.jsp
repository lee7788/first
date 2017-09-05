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
			<c:forEach items="${cars}" var="cars" varStatus="vs">
				<table style="margin: auto;">
					<tr>
						<td><input type="hidden" name="tId" value="${cars.tId}"></td>
					</tr>
					<tr>
						<td>品牌：</td>
						<%-- <td><input type="text" class="form-control input-sm"
							id="cName" name="cName" value="${info.cName}"></td> --%>
						<td name="cName">${cars.cName}</td>
					</tr>
					<tr>
						<td>系列：</td>
						<%-- <td><input type="text" class="form-control input-sm"
							id="cSeries" name="cSeries" value="${info.cSeries}"></td> --%>
						<td name="cSeries">${cars.cSeries}</td>
					</tr>
					<tr>
						<td>系列类型：</td>
						<%-- <td><input type="text" class="form-control input-sm"
							id="cType" name="cType" value="${info.cType}"></td> --%>
						<td name="ctype">${cars.ctype}</td>
					</tr>
					<tr>
						<td>空调控制方式：</td>
						<td><input type="text" class="form-control input-sm"
							id="controlmode" name="controlmode" value="${cars.controlmode}">
						</td>
					</tr>
					<tr>
						<td>后排独立空调：</td>
						<td><input type="text" class="form-control input-sm"
							id="airconditioning" name="airconditioning" value="${cars.airconditioning}">
						</td>
					</tr>
					<tr>
						<td>后座出风口：</td>
						<td><input type="text" class="form-control input-sm"
							id="airoutlet" name="airoutlet" value="${cars.airoutlet}">
						</td>
					</tr>
					<tr>
						<td>温度分区控制：</td>
						<td><input type="text" class="form-control input-sm"
							id="zoncontrol" name="zoncontrol" value="${cars.zoncontrol}">
						</td>
					</tr>
					<tr>
						<td>车内空气调节/花粉过滤：</td>
						<td><input type="text" class="form-control input-sm"
							id="pollenfiltration" name="pollenfiltration" value="${cars.pollenfiltration}">
						</td>
					</tr>
					<tr>
						<td>车载冰箱：</td>
						<td><input type="text" class="form-control input-sm"
							id="carrefrigerator" name="carrefrigerator" value="${cars.carrefrigerator}">
						</td>
					</tr>
					<tr>
						<td>外观颜色：</td>
						<td><input type="text" class="form-control input-sm"
							id="cColor" name="cColor" value="${cars.cColor}">
						</td>
					</tr>
					<tr>
						<td>内饰颜色：</td>
						<td><input type="text" class="form-control input-sm"
							id="interiorcolor" name="interiorcolor" value="${cars.interiorcolor}">
						</td>
					</tr>

				</table>
			</c:forEach>

		</form>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-primary" data-dismiss="modal"
			onclick="javascript:condition.update()">保存</button>
		<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>

	</div>
</body>
</html>