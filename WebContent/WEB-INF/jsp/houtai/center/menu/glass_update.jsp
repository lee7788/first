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
						<td>前/后电动车窗：</td>
						<td><input type="text" class="form-control input-sm"
							id="powerwindow" name="powerwindow" value="${cars.powerwindow}">
						</td>
					</tr>
					<tr>
						<td>车窗一键升降：</td>
						<td><input type="text" class="form-control input-sm"
							id="windowkeylift" name="windowkeylift" value="${cars.windowkeylift}">
						</td>
					</tr>
					<tr>
						<td>车窗防夹手：</td>
						<td><input type="text" class="form-control input-sm"
							id="clampholder" name="clampholder" value="${cars.clampholder}">
						</td>
					</tr>
					<tr>
						<td>防紫外线/隔热玻璃：</td>
						<td><input type="text" class="form-control input-sm"
							id="insulatingglass" name="insulatingglass" value="${cars.insulatingglass}">
						</td>
					</tr>
					<tr>
						<td>后视镜电动调节：</td>
						<td><input type="text" class="form-control input-sm"
							id="rearviewmirrorelectric" name="rearviewmirrorelectric" value="${cars.rearviewmirrorelectric}">
						</td>
					</tr>
					<tr>
						<td>后视镜加热：</td>
						<td><input type="text" class="form-control input-sm"
							id="rearviewmirrorheat" name="rearviewmirrorheat" value="${cars.rearviewmirrorheat}">
						</td>
					</tr>
					<tr>
						<td>内外后视镜自动防炫目：</td>
						<td><input type="text" class="form-control input-sm"
							id="automaticantiglare" name="automaticantiglare" value="${cars.automaticantiglare}">
						</td>
					</tr>
					<tr>
						<td>流媒体车内后视镜：</td>
						<td><input type="text" class="form-control input-sm"
							id="mediumvehicle" name="mediumvehicle" value="${cars.mediumvehicle}">
						</td>
					</tr>
					<tr>
						<td>后视镜电动折叠：</td>
						<td><input type="text" class="form-control input-sm"
							id="powerfolding" name="powerfolding" value="${cars.powerfolding}">
						</td>
					</tr>
					<tr>
						<td>后视镜记忆：</td>
						<td><input type="text" class="form-control input-sm"
							id="mirrormemory" name="mirrormemory" value="${cars.mirrormemory}">
						</td>
					</tr>
					<tr>
						<td>后风遮挡阳帘：</td>
						<td><input type="text" class="form-control input-sm"
							id="suncurtain" name="suncurtain" value="${cars.suncurtain}">
						</td>
					</tr>
					<tr>
						<td>后排侧遮阳帘：</td>
						<td><input type="text" class="form-control input-sm"
							id="rearsideshade" name="rearsideshade" value="${cars.rearsideshade}">
						</td>
					</tr>
					<tr>
						<td>后排侧隐私玻璃：</td>
						<td><input type="text" class="form-control input-sm"
							id="privacyglass" name="privacyglass" value="${cars.privacyglass}">
						</td>
					</tr>
					<tr>
						<td>遮阳板化妆镜：</td>
						<td><input type="text" class="form-control input-sm"
							id="shadingmirror" name="shadingmirror" value="${cars.shadingmirror}">
						</td>
					</tr>
					<tr>
						<td>后雨刷：</td>
						<td><input type="text" class="form-control input-sm"
							id="rearwiper" name="rearwiper" value="${cars.rearwiper}">
						</td>
					</tr>
					<tr>
						<td>感应雨刷：</td>
						<td><input type="text" class="form-control input-sm"
							id="inductionwiper" name="inductionwiper" value="${cars.inductionwiper}">
						</td>
					</tr>

				</table>
			</c:forEach>

		</form>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-primary" data-dismiss="modal"
			onclick="javascript:glass.update()">保存</button>
		<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>

	</div>
</body>
</html>