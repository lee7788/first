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
						<td>近光灯：</td>
						<td><input type="text" class="form-control input-sm"
							id="dippedheadlight" name="dippedheadlight" value="${cars.dippedheadlight}">
						</td>
					</tr>
					<tr>
						<td>远光灯：</td>
						<td><input type="text" class="form-control input-sm"
							id="highbeam" name="highbeam" value="${cars.highbeam}">
						</td>
					</tr>
					<tr>
						<td>LED日间行光灯：</td>
						<td><input type="text" class="form-control input-sm"
							id="leddaytimelight" name="leddaytimelight" value="${cars.leddaytimelight}">
						</td>
					</tr>
					<tr>
						<td>自适应远近光：</td>
						<td><input type="text" class="form-control input-sm"
							id="adaptivelight" name="adaptivelight" value="${cars.adaptivelight}">
						</td>
					</tr>
					<tr>
						<td>自动头灯：</td>
						<td><input type="text" class="form-control input-sm"
							id="automaticheadlamp" name="automaticheadlamp" value="${cars.automaticheadlamp}">
						</td>
					</tr>
					<tr>
						<td>转向辅助灯：</td>
						<td><input type="text" class="form-control input-sm"
							id="corneringlamp" name="corneringlamp" value="${cars.corneringlamp}">
						</td>
					</tr>
					<tr>
						<td>转向头灯：</td>
						<td><input type="text" class="form-control input-sm"
							id="turnheadlamp" name="turnheadlamp" value="${cars.turnheadlamp}">
						</td>
					</tr>
					<tr>
						<td>前雾灯：</td>
						<td><input type="text" class="form-control input-sm"
							id="frontfoglamp" name="frontfoglamp" value="${cars.frontfoglamp}">
						</td>
					</tr>
					<tr>
						<td>大灯高度可调：</td>
						<td><input type="text" class="form-control input-sm"
							id="heightadjustable" name="heightadjustable" value="${cars.heightadjustable}">
						</td>
					</tr>
					<tr>
						<td>大灯清洗装置：</td>
						<td><input type="text" class="form-control input-sm"
							id="cleaningdevice" name="cleaningdevice" value="${cars.cleaningdevice}">
						</td>
					</tr>
					<tr>
						<td>车内氛围灯：</td>
						<td><input type="text" class="form-control input-sm"
							id="interiorlight" name="interiorlight" value="${cars.interiorlight}">
						</td>
					</tr>
					

				</table>
			</c:forEach>

		</form>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-primary" data-dismiss="modal"
			onclick="javascript:light.update()">保存</button>
		<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>

	</div>
</body>
</html>