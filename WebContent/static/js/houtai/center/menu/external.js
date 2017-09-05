$(function(){
	external.init();
	
})

var external = {	//参数配置
		
	columns : [ {
		field : 'tId',
		title : 'id',
	}, {
		field : 'cName',
		title : '品牌',
	}, {
		field : 'cSeries',
		title : '系列',
	}, {
		field : 'ctype',
		title : '系列类型 ',
	}, {
		field : 'powersunroof',
		title : '电动天窗',
	}, {
		field : 'panoramicsunroof',
		title : '全景天窗',
	}, {
		field : 'sportsappearancekit',
		title : '运动外观套件',
	}, {
		field : 'aluminumalloywheels',
		title : '铝合金轮圈',
	}, {
		field : 'electricpulldoor',
		title : '电动吸合门 ',
	}, {
		field : 'sidedoor',
		title : '侧滑门',
	}, {
		field : 'etrunk',
		title : '电动后备厢',
	}, {
		field : 'itrunk',
		title : '感应后备厢',
	}, {
		field : 'rrack',
		title : '车顶行李架',
	}, {
		field : 'eantitheft',
		title : '发动机电子防盗',
	}, {
		field : 'carlock',
		title : '车内中控锁',
	}, {
		field : 'remotekey',
		title : '遥控钥匙',
	}, {
		field : 'keylessstart',
		title : '无钥匙启动',
	}, {
		field : 'keylessentry',
		title : '无钥匙进入',
	}, {
		field : 'remotebootengine',
		title : '远程启动发动',
	}, {
		field : '',
		title : '操作',
		formatter : function (value, row, index) {
			var id = row.tId;
			return "<button class='btn btn-success btn-xs glyphicon glyphicon-edit' data-toggle='modal'" +
				"data-target='#edit' onclick='external.edit(" + id + ")'></button>&nbsp;" /*+ 
				"<button class='btn btn-primary btn-xs glyphicon glyphicon-remove'" +
				"onclick='external.del(" + id + ")'></button>"*/;
		}
	} ],
	
	init : function(){	//初始化
		$("#table").bootstrapTable({
			url : "/machine/external/listPage",
			queryParams: function(params) {
				return {
					pageSize: params.limit,	//每页显示10条数据
		            offset: params.offset,	//每页的第一条数据
				}
            },
			columns : this.columns,
		});
	/*$('#table').bootstrapTable('hideColumn', 'tId');*/
	},

	
	//模态窗口弹出
	 edit : function(id){

	     $("#update").modal({	
		    remote: "/machine/external/showAddModal?id="+id	    	
		});
		$("#update").on("hidden.bs.modal", function() {  
		    $(this).removeData("bs.modal");  //清理数据
		});
	},
	 update:function(){
		  $.post("/machine/external?act=update",$("#form1").serialize(),function(){
 			  $('#table').bootstrapTable('refresh');
		 // parent.location.reload();//页面刷新 
	  })
  
	  },
	  
	
};

