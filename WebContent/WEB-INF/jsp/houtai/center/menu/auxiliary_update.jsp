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
						<td>前后驻车雷达：</td>
						<td><input type="text" class="form-control input-sm"
							id="vehicleradar" name="vehicleradar" value="${cars.vehicleradar}">
						</td>
					</tr>
					<tr>
						<td>倒车视频影像：</td>
						<td><input type="text" class="form-control input-sm"
							id="reversingvideoimages" name="reversingvideoimages" value="${cars.reversingvideoimages}">
						</td>
					</tr>
					<tr>
						<td>全景摄像头：</td>
						<td><input type="text" class="form-control input-sm"
							id="panoramiccamera" name="panoramiccamera" value="${cars.panoramiccamera}">
						</td>
					</tr>
					<tr>
						<td>定速巡航：</td>
						<td><input type="text" class="form-control input-sm"
							id="cruisecontrol" name="cruisecontrol" value="${cars.cruisecontrol}">
						</td>
					</tr>
					<tr>
						<td>自适应巡航：</td>
						<td><input type="text" class="form-control input-sm"
							id="adaptivecruise" name="adaptivecruise" value="${cars.adaptivecruise}">
						</td>
					</tr>
					<tr>
						<td>自动泊车入位：</td>
						<td><input type="text" class="form-control input-sm"
							id="automaticparkingaccess" name="automaticparkingaccess" value="${cars.automaticparkingaccess}">
						</td>
					</tr>
					<tr>
						<td>发动机启停技术：</td>
						<td><input type="text" class="form-control input-sm"
							id="enginestartstop" name="enginestartstop" value="${cars.enginestartstop}">
						</td>
					</tr>
					<tr>
						<td>上坡辅助：</td>
						<td><input type="text" class="form-control input-sm"
							id="hillstartassist" name="hillstartassist" value="${cars.hillstartassist}">
						</td>
					</tr>
					<tr>
						<td>自动驻车：</td>
						<td><input type="text" class="form-control input-sm"
							id="automaticparking" name="automaticparking" value="${cars.automaticparking}">
						</td>
					</tr>
					<tr>
						<td>徒坡缓降：</td>
						<td><input type="text" class="form-control input-sm"
							id="gentleslopedescent" name="gentleslopedescent" value="${cars.gentleslopedescent}">
						</td>
					</tr>
					<tr>
						<td>可变悬架：</td>
						<td><input type="text" class="form-control input-sm"
							id="variablesuspension" name="variablesuspension" value="${cars.variablesuspension}">
						</td>
					</tr>
					<tr>
						<td>空气悬架：</td>
						<td><input type="text" class="form-control input-sm"
							id="airsuspension" name="airsuspension" value="${cars.airsuspension}">
						</td>
					</tr>
					<tr>
						<td>电磁感应悬架：</td>
						<td><input type="text" class="form-control input-sm"
							id="electromagneticsuspension" name="electromagneticsuspension" value="${cars.electromagneticsuspension}">
						</td>
					</tr>
					<tr>
						<td>可变转向比：</td>
						<td><input type="text" class="form-control input-sm"
							id="variablesteeringratio" name="variablesteeringratio" value="${cars.variablesteeringratio}">
						</td>
					</tr>
					<tr>
						<td>前桥限滑差速器/差速锁：</td>
						<td><input type="text" class="form-control input-sm"
							id="differentiallock" name="differentiallock" value="${cars.differentiallock}">
						</td>
					</tr>
					<tr>
						<td>中央差速器锁止功能：</td>
						<td><input type="text" class="form-control input-sm"
							id="centraldifferentiallock" name="centraldifferentiallock" value="${cars.centraldifferentiallock}">
						</td>
					</tr>
					<tr>
						<td>后桥限滑差速器/差速锁：</td>
						<td><input type="text" class="form-control input-sm"
							id="reardifferentiallock" name="reardifferentiallock" value="${cars.reardifferentiallock}">
						</td>
					</tr>
					<tr>
						<td>整体主动转向系统：</td>
						<td><input type="text" class="form-control input-sm"
							id="overallactivesteering" name="overallactivesteering" value="${cars.overallactivesteering}">
						</td>
					</tr>

				</table>
			</c:forEach>

		</form>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-primary" data-dismiss="modal"
			onclick="javascript:auxiliary.update()">保存</button>
		<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>

	</div>
</body>
</html>