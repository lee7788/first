<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%-- <jsp:include page="../../../base/taglib.jsp"></jsp:include> --%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>

	<div class="panel panel-default">
		<div class="panel-heading">
			<h3 class="panel-title">新增页面</h3>
		</div>
	</div>
	<div class="modal-body">
		<form id="form">
			<table  style="margin: auto;">
				<tr>
					<td>品牌：</td>
					<td>
						<select name="cName" id="cName" style="width: 240px;" class="form-control input-sm">
							<option value="0">-品牌名-</option>
							<c:forEach items="${carBrands}" var="carBrands" varStatus="vs">
								<option value="${carBrands.id}" <c:if test="${carBrands.id==info.cName}">selected="selected"</c:if>>${carBrands.cName }</option>
			             	</c:forEach>
				  		</select>
				  </td>
				</tr>
				<tr>
					<td>系列：</td>
					<td>
						<select name="cSeries" id="cSeries" style="width: 240px;" class="form-control input-sm">
							<option value="0">-系列名-</option>
							<c:forEach items="${series}" var="series" varStatus="vs">
								<option value="${series.id}" <c:if test="${series.id==info.cSeries}">selected="selected"</c:if>>${series.cSeries }</option>
			             	</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td>系列类型：</td>
					<td>
						<select name="cType" id="cType" style="width: 240px;" class="form-control input-sm">
							<option value="0">-系列类型名-</option>
							<c:forEach items="${cars}" var="cars" varStatus="vs">
								<option value="${cars.tId}" <c:if test="${cars.tId==info.cType}">selected="selected"</c:if>>${cars.ctype }</option>
			             	</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
						<td>供应商：</td>						
						<td>
						<select name="cSupplier" id="cSupplier" style="width: 240px;" class="form-control input-sm">
							<option value="0">-供应商名-</option>
							<c:forEach items="${users}" var="users" varStatus="vs">
								<option value="${users.id}" <c:if test="${user.id==info.cSupplier}">selected="selected"</c:if>>${users.name }</option>
			             	</c:forEach>
						</select>
						</td>
					</tr>
	
			</table>
		</form>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-primary" data-dismiss="modal"
			onclick="javascript:info.addSave()">保存</button>
		<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>

	</div>

</body>
</html>