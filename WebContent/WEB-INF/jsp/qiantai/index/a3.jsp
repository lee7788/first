<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width,intial-scale=1.0" />
<link href="${pageContext.request.contextPath }/static/dist/css/bootstrap.css" rel="stylesheet" type="text/css">
 <link href="${pageContext.request.contextPath }/static/dist/css/bootstrap.min.css" rel="stylesheet" />
 <link href="${pageContext.request.contextPath }/static/css/index/in.css" rel="stylesheet" />
 <link href="${pageContext.request.contextPath }/static/dist/css/bootstrap-theme.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath }/static/dist/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css">

</head>

<div class="container">

    <div class="jumbotron">
      <h1 align="center">环球港汽车城</h1>
    </div>

    <div class="row">
      <div class="left col-lg-6">
          <c:forEach var="picture" items="${picture}" >
          <img src="${pageContext.request.contextPath }/index/showPicture?imgPath=${picture.pPathName}" alt="..." width="50%">
          </c:forEach>
      </div>
      <div class="right col-lg-6">
      <c:forEach var="car" items="${list}" >
             <form action="" id="a3"></form> <table >
                  <tr>
                    <td align="right">品牌:</td>
                  <td>${car.cName}</td>
                  </tr>
                  <tr>
                    <td align="right">系列:</td>
                   <td>${car.ctype}</td>
                  </tr>
                   <tr>
                    <td align="right">车长:</td>
                    <td>${car.cVolume} </td>
                  </tr>
                  <tr>
                    <td align="right">发动机:</td>
                    <td>${car.cEngine}</td>
                  </tr>
                  <tr>
                    <td align="right">耗油量:</td>
                    <td>${car.cOil}</td>        
                  </tr>
                 
               </table></form>
               </c:forEach>
      </div>
    </div>
    

<div class="panel panel-default">
  <!-- Default panel contents -->
  <div class="panel-heading">套餐信息</div>
  

  <!-- Table -->
  <table class="table">
     <tr>
                                  <td>套餐</td>
                                   <td>套餐内容</td>
                                   <td>报价</td>
                               </tr>
                                <c:forEach var="supplier" items="${list1}"  >
            
                                <tr>
                                   <td>${supplier.sName }</td>
                                   <td>${supplier.sAddress }</td>
                                   <td>${supplier.cPrice}</td>
                                </tr>
                               </c:forEach>
  </table>
  
</div>
          
               
</div>

    <div class="logo_right">
    <a href="javascript:history.go(-1)"><img src="${pageContext.request.contextPath }/static/image/back.jpg" /></a>
    </div>   


</body>
</html>