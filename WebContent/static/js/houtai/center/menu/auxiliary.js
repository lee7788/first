$(function(){
	auxiliary.init();
	
})

var auxiliary = {	//参数配置
		
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
		field : 'vehicleradar',
		title : '前后驻车雷达',
	}, {
		field : 'reversingvideoimages',
		title : '倒车视频影像',
	}, {
		field : 'panoramiccamera',
		title : '全景摄像头',
	}, {
		field : 'cruisecontrol',
		title : '定速巡航',
	}, {
		field : 'adaptivecruise',
		title : '自适应巡航',
	}, {
		field : 'automaticparkingaccess',
		title : '自动泊车入位 ',
	}, {
		field : 'enginestartstop',
		title : '发动机启停技术',
	}, {
		field : 'hillstartassist',
		title : '上坡辅助',
	}, {
		field : 'automaticparking',
		title : '自动驻车',
	}, {
		field : 'gentleslopedescent',
		title : '徒坡缓降',
	}, {
		field : 'variablesuspension',
		title : '可变悬架',
	}, {
		field : 'airsuspension',
		title : '空气悬架',
	}, {
		field : 'electromagneticsuspension',
		title : '电磁感应悬架',
	}, {
		field : 'variablesteeringratio',
		title : '可变转向比',
	}, {
		field : 'differentiallock',
		title : '前桥限滑差速器/差速锁',
	}, {
		field : 'centraldifferentiallock',
		title : '中央差速器锁止功能',
	}, {
		field : 'reardifferentiallock',
		title : '后桥限滑差速器/差速锁',
	}, {
		field : 'overallactivesteering',
		title : '整体主动转向系统',
	}, {
		field : '',
		title : '操作',
		formatter : function (value, row, index) {
			var id = row.tId;
			return "<button class='btn btn-success btn-xs glyphicon glyphicon-edit' data-toggle='modal'" +
				"data-target='#edit' onclick='auxiliary.edit(" + id + ")'></button>&nbsp;" /*+ 
				"<button class='btn btn-primary btn-xs glyphicon glyphicon-remove'" +
				"onclick='auxiliary.del(" + id + ")'></button>"*/;
		}
	} ],
	
	init : function(){	//初始化
		$("#table").bootstrapTable({
			url : "/machine/auxiliary/listPage",
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
		    remote: "/machine/auxiliary/showAddModal?id="+id	    	
		});
		$("#update").on("hidden.bs.modal", function() {  
		    $(this).removeData("bs.modal");  //清理数据
		});
	},
	 update:function(){
		  $.post("/machine/auxiliary?act=update",$("#form1").serialize(),function(){
 			  $('#table').bootstrapTable('refresh');
		 // parent.location.reload();//页面刷新 
	  })
  
	  },
	  
	
};

