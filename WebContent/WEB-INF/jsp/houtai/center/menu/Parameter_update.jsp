
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
				<table style="margin: auto;">
					<tr>
						<td><input type="hidden" name="tId" value="${men.tId}"></td>
					</tr>

					<tr>
						<td>品牌：</td>
						<td><select name="cid" id="cid" style="width: 240px;" class="form-control input-sm">
							<c:forEach items="${car}" var="car" varStatus="vs">
								<option value="${car.id}" <c:if test="${car.id==men.cid}">selected="selected"</c:if>>${car.cName }</option>
			             	</c:forEach>
						</select></td>
					</tr>
					<tr>
					<td>系列：</td>
					<td><select name="sid" id="sid" style="width: 240px;"
						class="form-control input-sm">	
							<c:forEach items="${series}" var="series" varStatus="vs">
								<option value="${series.id}"<c:if test="${series.id==men.sid}">selected="selected"</c:if>>${series.cSeries}</option>
							</c:forEach>
					</select></td>
				</tr>
					<tr>
					<td>类型：</td>
					<td><input type="text" class="form-control input-sm"
						id="ctype" name="ctype" value="${men.ctype}"></td>
				</tr>
				<tr>
				<tr>
					<td>级别：</td>
					<td><input type="text" class="form-control input-sm"
						id="level" name="level" value="${men.level}"></td>
				</tr>
				<tr>
					<td>上市时间：</td>
					<td><input class="form_datetime form-control" type="text"
						 size="16" id="cTime_Market" name="cTime_Market" value="${men.cTime_Market}"></td>
				</tr>
				<tr>
					<td>发动机：</td>
					<td><input type="text" class="form-control input-sm"
						id="cEngine" name="cEngine" value="${men.cEngine}"></td>
				</tr>
				<tr>
					<td>变速箱：</td>
					<td><input type="text" class="form-control input-sm"
						id="cTransmission" name="cTransmission" value="${men.cTransmission}"></td>
				</tr>
				<tr>
					<td>长*宽*高(mm)：</td>
					<td><input type="text" class="form-control input-sm"
						id="cVolume" name="cVolume"value="${men.cVolume}"></td>
				</tr>
				<tr>
					<td>车身结构：</td>
					<td><input type="text" class="form-control input-sm"
						id="cStructure" name="cStructure"value="${men.cStructure}"></td>
				</tr>
				<tr>
					<td>最高车速(km/h)：</td>
					<td><input type="text" class="form-control input-sm"
						id="cMax_Speed" name="cMax_Speed"value="${men.cMax_Speed}"></td>
				</tr>
				<tr>
					<td>官方0-100km/h加速(s)：</td>
					<td><input type="text" class="form-control input-sm"
						id="officialacceleration" name="officialacceleration"value="${men.officialacceleration}"></td>
				</tr>
				<tr>
					<td>实测0-100km/h加速(s)：</td>
					<td><input type="text" class="form-control input-sm"
						id="measuredacceleration" name="measuredacceleration"value="${men.measuredacceleration}"></td>
				</tr>

				<tr>
					<td>实测0-100km/h制动(m)：</td>
					<td><input type="text" class="form-control input-sm"
						id="actualbraking" name="actualbraking"value="${men.actualbraking}"></td>
				</tr>


				<tr>
					<td>工信部综合油耗(L/100km)：</td>
					<td><input type="text" class="form-control input-sm"
						id="integratedcoil" name="integratedcoil"value="${men.integratedcoil}"></td>
				</tr>
				<tr>
					<td>实测油耗(L/100km)：</td>
					<td><input type="text" class="form-control input-sm" id="cOil"
						name="cOil"value="${men.cOil}"></td>
				</tr>
				<tr>
					<td>整车质保：</td>
					<td><input type="text" class="form-control input-sm"
						id="cVehicle_warranty" name="cVehicle_warranty" value="${men.cVehicle_warranty}"></td>
				</tr>
				<tr>
					<td>实测离地间隙（mm）：</td>
					<td><input type="text" class="form-control input-sm"
						id="groundclearance" name="groundclearance" value="${men.groundclearance}"></td>
				</tr>
				</table>
		</form>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-primary" data-dismiss="modal"
			onclick="javascript:paramater.update()">保存</button>
		<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>

	</div>
</body>
</html>