<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link href="${pageContext.request.contextPath }/static/css/index/main.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath }/static/css/bootstrap.min.css" rel="stylesheet" />
<script src="${pageContext.request.contextPath }/static/dist/js/tab.js" type="text/javascript" ></script>
<link href="${pageContext.request.contextPath }/static/dist/css/bootstrap-theme.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath }/static/dist/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css">
<!-- <div class="navigation">
	<ul>
		<li><a href="/Apple/index">
			<img alt="logo" src="../static/image/logo.png" style="width: 30px; height: 30px; margin-top: 10px"/>
		</a></li>
		<li><a href="">Mac</a></li>
		<li><a href="">iPad</a></li>
		<li><a href="">iPhone</a></li>
		<li><a href="">Watch</a></li>
		<li><a href="">Music</a></li>
	</ul>
</div> -->

<!-- <form class="navbar-form navbar-left" role="search">
  <div class="form-group">
    <input type="text" class="form-control" placeholder="Search">
  </div>
  <button type="submit" class="btn btn-default">Submit</button>
</form> -->

<div class="head">
<div id="notice" class="notice">
   <div id="notice-tit" class="notice-tit">
       <ul>
         <li class="select"><a href="#CA" >A</a></li>
         <li><a href="#CB" class="target-fix">B</a></li>
         <li><a href="#CC">C</a></li>
    
       </ul>
   </div>
   <div id="notice-con" class="notice-con">
    	<div class="mod" style="display:block">
          <ul>
              <li><a href="#A1">奥迪</a></li>
              <li><a href="#A2">阿斯顿</a></li>
          </ul>
        </div>
        <div class="mod" style="display:none">
          <ul>
              <li><a href="#B1">奔驰</a></li>
              <li><a href="#B2">本田</a></li>
          </ul>
        </div>
        <div class="mod" style="display:none">
          <ul>
              <li><a href="#">宝马</a></li>
              <li><a href="#">宝马</a></li>
          </ul>
        </div>
   </div>
