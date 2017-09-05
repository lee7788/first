<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<jsp:include page="../../base/taglib.jsp"></jsp:include>
<head>
<body style="background-color: #F5F5F5">

	<div class="panel panel-info">
		<div class="panel-heading">
			<span style="float: right; padding-right: 20px;" class="head">欢迎
				${userName }
			</span>
			<span style="padding-left: 10px; font-size: 16px;">
				<%-- <img src="${pageContext.request.contextPath }/static/image/blocks.gif" 
					width="20" height="20" align="absmiddle" /> --%>
				后台管理系统
			</span>
		</div>
	</div>
	
	<div class="col-sm-2">
		<c:forEach items="${menuList }" var="menu">
			<div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
				<div class="panel panel-primary">
					<c:if test="${menu.parent == 0 }">
						<div class="panel-heading" role="tab" id="headingOne">
							<h4 class="panel-title">
								${menu.name }
								<a type="button" class="glyphicon glyphicon-th-list" style="float: right" data-toggle="collapse" data-parent="#accordion" 
								href=".collapseOne${menu.id }" aria-expanded="true" aria-controls="collapseOne"></a>
							</h4>
						</div>
					</c:if>
					
					<div class="collapseOne${menu.parent }" class="panel-collapse collapse in" 
							role="tabpanel" aria-labelledby="headingOne" style="border: 0px; margin-top: 0px">
						<c:if test="${menu.parent != 0 }">
							<ul>
								<li><a href="${pageContext.request.contextPath }/${menu.path }" target="myFrame">${menu.name }</a></li>
							</ul>
						</c:if>
					</div>
				</div>
			</div>
		</c:forEach>
	</div>
	
	<div class="col-sm-10" style="border: 2px solid #E5E5E5;">
		<div class="embed-responsive embed-responsive-16by9">
			<iframe name="myFrame" class="embed-responsive-item" src=""></iframe>
		</div>
	</div>

</body>
</html>
