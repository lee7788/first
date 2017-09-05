$(function(){
	light.init();
	
})

var light = {	//参数配置
		
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
		field : 'dippedheadlight',
		title : '近光灯',
	}, {
		field : 'highbeam',
		title : '远光灯',
	}, {
		field : 'leddaytimelight',
		title : 'LED日间行光灯',
	}, {
		field : 'adaptivelight',
		title : '自适应远近光',
	}, {
		field : 'automaticheadlamp',
		title : '自动头灯 ',
	}, {
		field : 'corneringlamp',
		title : '转向辅助灯',
	}, {
		field : 'turnheadlamp',
		title : '转向头灯',
	}, {
		field : 'frontfoglamp',
		title : '前雾灯',
	}, {
		field : 'heightadjustable',
		title : '大灯高度可调',
	}, {
		field : 'cleaningdevice',
		title : '大灯清洗装置',
	}, {
		field : 'interiorlight',
		title : '车内氛围灯',
	}, {
		field : '',
		title : '操作',
		formatter : function (value, row, index) {
			var id = row.tId;
			return "<button class='btn btn-success btn-xs glyphicon glyphicon-edit' data-toggle='modal'" +
				"data-target='#edit' onclick='light.edit(" + id + ")'></button>&nbsp;" /*+ 
				"<button class='btn btn-primary btn-xs glyphicon glyphicon-remove'" +
				"onclick='light.del(" + id + ")'></button>"*/;
		}
	} ],
	
	init : function(){	//初始化
		$("#table").bootstrapTable({
			url : "/machine/light/listPage",
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
		    remote: "/machine/light/showAddModal?id="+id	    	
		});
		$("#update").on("hidden.bs.modal", function() {  
		    $(this).removeData("bs.modal");  //清理数据
		});
	},
	 update:function(){
		  $.post("/machine/light?act=update",$("#form1").serialize(),function(){
 			  $('#table').bootstrapTable('refresh');
		 // parent.location.reload();//页面刷新 
	  })
  
	  },
	  
	
};

