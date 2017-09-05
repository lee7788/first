$(function(){
	info.init();
	
})

var info = {	//参数配置
		
	columns : [ {
		field : 'id',
		title : 'id',
	}, {
		field : 'cName',
		title : '品牌',
	}, {
		field : 'cSeries',
		title : '系列',
	}, {
		field : 'cType',
		title : '系列类型 ',
	}, {
		field : 'name',
		title : '供应商 ',
	}, {
		field : '',
		title : '操作',
		formatter : function (value, row, index) {
			var id = row.id;
			return "<button class='btn btn-success btn-xs glyphicon glyphicon-edit' data-toggle='modal'" +
				"data-target='#edit' onclick='info.edit(" + id + ")'></button>&nbsp;" + 
				"<button class='btn btn-primary btn-xs glyphicon glyphicon-remove'" +
				"onclick='info.del(" + id + ")'></button>";
		}
	} ],
	
	init : function(){	//初始化
		$("#table").bootstrapTable({
			url : "/machine/info/listPage",
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

	showAddModal : function(){

		$("#add").modal({
		    remote: "/machine/info/showAddModal1"
		});
		$("#add").on("hidden.bs.modal", function() {  
		    $(this).removeData("bs.modal");  
		});
		
	},

	
	addSave : function(){
		$.post("/machine/info?act=add",$("#form").serialize(),function(){		
			$('#table').bootstrapTable('refresh');
		})
		
	},
	//模态窗口弹出
	 edit : function(id){

	     $("#update").modal({	
		    remote: "/machine/info/showAddModal?id="+id	    	
		});
		$("#update").on("hidden.bs.modal", function() {  
		    $(this).removeData("bs.modal");  //清理数据
		});
	},
	 update:function(){
		  $.post("/machine/info?act=update",$("#form1").serialize(),function(){
 			  $('#table').bootstrapTable('refresh');
		 // parent.location.reload();//页面刷新 
	  })
  
	  },
	  
	del:function(id){	
		$.post("/machine/info?act=delete",{id:id},	
				function(){
			 $('#table').bootstrapTable('refresh');
//			parent.location.reload();//页面刷新
			
		})
		
	}
};

