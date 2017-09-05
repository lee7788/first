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
		<c:forEach  items="${men}" var="men" varStatus="vs">
			<table style="margin: auto;">
			  <tr>
			       <td><input type="hidden" name="id" value="${men.id}"></td>
			    </tr>
			
				<tr>
					<td>名称：</td>
					<td><input type="text" class="form-control input-sm" id="name" name="name"value="${men.name}"></td>
				</tr>
				<tr>
					<td>路径：</td>
					<td><input type="text" class="form-control input-sm" id="path" name="path"value="${men.path}"></td>
				</tr>
				<tr>
					<td>父级：</td>
					<td>
						<select name="parent" id="parent" style="width: 240px;" class="form-control input-sm">
							<option value="0">-父级-</option>
							<c:forEach items="${menus}" var="menu" varStatus="vs">
								<option value="${menu.id}">${menu.name }</option>
			             	</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
				<td>排序：</td>
					<td><input type="text" class="form-control input-sm" id="sort" name="sort"value="${men.sort}"></td>
				</tr>
			</table>
			</c:forEach>
		</form>
	</div>
	<div class="modal-footer">
	<button type="button" class="btn btn-primary" data-dismiss="modal" 
			onclick="javascript:menu.update()">保存</button>
		<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
		
	</div>
</body>
</html>