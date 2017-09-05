
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
					<td>主/副驾驶安全气囊：</td>
					<td><input type="text" class="form-control input-sm"
						id="mastersecondaryseatairbag" name="mastersecondaryseatairbag" value="${men.mastersecondaryseatairbag}"></td>
				</tr>
				<tr>
					<td>前/后排侧气囊：</td>
					<td><input type="text" class="form-control input-sm"
						id="frontandrearairbag" name="frontandrearairbag" value="${men.frontandrearairbag}"></td>
				</tr>
				<tr>
					<td>前/后头部气囊：</td>
					<td><input type="text" class="form-control input-sm"
						id="aircurtain" name="aircurtain" value="${men.aircurtain}"></td>
				</tr>
				<tr>
					<td>膝部气囊：</td>
					<td><input type="text" class="form-control input-sm"
						id="kneeairbag" name="kneeairbag" value="${men.kneeairbag}"></td>
				</tr>
				<tr>
					<td>胎压监测：</td>
					<td><input type="text" class="form-control input-sm"
						id="tirepressuremonitoring" name="tirepressuremonitoring" value="${men.tirepressuremonitoring}"></td>
				</tr>
				<tr>
					<td>安全带未系提示：</td>
					<td><input type="text" class="form-control input-sm"
						id="notindicated" name="notindicated" value="${men.notindicated}"></td>
				</tr>
				<tr>
					<td>IOSFIX儿童座椅接口：</td>
					<td><input type="text" class="form-control input-sm"
						id="childseatinterface" name="childseatinterface" value="${men.childseatinterface}"></td>
				</tr><tr>
					<td>ABS防抱死：</td>
					<td><input type="text" class="form-control input-sm"
						id="absabs" name="absabs" value="${men.absabs}"></td>
				</tr><tr>
					<td>制动力分配(EBD/CBC)：</td>
					<td><input type="text" class="form-control input-sm"
						id="brakingforcedistribution" name="brakingforcedistribution" value="${men.brakingforcedistribution}"></td>
				</tr><tr>
					<td>刹车辅助(EBA/BAS/BA)：</td>
					<td><input type="text" class="form-control input-sm"
						id="brakeassist" name="brakeassist" value="${men.brakeassist}"></td>
				</tr><tr>
					<td>牵引力控制(ASR/TCS/TRC)：</td>
					<td><input type="text" class="form-control input-sm"
						id="tractioncontrol" name="tractioncontrol" value="${men.tractioncontrol}"></td>
				</tr>
				<tr>
					<td>车身稳定控制(ESC/ESP/DSC)：</td>
					<td><input type="text" class="form-control input-sm"
						id="carbodycontrol" name="carbodycontrol" value="${men.carbodycontrol}"></td>
				</tr>
				<tr>
					<td>并线辅助：</td>
					<td><input type="text" class="form-control input-sm"
						id="auxiliary" name="auxiliary" value="${men.auxiliary}"></td>
				</tr>
				<tr>
					<td>车道偏离预警系统：</td>
					<td><input type="text" class="form-control input-sm"
						id="ldws" name="ldws" value="${men.ldws}"></td>
				</tr>
				<tr>
					<td>主动刹车/主动安全系统：</td>
					<td><input type="text" class="form-control input-sm"
						id="activebrake" name="activebrake" value="${men.activebrake}"></td>
				</tr>
				<tr>
					<td>夜视系统：</td>
					<td><input type="text" class="form-control input-sm"
						id="nightvisionsystem" name="nightvisionsystem" value="${men.nightvisionsystem}"></td>
				</tr>
				<tr>
					<td>疲劳驾驶提示：</td>
					<td><input type="text" class="form-control input-sm"
						id="fatiguedrivingtips" name="fatiguedrivingtips" value="${men.fatiguedrivingtips}"></td>
				</tr>
				</table>
			</c:forEach>
		</form>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-primary" data-dismiss="modal"
			onclick="javascript:safetydevice.update()">保存</button>
		<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>

	</div>
</body>
</html>