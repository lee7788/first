
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
						<td>排量：</td>
						<td><input type="text" class="form-control input-sm"
							id="displacement" name="displacement" value="${men.displacement}"></td>
					</tr>
					<tr>
						<td>进气形式：</td>
						<td><input type="text" class="form-control input-sm"
							id="cAir_Intake" name="cAir_Intake" value="${men.cAir_Intake}"></td>
					</tr>
					<tr>
						<td>气缸排列形式：</td>
						<td><input type="text" class="form-control input-sm"
							id="arrangement" name="arrangement" value="${men.arrangement}"></td>
					</tr>
					<tr>
						<td>气缸数(个)：</td>
						<td><input type="text" class="form-control input-sm"
							id="cNumber_Cylinders" name="cNumber_Cylinders" value="${men.cNumber_Cylinders}"></td>
					</tr>
					<tr>
						<td>每缸气门数(个)：</td>
						<td><input type="text" class="form-control input-sm"
							id="valvetrain" name="valvetrain" value="${men.valvetrain}"></td>
					</tr>
					<tr>
						<td>压缩比：</td>
						<td><input type="text" class="form-control input-sm"
							id="compressiontatio" name="compressiontatio"
							value="${men.compressiontatio}"></td>
					</tr>
					<tr>
						<td>配气机构：</td>
						<td><input type="text" class="form-control input-sm"
							id="valvetrain1" name="valvetrain1" value="${men.valvetrain1}"></td>
					</tr>
					<tr>
						<td>缸径(mm)：</td>
						<td><input type="text" class="form-control input-sm"
							id="bore" name="bore" value="${men.bore}"></td>
					</tr>
					<tr>
						<td>行程(mm)：</td>
						<td><input type="text" class="form-control input-sm"
							id="trip" name="trip" value="${men.trip}"></td>
					</tr>
					<tr>
						<td>最大马力（Ps）：</td>
						<td><input type="text" class="form-control input-sm"
							id="cMaximum_Horsepower" name="cMaximum_Horsepower" value="${men.cMaximum_Horsepower}"></td>
					</tr>
					<tr>
						<td>最大功率（kw）：</td>
						<td><input type="text" class="form-control input-sm"
							id="cMost_Powerful" name="cMost_Powerful"
							value="${men.cMost_Powerful}"></td>
					</tr>
					<tr>
						<td>最大扭矩（N.m）：</td>
						<td><input type="text" class="form-control input-sm"
							id="cMaximum_Torque" name="cMaximum_Torque"
							value="${men.cMaximum_Torque}"></td>
					</tr>
					<tr>
						<td>最大功率转速（rpm）：</td>
						<td><input type="text" class="form-control input-sm"
							id="cMaximum_Torque_Speed" name="cMaximum_Torque_Speed"
							value="${men.cMaximum_Torque_Speed}"></td>
					</tr>
					<tr>
						<td>最大扭矩转速（rpm）：</td>
						<td><input type="text" class="form-control input-sm"
							id="maximum_TorqueSpeed" name="maximum_TorqueSpeed"
							value="${men.maximum_TorqueSpeed}"></td>
					</tr>
					<tr>
						<td>发动机特有技术：</td>
						<td><input type="text" class="form-control input-sm"
							id="engineSpecificTechnology" name="engineSpecificTechnology"
							value="${men.engineSpecificTechnology}"></td>
					</tr>
					
					<tr>
						<td>燃料形式：</td>
						<td><input type="text" class="form-control input-sm"
							id="cCombustion_Form" name="cCombustion_Form"
							value="${men.cCombustion_Form}"></td>
					</tr>
					<tr>
						<td>燃油编号：</td>
						<td><input type="text" class="form-control input-sm"
							id="cFuel_Number" name="cFuel_Number"
							value="${men.cFuel_Number}"></td>
					</tr>
					<tr>
						<td>供油方式：</td>
						<td><input type="text" class="form-control input-sm"
							id="cOil_Supply_Way" name="cOil_Supply_Way"
							value="${men.cOil_Supply_Way}"></td>
					</tr>
					<tr>
						<td>缸盖材料：</td>
						<td><input type="text" class="form-control input-sm"
							id="cylinderheadmaterial" name="cylinderheadmaterial"
							value="${men.cylinderheadmaterial}"></td>
					</tr>
					<tr>
						<td>缸体材料：</td>
						<td><input type="text" class="form-control input-sm"
							id="cylindermaterial" name="cylindermaterial"
							value="${men.cylindermaterial}"></td>
					</tr>
					<tr>
						<td>环保标准：</td>
						<td><input type="text" class="form-control input-sm"
							id="environmentalstandard" name="environmentalstandard"
							value="${men.environmentalstandard}"></td>
					</tr>

				</table>
			</c:forEach>
		</form>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-primary" data-dismiss="modal"
			onclick="javascript:engine.update()">保存</button>
		<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>

	</div>
</body>
</html>