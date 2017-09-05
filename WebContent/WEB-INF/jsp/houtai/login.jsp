<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="../base/taglib.jsp"></jsp:include>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/login.js"></script>
<style type="text/css">
	body { background-image: url(${pageContext.request.contextPath }/static/image/background.jpg) }
</style>
</body>
	<div id="prompt" class=""></div>
	<div class="col-xs-4 col-xs-offset-4" style="background-color: white; padding: 50px; margin-top: 12%">
		<form class="form-horizontal">
			<div class="form-group">
				<label for="username" class="col-sm-2 control-label">账号</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="username" placeholder="请输入用户名">
   				</div>
  			</div>
			<div class="form-group">
				<label for="password" class="col-sm-2 control-label">密码</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" id="password" placeholder="请输入密码">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
		     		<div class="checkbox">
		       			<label><input type="checkbox">记住密码</label>
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-3">
					<button type="button" class="btn btn-primary col-md-6" onclick="javascript:check()">登录</button>
				</div>
			</div>
		</form>
	</div>
</html>