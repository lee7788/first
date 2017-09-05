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
			<h3 class="panel-title">新增汽车参数</h3>
		</div>
	</div>
	<div class="modal-body">
		<form id="form">
			<table style="margin: auto;">
				<tr>
		
					<td>品牌：</td>
					<td>
						<select name="cid" id="cid" style="width: 240px;" class="form-control input-sm">
							<option value="0">-品牌名-</option>
							<c:forEach items="${men}" var="men" varStatus="vs">
								<option value="${men.id}">${men.cName }</option>
			             	</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td>系列：</td>
					<td><input type="text" class="form-control input-sm"
						id="ctype" name="ctype"></td>
				</tr>
				<%-- <tr>
					<td>父级：</td>
					<td>
						<select name="parent" id="parent" style="width: 240px;" class="form-control input-sm">
							<option value="0">-父级-</option>
							<c:forEach items="${menus}" var="menu" varStatus="vs">
								<option value="${menu.id}">${menu.name }</option>
			             	</c:forEach>
						</select>
					</td>
				</tr>--%>
				<tr>
					<td>车长：</td>
					<td><input type="text" class="form-control input-sm"
						id="cVolume" name="cVolume"></td>
				</tr>
				<tr>
					<td>发动机：</td>
					<td><input type="text" class="form-control input-sm"
						id="cEngine" name="cEngine"></td>
				</tr>
				<tr>
					<td>变速箱类型：</td>
					<td><input type="text" class="form-control input-sm"
						id="cType_Gearbox" name="cType_Gearbox"></td>
				</tr>
				<tr>
					<td>档位个数(个)：</td>
					<td><input type="text" class="form-control input-sm"
						id="cGear_Number" name="cGear_Number"></td>
				</tr>
				<tr>
					<td>油耗：</td>
					<td><input type="text" class="form-control input-sm" id="cOil"
						name="cOil"></td>
				</tr>
				<tr>
					<td>燃烧形式：</td>
					<td><input type="text" class="form-control input-sm"
						id="cCombustion_Form" name="cCombustion_Form"></td>
				</tr>
				<tr>
					<td>燃油编号：</td>
					<td><input type="text" class="form-control input-sm"
						id="cFuel_Numbert" name="cFuel_Number"></td>
				</tr>
				<tr>
					<td>供油方式：</td>
					<td><input type="text" class="form-control input-sm"
						id="cOil_Supply_Way" name="cOil_Supply_Way"></td>
				</tr>
				<tr>
					<td>上市时间：</td>
					<td>

<input class="form_datetime form-control" type="text" value="2016-03-07" size="16" name="cTime_Market">
</td>
				</tr>
				<tr>
					<td>变速箱：</td>
					<td><input type="text" class="form-control input-sm"
						id="cTransmission" name="cTransmission"></td>
				</tr>
				<tr>
					<td>车颜色：</td>
					<td><input type="text" class="form-control input-sm"
						id="cColor" name="cColor"></td>
				</tr>
				<tr>
					<td>轴距（mm）：</td>
					<td><input type="text" class="form-control input-sm"
						id="cWheelbase" name="cWheelbase"></td>
				</tr>
				<tr>
					<td>油箱容积：</td>
					<td><input type="text" class="form-control input-sm"
						id="cTank_Volume" name="cTank_Volume"></td>
				</tr>
				<tr>
					<td>行李箱容积：</td>
					<td><input type="text" class="form-control input-sm"
						id="cLuggage_Space" name="cLuggage_Space"></td>
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
					<td>质保：</td>
					<td><input type="text" class="form-control input-sm"
						id="cVehicle_warranty" name="cVehicle_warranty"></td>
				</tr>
				<tr>
					<td>进气形式：</td>
					<td><input type="text" class="form-control input-sm"
						id="cAir_Intake" name="cAir_Intake"></td>
				</tr>
				<tr>
					<td>气缸数(个)：</td>
					<td><input type="text" class="form-control input-sm"
						id="cNumber_Cylinders" name="cNumber_Cylinders"></td>
				</tr>
				<tr>
					<td>最大马力（Ps）：</td>
					<td><input type="text" class="form-control input-sm"
						id="cMaximum_Horsepower" name="cMaximum_Horsepower"></td>
				</tr>
				<tr>
					<td>最大功率（kw）：</td>
					<td><input type="text" class="form-control input-sm"
						id="cMost_Powerful" name="cMost_Powerful"></td>
				</tr>
				<tr>
					<td>最大扭矩（N.m）：</td>
					<td><input type="text" class="form-control input-sm"
						id="cMaximum_Torque" name="cMaximum_Torque"></td>
				</tr>
				<tr>
					<td>最大功率转速（rpm）：</td>
					<td><input type="text" class="form-control input-sm"
						id="cMaximum_Torque_Speed" name="cMaximum_Torque_Speed"></td>
				</tr>
			</table>
		</form>
	</div>
	<div class="modal-footer">
		<button  id="save"type="button" class="btn btn-primary" data-dismiss="modal"
			onclick="javascript:car.addSave()">保存</button>
		<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>

	</div>

</body>
</html>