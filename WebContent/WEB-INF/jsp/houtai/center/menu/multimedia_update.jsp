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
						<td>GPS导航系统：</td>
						<td><input type="text" class="form-control input-sm"
							id="gpsnavigation" name="gpsnavigation" value="${cars.gpsnavigation}">
						</td>
					</tr>
					<tr>
						<td>定位互动服务：</td>
						<td><input type="text" class="form-control input-sm"
							id="locationservice" name="locationservice" value="${cars.locationservice}">
						</td>
					</tr>
					<tr>
						<td>中控台彩色大屏：</td>
						<td><input type="text" class="form-control input-sm"
							id="szmcolour" name="szmcolour" value="${cars.szmcolour}">
						</td>
					</tr>
					<tr>
						<td>中控台彩色大屏尺寸：</td>
						<td><input type="text" class="form-control input-sm"
							id="szmcoloursize" name="szmcoloursize" value="${cars.szmcoloursize}">
						</td>
					</tr>
					<tr>
						<td>中控液晶屏分屏显示：</td>
						<td><input type="text" class="form-control input-sm"
							id="lcdscreendisplay" name="lcdscreendisplay" value="${cars.lcdscreendisplay}">
						</td>
					</tr>
					<tr>
						<td>蓝牙/车载电话：</td>
						<td><input type="text" class="form-control input-sm"
							id="bluetoothcarphone" name="bluetoothcarphone" value="${cars.bluetoothcarphone}">
						</td>
					</tr>
					<tr>
						<td>手机互联/映射：</td>
						<td><input type="text" class="form-control input-sm"
							id="mobilemapping" name="mobilemapping" value="${cars.mobilemapping}">
						</td>
					</tr>
					<tr>
						<td>车联网：</td>
						<td><input type="text" class="form-control input-sm"
							id="vehiclenetworking" name="vehiclenetworking" value="${cars.vehiclenetworking}">
						</td>
					</tr>
					<tr>
						<td>车载电视：</td>
						<td><input type="text" class="form-control input-sm"
							id="cartv" name="cartv" value="${cars.cartv}">
						</td>
					</tr>
					<tr>
						<td>后排液晶显示屏：</td>
						<td><input type="text" class="form-control input-sm"
							id="rearlcdscreen" name="rearlcdscreen" value="${cars.rearlcdscreen}">
						</td>
					</tr>
					<tr>
						<td>220v/230v电源：</td>
						<td><input type="text" class="form-control input-sm"
							id="powersupply" name="powersupply" value="${cars.powersupply}">
						</td>
					</tr>
					<tr>
						<td>外接音源接口：</td>
						<td><input type="text" class="form-control input-sm"
							id="externaaudiointerface" name="externaaudiointerface" value="${cars.externaaudiointerface}">
						</td>
					</tr>
					<tr>
						<td>CD/DVD：</td>
						<td><input type="text" class="form-control input-sm"
							id="cd" name="cd" value="${cars.cd}">
						</td>
					</tr>
					<tr>
						<td>扬声器品牌：</td>
						<td><input type="text" class="form-control input-sm"
							id="speakerbrand" name="speakerbrand" value="${cars.speakerbrand}">
						</td>
					</tr>
					<tr>
						<td>扬声器数量：</td>
						<td><input type="text" class="form-control input-sm"
							id="loudspeakerquantity" name="loudspeakerquantity" value="${cars.loudspeakerquantity}">
						</td>
					</tr>

				</table>
			</c:forEach>

		</form>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-primary" data-dismiss="modal"
			onclick="javascript:multimedia.update()">保存</button>
		<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>

	</div>
</body>
</html>