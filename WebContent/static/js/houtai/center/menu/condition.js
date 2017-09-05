$(function(){
	condition.init();
	
})

var condition = {	//参数配置
		
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
		field : 'controlmode',
		title : '空调控制方式 ',
	}, {
		field : 'airconditioning',
		title : '后排独立空调',
	}, {
		field : 'airoutlet',
		title : '后座出风口',
	}, {
		field : 'zoncontrol',
		title : '温度分区控制 ',
	}, {
		field : 'pollenfiltration',
		title : '车内空气调节/花粉过滤 ',
	}, {
		field : 'carrefrigerator',
		title : '车载冰箱 ',
	}, {
		field : 'cColor',
		title : '外观颜色 ',
	}, {
		field : 'interiorcolor',
		title : '内饰颜色 ',
	}, {
		field : '',
		title : '操作',
		formatter : function (value, row, index) {
			var id = row.tId;
			return "<button class='btn btn-success btn-xs glyphicon glyphicon-edit' data-toggle='modal'" +
				"data-target='#edit' onclick='condition.edit(" + id + ")'></button>&nbsp;" /*+ 
				"<button class='btn btn-primary btn-xs glyphicon glyphicon-remove'" +
				"onclick='condition.del(" + id + ")'></button>"*/;
		}
	} ],
	
	init : function(){	//初始化
		$("#table").bootstrapTable({
			url : "/machine/condition/listPage",
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

	/*showAddModal : function(){

		$("#add").modal({
		    remote: "/machine/condition/showAddModal1"
		});
		$("#add").on("hidden.bs.modal", function() {  
		    $(this).removeData("bs.modal");  
		});
		
	},

	
	addSave : function(){
		$.post("/machine/condition?act=add",$("#form").serialize(),function(){		
			$('#table').bootstrapTable('refresh');
		})
		
	},*/
	//模态窗口弹出
	 edit : function(id){

	     $("#update").modal({	
		    remote: "/machine/condition/showAddModal?id="+id	    	
		});
		$("#update").on("hidden.bs.modal", function() {  
		    $(this).removeData("bs.modal");  //清理数据
		});
	},
	 update:function(){
		  $.post("/machine/condition?act=update",$("#form1").serialize(),function(){
 			  $('#table').bootstrapTable('refresh');
		 // parent.location.reload();//页面刷新 
	  })
  
	  },
	  
	/*del:function(id){	
		$.post("/machine/condition?act=delete",{id:id},	
				function(){
			 $('#table').bootstrapTable('refresh');
//			parent.location.reload();//页面刷新
			
		})
		
	}*/
};

