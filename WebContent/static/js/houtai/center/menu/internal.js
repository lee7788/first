$(function(){
	internal.init();
	
})

var internal = {	//参数配置
		
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
		field : 'leathersteeringwheel',
		title : '真皮方向盘 ',
	}, {
		field : 'steeringwheeladjustment',
		title : '方向盘电动调节',
	}, {
		field : 'multifunctionals',
		title : '多功能方向盘',
	}, {
		field : 'steeringwheelshift',
		title : '方向盘换挡 ',
	}, {
		field : 'steeringwheelheat',
		title : '方向盘加热',
	}, {
		field : 'steeringwheelmemory',
		title : '方向盘记忆',
	}, {
		field : 'displayscreen',
		title : '行车电脑显示屏',
	}, {
		field : 'fulllcddashboard',
		title : '全液晶仪表盘',
	}, {
		field : 'digitaldisplay',
		title : 'HUD抬头数字显示',
	}, {
		field : 'builtrecorder',
		title : '内置行车记录仪',
	}, {
		field : 'activenoiserreduction',
		title : '主动降噪',
	}, {
		field : 'wirelesscharging',
		title : '手机无线充电',
	}, {
		field : '',
		title : '操作',
		formatter : function (value, row, index) {
			var id = row.tId;
			return "<button class='btn btn-success btn-xs glyphicon glyphicon-edit' data-toggle='modal'" +
				"data-target='#edit' onclick='internal.edit(" + id + ")'></button>&nbsp;" /*+ 
				"<button class='btn btn-primary btn-xs glyphicon glyphicon-remove'" +
				"onclick='internal.del(" + id + ")'></button>"*/;
		}
	} ],
	
	init : function(){	//初始化
		$("#table").bootstrapTable({
			url : "/machine/internal/listPage",
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
		    remote: "/machine/internal/showAddModal?id="+id	    	
		});
		$("#update").on("hidden.bs.modal", function() {  
		    $(this).removeData("bs.modal");  //清理数据
		});
	},
	 update:function(){
		  $.post("/machine/internal?act=update",$("#form1").serialize(),function(){
 			  $('#table').bootstrapTable('refresh');
		 // parent.location.reload();//页面刷新 
	  })
  
	  },
	  
	
};

