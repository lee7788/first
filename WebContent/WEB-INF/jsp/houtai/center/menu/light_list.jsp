<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="../../../base/taglib.jsp"></jsp:include>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/houtai/center/menu/light.js"></script>
</head>
<body>
	
	<!-- 页面Panel 表格Table -->
	<div class="panel panel-primary">
		<div class="panel-heading">
			<div style="color: white;font-size: 14px; padding-left: 30px">
				<strong>${light}</strong>
			</div>
		</div>
		
		<div class="panel-body">
			<!-- <div id="toolbar" class="btn-group">
				<button id="btn_add" type="button" class="btn btn-default" 
					onclick="javascript:condition.showAddModal()">
					<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
				</button>
			</div> -->
			<table id="table" data-toolbar="#toolbar" data-pagination="true" 
				data-side-pagination="server" data-page-number="1" 
				data-page-size="10" data-page-list="[10]" 
				data-show-columns="true" data-clickToSelect="true" data-striped="true" >
			</table>
		</div>
	</div>
	
	<!-- 模态框（Modal） 新增 -->
	<!-- <div class="modal fade" id="add" tabindex="-1" role="dialog" aria-hidden="true" 
		aria-labelledby="myModalLabel" data-backdrop="static" data-keyboard="false">
		<div class="modal-dialog">
			<div class="modal-content"></div>
		</div>
	</div> -->
	
	<!-- 模态框（Modal） 修改  -->
	<div class="modal fade" id="update" tabindex="-1" role="dialog" aria-hidden="true" 
		aria-labelledby="myModalLabel" data-backdrop="static" data-keyboard="false">
		<div class="modal-dialog">
			<div class="modal-content"></div>
		</div>
	</div>
</body>
</html>