</div>
</div>
<div  class="middle">	
 <!--A起点-->
 <div class="one"> <a  name="CA" >A</a></div>
 <!--奥迪起点-->
       <div class="row">
	         <div class="col-sm-2 left">   
                   <img src="${pageContext.request.contextPath }/static/image/aodi.jpg" /><br />
                   <a name="A1">奥迪</a>
              </div> <!-- 左半边结束-->
              <div class="col-sm-10 right"> 
                <h4>一汽-大众奥迪</h4>
                <div class="row">
                      <div class="col-sm-4 col-md-3">
                        <div class="thumbnail">
                          <div class="caption">
                            <a  href="${pageContext.request.contextPath }/index/a3?ctype=a3">奥迪A3</a> 
                          </div>
                        </div>
                      </div>
                      <div class="col-sm-4 col-md-3">
                        <div class="thumbnail">
                          <div class="caption">
                            <a href="#" >奥迪A4L</a> 
                          </div>
                        </div>
                      </div>
                      <div class="col-sm-4 col-md-3">
                        <div class="thumbnail">
                          <div class="caption">
                            <a href="#" >奥迪A6L</a> 
                          </div>
                        </div>
                      </div>
                     <div class="col-sm-4 col-md-3">
                        <div class="thumbnail">
                          <div class="caption">
                            <a href="#" >奥迪Q3</a> 
                          </div>
                        </div>
                      </div>
                      <div class="col-sm-4 col-md-3">
                        <div class="thumbnail">
                          <div class="caption">
                            <a href="#" >奥迪Q5</a> 
                          </div>
                        </div>
                      </div>
                      <div class="col-sm-4 col-md-3">
                        <div class="thumbnail">
                          <div class="caption">
                            <a href="#" >奥迪A6</a> 
                          </div>
                        </div>
                      </div>
               </div><!--level结束-->
                   
                    <h4>奥迪RS</h4>
                        <div class="row">
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >奥迪RS 6</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >奥迪RS 7</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >奥迪RS 3</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >奥迪RS Q3</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >奥迪RS 4</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >奥迪RS 5</a> 
                                  </div>
                                </div>
                              </div>
                   </div>
 				 </div><!-- 右半边结束-->
               </div><!--奥迪结束-->
               <hr />
               <!--阿斯顿·马丁起点-->
               <div class="row">
	               <div class="col-sm-2 left">   
                       <img src="${pageContext.request.contextPath }/static/image/asidun.jpg" /><br />
                       <a  name="A2">阿斯顿·马丁</a>
                   </div> <!-- 左半边结束-->
              <div class="col-sm-10 right"> 
                 <h4 >阿斯顿·马丁</h4>
                        <div class="row">
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >Rapide</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >拉共达Taraf</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >V8 Vantage</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >Vanquish</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >Cygnet</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >Vulcan</a> 
                                  </div>
                                </div>
                              </div>
                   </div><!--level结束-->
         
 				 </div><!-- 右半边结束-->
               </div><!--阿斯顿·马丁结束-->
               <!--A结束-->
               
               <!--B起点-->
 <div class="one"> 
 	<a name="CB">B</a>
    
  </div>
 <!--奥迪起点-->
       <div class="row">
	         <div class="col-sm-2 left">   
                   <img src="${pageContext.request.contextPath }/static/image/benchi.jpg" /><br />
                   <a name="B1">奔驰</a></span>
              </div> <!-- 左半边结束-->
              <div class="col-sm-10 right"> 
                <h4>北京奔驰</h4>
                <div class="row">
                      <div class="col-sm-4 col-md-3">
                        <div class="thumbnail">
                          <div class="caption">
                            <a href="#" >奔驰C级</a> 
                          </div>
                        </div>
                      </div>
                      <div class="col-sm-4 col-md-3">
                        <div class="thumbnail">
                          <div class="caption">
                            <a href="#" >奔驰E级</a> 
                          </div>
                        </div>
                      </div>
                      <div class="col-sm-4 col-md-3">
                        <div class="thumbnail">
                          <div class="caption">
                            <a href="#" >奔驰GLA</a> 
                          </div>
                        </div>
                      </div>
                     <div class="col-sm-4 col-md-3">
                        <div class="thumbnail">
                          <div class="caption">
                            <a href="#" >奔驰C级</a> 
                          </div>
                        </div>
                      </div>
                      <div class="col-sm-4 col-md-3">
                        <div class="thumbnail">
                          <div class="caption">
                            <a href="#" >奔驰C级</a> 
                          </div>
                        </div>
                      </div>
                      <div class="col-sm-4 col-md-3">
                        <div class="thumbnail">
                          <div class="caption">
                            <a href="#" >奔驰C级</a> 
                          </div>
                        </div>
                      </div>
               </div><!--level结束-->
                   
                    <h4>奥迪RS</h4>
                        <div class="row">
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >奥迪RS 6</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >奥迪RS 7</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >奥迪RS 3</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >奥迪RS Q3</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >奥迪RS 4</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >奥迪RS 5</a> 
                                  </div>
                                </div>
                              </div>
                   </div>
 				 </div><!-- 右半边结束-->
               </div><!--奥迪结束-->
               <hr />
               <!--阿斯顿·马丁起点-->
               <div class="row">
	               <div class="col-sm-2 left">   
                       <img src="image/bentian.jpg" /><br />
                       <a name="B2">本田</a>
                   </div> <!-- 左半边结束-->
              <div class="col-sm-10 right"> 
                 <h4>东风本田</h4>
                        <div class="row">
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >Rapide</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >拉共达Taraf</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >V8 Vantage</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >Vanquish</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >Cygnet</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >Vulcan</a> 
                                  </div>
                                </div>
                              </div>
                   </div><!--level结束-->
         
 				 </div><!-- 右半边结束-->
               </div><!--阿斯顿·马丁结束-->
               <!--B结束-->
            
    <div class="one"> 
 	<a name="CC">C</a>
    
  </div>
 <!--奥迪起点-->
       <div class="row">
	         <div class="col-sm-2 left">   
                   <img src="${pageContext.request.contextPath }/static/image/benchi.jpg" /><br />
                   <span>奔驰</span>
              </div> <!-- 左半边结束-->
              <div class="col-sm-10 right"> 
                <h4>北京奔驰</h4>
                <div class="row">
                      <div class="col-sm-4 col-md-3">
                        <div class="thumbnail">
                          <div class="caption">
                            <a href="#" >奔驰C级</a> 
                          </div>
                        </div>
                      </div>
                      <div class="col-sm-4 col-md-3">
                        <div class="thumbnail">
                          <div class="caption">
                            <a href="#" >奔驰E级</a> 
                          </div>
                        </div>
                      </div>
                      <div class="col-sm-4 col-md-3">
                        <div class="thumbnail">
                          <div class="caption">
                            <a href="#" >奔驰GLA</a> 
                          </div>
                        </div>
                      </div>
                     <div class="col-sm-4 col-md-3">
                        <div class="thumbnail">
                          <div class="caption">
                            <a href="#" >奔驰C级</a> 
                          </div>
                        </div>
                      </div>
                      <div class="col-sm-4 col-md-3">
                        <div class="thumbnail">
                          <div class="caption">
                            <a href="#" >奔驰C级</a> 
                          </div>
                        </div>
                      </div>
                      <div class="col-sm-4 col-md-3">
                        <div class="thumbnail">
                          <div class="caption">
                            <a href="#" >奔驰C级</a> 
                          </div>
                        </div>
                      </div>
               </div><!--level结束-->
                   
                    <h4>奥迪RS</h4>
                        <div class="row">
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >奥迪RS 6</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >奥迪RS 7</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >奥迪RS 3</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >奥迪RS Q3</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >奥迪RS 4</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >奥迪RS 5</a> 
                                  </div>
                                </div>
                              </div>
                   </div>
 				 </div><!-- 右半边结束-->
               </div><!--奥迪结束-->
               <hr />
               <!--阿斯顿·马丁起点-->
               <div class="row">
	               <div class="col-sm-2 left">   
                       <img src="${pageContext.request.contextPath }/static/image/bentian.jpg" /><br />
                       <span>本田</span>
                   </div> <!-- 左半边结束-->
              <div class="col-sm-10 right"> 
                 <h4>东风本田</h4>
                        <div class="row">
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >Rapide</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >拉共达Taraf</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >V8 Vantage</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >Vanquish</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >Cygnet</a> 
                                  </div>
                                </div>
                              </div>
                              <div class="col-sm-4 col-md-3">
                                <div class="thumbnail">
                                  <div class="caption">
                                    <a href="#" >Vulcan</a> 
                                  </div>
                                </div>
                              </div>
                   </div><!--level结束-->
         
 				 </div><!-- 右半边结束-->
               </div><!--阿斯顿·马丁结束-->
               <!--C结束--></div>