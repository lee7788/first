
function prompt(){	//用户名密码提示
	$("#prompt").html(
			"<div class='alert alert-danger alert-dismissible' role='alert' align='center' style='position: fixed; width: 100%'>" +
				"<button type='button' class='close' data-dismiss='alert' aria-label='Close'>" +
					"<span aria-hidden='true'>&times;</span>" +
				"</button>" +
				"<strong>错误!</strong>&nbsp;&nbsp;用户名密码不正确！" +
			"</div>")
}

//客户端校验
function check() {
	var username = $("#username").val();
	var password = $("#password").val();
	if (username == "" || username == null) {
		$("#username").focus();
		return false;
	}
	if (password == "" || password == null) {
		$("#password").focus();
		return false;
	}
	
	$.post("checkLogin", {
		username : username,
		password : password
	}, function(data){
		if (data.msg == "success") {
			window.location.href = "toBackIndex";
		} else {
			prompt();
		}
	})
	
}
