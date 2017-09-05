<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>

	<div class="panel panel-default">
		<div class="panel-heading">
			<h3 class="panel-title">基本配置</h3>
		</div>
	</div>
	<div class="modal-body">
		<form id="form">
			<table style="margin: auto;">
				<tr>

					<td>品牌：</td>
					<td><select name="cid" id="cid" style="width: 240px;"
						class="form-control input-sm">
							<option value="0">-品牌名-</option>
							<c:forEach items="${men}" var="men" varStatus="vs">
								<option value="${men.id}">${men.cName }</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td>系列：</td>
					<td><select name="sid" id="sid" style="width: 240px;"
						class="form-control input-sm">
							<option value="0">-系列-</option>
							<c:forEach items="${series}" var="series" varStatus="vs">
								<option value="${series.id}">${series.cSeries}</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td>类型：</td>
					<td><input type="text" class="form-control input-sm"
						id="ctype" name="ctype"></td>
				</tr>
				<tr>
				<tr>
					<td>级别：</td>
					<td><input type="text" class="form-control input-sm"
						id="level" name="level"></td>
				</tr>
				<tr>
					<td>上市时间：</td>
					<td><input class="form_datetime form-control" type="text"
						value="2016-03-07" size="16" id="cTime_Market" name="cTime_Market"></td>
				</tr>
				<tr>
					<td>发动机：</td>
					<td><input type="text" class="form-control input-sm"
						id="cEngine" name="cEngine"></td>
				</tr>
				<tr>
					<td>变速箱：</td>
					<td><input type="text" class="form-control input-sm"
						id="cTransmission" name="cTransmission"></td>
				</tr>
				<tr>
					<td>长*宽*高(mm)：</td>
					<td><input type="text" class="form-control input-sm"
						id="cVolume" name="cVolume"></td>
				</tr>
				<tr>
					<td>车身结构：</td>
					<td><input type="text" class="form-control input-sm"
						id="cStructure" name="cStructure"></td>
				</tr>
				<tr>
					<td>最高车速(km/h)：</td>
					<td><input type="text" class="form-control input-sm"
						id="cMax_Speed" name="cMax_Speed"></td>
				</tr>
				<tr>
					<td>官方0-100km/h加速(s)：</td>
					<td><input type="text" class="form-control input-sm"
						id="officialacceleration" name="officialacceleration"></td>
				</tr>
				<tr>
					<td>实测0-100km/h加速(s)：</td>
					<td><input type="text" class="form-control input-sm"
						id="measuredacceleration" name="measuredacceleration"></td>
				</tr>

				<tr>
					<td>实测0-100km/h制动(m)：</td>
					<td><input type="text" class="form-control input-sm"
						id="actualbraking" name="actualbraking"></td>
				</tr>


				<tr>
					<td>工信部综合油耗(L/100km)：</td>
					<td><input type="text" class="form-control input-sm"
						id="integratedcoil" name="integratedcoil"></td>
				</tr>
				<tr>
					<td>实测油耗(L/100km)：</td>
					<td><input type="text" class="form-control input-sm" id="cOil"
						name="cOil"></td>
				</tr>
				<tr>
					<td>整车质保：</td>
					<td><input type="text" class="form-control input-sm"
						id="cVehicle_warranty" name="cVehicle_warranty"></td>
				</tr>
				<tr>
					<td>实测离地间隙（mm）：</td>
					<td><input type="text" class="form-control input-sm"
						id="groundclearance" name="groundclearance"></td>
				</tr>
			</table>
		</form>
	</div>
	<div class="modal-footer">
		<button id="save" type="button" class="btn btn-primary"
			data-dismiss="modal" onclick="javascript:paramater.addSave()">保存</button>
		<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>

	</div>

</body>
</html>