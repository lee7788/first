
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
						<td>长度(mm)：</td>
						<td><input type="text" class="form-control input-sm"
							id="length" name="length" value="${men.length}"></td>
					</tr>
					<tr>
						<td>宽度(mm)：</td>
						<td><input type="text" class="form-control input-sm"
							id="wide" name="wide" value="${men.wide}"></td>
					</tr>
					<tr>
						<td>高度(mm)：</td>
						<td><input type="text" class="form-control input-sm"
							id="height" name="height" value="${men.height}"></td>
					</tr>
					<tr>
						<td>前轮距(mm)：</td>
						<td><input type="text" class="form-control input-sm"
							id="fronttrack" name="fronttrack" value="${men.fronttrack}"></td>
					</tr>
					<tr>
						<td>后轮距(mm)：</td>
						<td><input type="text" class="form-control input-sm"
							id="rearwheel" name="rearwheel" value="${men.rearwheel}"></td>
					</tr>
					<tr>
						<td>最小离地间隙(mm)：</td>
						<td><input type="text" class="form-control input-sm"
							id="minimumgroundclearance" name="minimumgroundclearance"
							value="${men.minimumgroundclearance}"></td>
					</tr>
					<tr>
						<td>整备质量(kg)：</td>
						<td><input type="text" class="form-control input-sm"
							id="curbweight" name="curbweight" value="${men.curbweight}"></td>
					</tr>
					<tr>
						<td>车门数(个)：</td>
						<td><input type="text" class="form-control input-sm"
							id="numberdoorsy" name="numberdoors" value="${men.numberdoors}"></td>
					</tr>
					<tr>
						<td>座位数(个)：</td>
						<td><input class="form_datetime form-control" type="text"
							size="16" name="numberseats" id="numberseats"
							value="${men.numberseats}"></td>
					</tr>
					<tr>
						<td>油箱容积(L)：</td>
						<td><input type="text" class="form-control input-sm"
							id="cTank_Volume" name="cTank_Volume" value="${men.cTank_Volume}"></td>
					</tr>
					<tr>
						<td>行李箱容积(L)：</td>
						<td><input type="text" class="form-control input-sm"
							id="cLuggage_Space" name="cLuggage_Space"
							value="${men.cLuggage_Space}"></td>
					</tr>
				</table>
			</c:forEach>
		</form>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-primary" data-dismiss="modal"
			onclick="javascript:carbody.update()">保存</button>
		<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>

	</div>
</body>
</html>