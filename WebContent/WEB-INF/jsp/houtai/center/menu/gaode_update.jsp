<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

</head>
<body>
<div class="panel panel-default">
		<div class="panel-heading">
			<h3 class="panel-title">修改菜单</h3>
		</div>
	</div>
	<div class="modal-body" id="update">
		<form id="form1" >
		
			<table style="margin: auto;">
			<c:forEach  items="${men}" var="men" varStatus="vs">
			  <tr>
			       <td><input type="hidden" name="id" value="${men.id}"></td>
			    </tr>
			
				<tr>
					<td>公司简介：</td>
					<td><textarea rows="3" class="form-control input-sm" id="profile" name="profile">${men.profile}</textarea></td>
				</tr>
				<tr>
					<td>荣誉资质：</td>
					<td><textarea rows="3" class="form-control input-sm" id="qualifications" name="qualifications">${men.qualifications}</textarea></td>
				</tr>
				<tr>
				<td>组织架构：</td>
					<td><textarea rows="3"class="form-control input-sm" id="framework" name="framework">${men.framework}</textarea></td>
				</tr>
				<tr>
				<td>企业文化：</td>
					<td><textarea rows="3" class="form-control input-sm" id="cultire" name="cultire">${men.cultire}</textarea></td>
				</tr>
				</c:forEach>
			</table>
			
		</form>
	</div>
	<div class="modal-footer">
	<button type="button" class="btn btn-primary" data-dismiss="modal" 
			onclick="javascript:menu1.update()">保存</button>
		<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
		
	</div>
</body>
</html>