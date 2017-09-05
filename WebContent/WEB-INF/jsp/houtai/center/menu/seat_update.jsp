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
						<td>座椅材质：</td>
						<td><input type="text" class="form-control input-sm"
							id="seatmaterial" name="seatmaterial" value="${cars.seatmaterial}">
						</td>
					</tr>
					<tr>
						<td>运动风格座椅：</td>
						<td><input type="text" class="form-control input-sm"
							id="sportstyleseat" name="sportstyleseat" value="${cars.sportstyleseat}">
						</td>
					</tr>
					<tr>
						<td>座椅高低调节：</td>
						<td><input type="text" class="form-control input-sm"
							id="seatadjustment" name="seatadjustment" value="${cars.seatadjustment}">
						</td>
					</tr>
					<tr>
						<td>腰部支撑调节：</td>
						<td><input type="text" class="form-control input-sm"
							id="lumbarsupport" name="lumbarsupport" value="${cars.lumbarsupport}">
						</td>
					</tr>
					<tr>
						<td>肩部支撑调节：</td>
						<td><input type="text" class="form-control input-sm"
							id="shouldersupport" name="shouldersupport" value="${cars.shouldersupport}">
						</td>
					</tr>
					<tr>
						<td>驾驶座电动调节：</td>
						<td><input type="text" class="form-control input-sm"
							id="driverelectricadjustment" name="driverelectricadjustment" value="${cars.driverelectricadjustment}">
						</td>
					</tr>
					<tr>
						<td>第二排靠背角度调节：</td>
						<td><input type="text" class="form-control input-sm"
							id="secondrowadjust" name="secondrowadjust" value="${cars.secondrowadjust}">
						</td>
					</tr>
					<tr>
						<td>第二排座椅移动：</td>
						<td><input type="text" class="form-control input-sm"
							id="movesecondrow" name="movesecondrow" value="${cars.movesecondrow}">
						</td>
					</tr>
					<tr>
						<td>后排座椅电动调节：</td>
						<td><input type="text" class="form-control input-sm"
							id="rearseat" name="rearseat" value="${cars.rearseat}">
						</td>
					</tr>
					<tr>
						<td>副驾驶后排可调节按钮：</td>
						<td><input type="text" class="form-control input-sm"
							id="reardriverbutton" name="reardriverbutton" value="${cars.reardriverbutton}">
						</td>
					</tr>
					<tr>
						<td>电动座椅记忆：</td>
						<td><input type="text" class="form-control input-sm"
							id="electricseatmemory" name="electricseatmemory" value="${cars.electricseatmemory}">
						</td>
					</tr>
					<tr>
						<td>座椅加热：</td>
						<td><input type="text" class="form-control input-sm"
							id="seatheating" name="seatheating" value="${cars.seatheating}">
						</td>
					</tr>
					<tr>
						<td>座椅通风：</td>
						<td><input type="text" class="form-control input-sm"
							id="seatventilation" name="seatventilation" value="${cars.seatventilation}">
						</td>
					</tr>
					<tr>
						<td>座椅按摩：</td>
						<td><input type="text" class="form-control input-sm"
							id="seatarrangement" name="seatarrangement" value="${cars.seatarrangement}">
						</td>
					</tr>
					<tr>
						<td>第二排独立座椅：</td>
						<td><input type="text" class="form-control input-sm"
							id="secondrowseat" name="secondrowseat" value="${cars.secondrowseat}">
						</td>
					</tr>
					<tr>
						<td>第三排座椅：</td>
						<td><input type="text" class="form-control input-sm"
							id="thirdrowseat" name="thirdrowseat" value="${cars.thirdrowseat}">
						</td>
					</tr>
					<tr>
						<td>后排座椅放倒方式：</td>
						<td><input type="text" class="form-control input-sm"
							id="rearseatmode" name="rearseatmode" value="${cars.rearseatmode}">
						</td>
					</tr>
					<tr>
						<td>前后中央扶手：</td>
						<td><input type="text" class="form-control input-sm"
							id="armrest" name="armrest" value="${cars.armrest}">
						</td>
					</tr>
					<tr>
						<td>后排杯架：</td>
						<td><input type="text" class="form-control input-sm"
							id="rearcupholder" name="rearcupholder" value="${cars.rearcupholder}">
						</td>
					</tr>
					<tr>
						<td>可加热/制冷杯架：</td>
						<td><input type="text" class="form-control input-sm"
							id="heatingcupholder" name="heatingcupholder" value="${cars.heatingcupholder}">
						</td>
					</tr>

				</table>
			</c:forEach>

		</form>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-primary" data-dismiss="modal"
			onclick="javascript:seat.update()">保存</button>
		<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>

	</div>
</body>
</html>