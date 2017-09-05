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
						<td name="cName">${cars.cName}</td>
					</tr>
					<tr>
						<td>系列：</td>
						<td name="cSeries">${cars.cSeries}</td>
					</tr>
					<tr>
						<td>系列类型：</td>
						<td name="ctype">${cars.ctype}</td>
					</tr>
					<tr>
						<td>真皮方向盘：</td>
						<td><input type="text" class="form-control input-sm"
							id="leathersteeringwheel" name="leathersteeringwheel"
							value="${cars.leathersteeringwheel}"></td>
					</tr>
					<tr>
						<td>方向盘电动调节：</td>
						<td><input type="text" class="form-control input-sm"
							id="steeringwheeladjustment" name="steeringwheeladjustment"
							value="${cars.steeringwheeladjustment}"></td>
					</tr>
					<tr>
						<td>多功能方向盘：</td>
						<td><input type="text" class="form-control input-sm"
							id="multifunctionals" name="multifunctionals"
							value="${cars.multifunctionals}"></td>
					</tr>
					<tr>
						<td>方向盘换挡：</td>
						<td><input type="text" class="form-control input-sm"
							id="steeringwheelshift" name="steeringwheelshift"
							value="${cars.steeringwheelshift}"></td>
					</tr>
					<tr>
						<td>方向盘加热：</td>
						<td><input type="text" class="form-control input-sm"
							id="steeringwheelheat" name="steeringwheelheat"
							value="${cars.steeringwheelheat}"></td>
					</tr>
					<tr>
						<td>方向盘记忆：</td>
						<td><input type="text" class="form-control input-sm"
							id="steeringwheelmemory" name="steeringwheelmemory"
							value="${cars.steeringwheelmemory}"></td>
					</tr>
					<tr>
						<td>行车电脑显示屏：</td>
						<td><input type="text" class="form-control input-sm"
							id="displayscreen" name="displayscreen"
							value="${cars.displayscreen}"></td>
					</tr>
					<tr>
						<td>全液晶仪表盘：</td>
						<td><input type="text" class="form-control input-sm"
							id="fulllcddashboard" name="fulllcddashboard"
							value="${cars.fulllcddashboard}"></td>
					</tr>
					<tr>
						<td>HUD抬头数字显示：</td>
						<td><input type="text" class="form-control input-sm"
							id="digitaldisplay" name="digitaldisplay"
							value="${cars.digitaldisplay}"></td>
					</tr>
					<tr>
						<td>内置行车记录仪：</td>
						<td><input type="text" class="form-control input-sm"
							id="builtrecorder" name="builtrecorder"
							value="${cars.builtrecorder}"></td>
					</tr>
					<tr>
						<td>主动降噪：</td>
						<td><input type="text" class="form-control input-sm"
							id="activenoiserreduction" name="activenoiserreduction"
							value="${cars.activenoiserreduction}"></td>
					</tr>
					<tr>
						<td>手机无线充电：</td>
						<td><input type="text" class="form-control input-sm"
							id="wirelesscharging" name="wirelesscharging"
							value="${cars.wirelesscharging}"></td>
					</tr>
				</table>
			</c:forEach>

		</form>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-primary" data-dismiss="modal"
			onclick="javascript:internal.update()">保存</button>
		<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>

	</div>
</body>
</html>