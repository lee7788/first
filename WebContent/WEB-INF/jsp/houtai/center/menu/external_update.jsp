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
						<td>电动天窗：</td>
						<td><input type="text" class="form-control input-sm"
							id="powersunroof" name="powersunroof" value="${cars.powersunroof}">
						</td>
					</tr>
					<tr>
						<td>全景天窗：</td>
						<td><input type="text" class="form-control input-sm"
							id="panoramicsunroof" name="panoramicsunroof" value="${cars.panoramicsunroof}">
						</td>
					</tr>
					<tr>
						<td>运动外观套件：</td>
						<td><input type="text" class="form-control input-sm"
							id="sportsappearancekit" name="sportsappearancekit" value="${cars.sportsappearancekit}">
						</td>
					</tr>
					<tr>
						<td>铝合金轮圈：</td>
						<td><input type="text" class="form-control input-sm"
							id="aluminumalloywheels" name="aluminumalloywheels" value="${cars.aluminumalloywheels}">
						</td>
					</tr>
					<tr>
						<td>电动吸合门：</td>
						<td><input type="text" class="form-control input-sm"
							id="electricpulldoor" name="electricpulldoor" value="${cars.electricpulldoor}">
						</td>
					</tr>
					<tr>
						<td>侧滑门：</td>
						<td><input type="text" class="form-control input-sm"
							id="sidedoor" name="sidedoor" value="${cars.sidedoor}">
						</td>
					</tr>
					<tr>
						<td>电动后备厢：</td>
						<td><input type="text" class="form-control input-sm"
							id="etrunk" name="etrunk" value="${cars.etrunk}">
						</td>
					</tr>
					<tr>
						<td>感应后备厢：</td>
						<td><input type="text" class="form-control input-sm"
							id="itrunk" name="itrunk" value="${cars.itrunk}">
						</td>
					</tr>
					<tr>
						<td>车顶行李架：</td>
						<td><input type="text" class="form-control input-sm"
							id="rrack" name="rrack" value="${cars.rrack}">
						</td>
					</tr>
					<tr>
						<td>发动机电子防盗：</td>
						<td><input type="text" class="form-control input-sm"
							id="eantitheft" name="eantitheft" value="${cars.eantitheft}">
						</td>
					</tr>
					<tr>
						<td>车内中控锁：</td>
						<td><input type="text" class="form-control input-sm"
							id="carlock" name="carlock" value="${cars.carlock}">
						</td>
					</tr>
					<tr>
						<td>遥控钥匙：</td>
						<td><input type="text" class="form-control input-sm"
							id="remotekey" name="remotekey" value="${cars.remotekey}">
						</td>
					</tr>
					<tr>
						<td>无钥匙启动：</td>
						<td><input type="text" class="form-control input-sm"
							id="keylessstart" name="keylessstart" value="${cars.keylessstart}">
						</td>
					</tr>
					<tr>
						<td>无钥匙进入：</td>
						<td><input type="text" class="form-control input-sm"
							id="keylessentry" name="keylessentry" value="${cars.keylessentry}">
						</td>
					</tr>
					<tr>
						<td>远程启动发动：</td>
						<td><input type="text" class="form-control input-sm"
							id="remotebootengine" name="remotebootengine" value="${cars.remotebootengine}">
						</td>
					</tr>

				</table>
			</c:forEach>

		</form>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-primary" data-dismiss="modal"
			onclick="javascript:external.update()">保存</button>
		<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>

	</div>
</body>
</html>