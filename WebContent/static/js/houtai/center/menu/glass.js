$(function(){
	glass.init();
	
})

var glass = {	//参数配置
		
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
		field : 'powerwindow',
		title : '前/后电动车窗 ',
	}, {
		field : 'windowkeylift',
		title : '车窗一键升降',
	}, {
		field : 'clampholder',
		title : '车窗防夹手',
	}, {
		field : 'insulatingglass',
		title : '防紫外线/隔热玻璃 ',
	}, {
		field : 'rearviewmirrorelectric',
		title : '后视镜电动调节 ',
	}, {
		field : 'rearviewmirrorheat',
		title : '后视镜加热 ',
	}, {
		field : 'automaticantiglare',
		title : '内外后视镜自动防炫目',
	}, {
		field : 'mediumvehicle',
		title : '流媒体车内后视镜',
	}, {
		field : 'powerfolding',
		title : '后视镜电动折叠',
	}, {
		field : 'mirrormemory',
		title : '后视镜记忆',
	}, {
		field : 'suncurtain',
		title : '后风遮挡阳帘',
	}, {
		field : 'rearsideshade',
		title : '后排侧遮阳帘',
	}, {
		field : 'privacyglass',
		title : '后排侧隐私玻璃',
	}, {
		field : 'shadingmirror',
		title : '遮阳板化妆镜',
	}, {
		field : 'rearwiper',
		title : '后雨刷',
	}, {
		field : 'inductionwiper',
		title : '感应雨刷',
	}, {
		field : '',
		title : '操作',
		formatter : function (value, row, index) {
			var id = row.tId;
			return "<button class='btn btn-success btn-xs glyphicon glyphicon-edit' data-toggle='modal'" +
				"data-target='#edit' onclick='glass.edit(" + id + ")'></button>&nbsp;" /*+ 
				"<button class='btn btn-primary btn-xs glyphicon glyphicon-remove'" +
				"onclick='glass.del(" + id + ")'></button>"*/;
		}
	} ],
	
	init : function(){	//初始化
		$("#table").bootstrapTable({
			url : "/machine/glass/listPage",
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
		    remote: "/machine/glass/showAddModal?id="+id	    	
		});
		$("#update").on("hidden.bs.modal", function() {  
		    $(this).removeData("bs.modal");  //清理数据
		});
	},
	 update:function(){
		  $.post("/machine/glass?act=update",$("#form1").serialize(),function(){
 			  $('#table').bootstrapTable('refresh');
		 // parent.location.reload();//页面刷新 
	  })
  
	  },
	  
	
};

