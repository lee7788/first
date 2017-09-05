$(function(){
	carbrand.init();
	
})

var carbrand={	//汽车参数配置
		
	columns : [ {
		field : 'id',
		title : 'id',
	}, {
		field : 'cName',
		title : '品牌',
	},{
		field : 'zzzz',
		title : '操作',
		formatter : function (value, row, index) {
			var id = row.id;
			return "<button class='btn btn-success btn-xs glyphicon glyphicon-edit' data-toggle='modal'" +
				"data-target='#edit' onclick='carbrand.edit(" + id + ")'></button>&nbsp;" + 
				"<button class='btn btn-primary btn-xs glyphicon glyphicon-remove'" +
				"onclick='carbrand.del(" + id + ")'></button>";
		}
	} ],
	
	init : function(){	//初始化
		$("#table").bootstrapTable({
			url : "/machine/carbrand/listPage",
			queryParams: function(params) {
				return {
					pageSize: params.limit,	//每页显示10条数据
		            offset: params.offset,	//每页的第一条数据
				}
            },
			columns : this.columns,
		});
	$('#table').bootstrapTable('hideColumn', 'id');
	},

	showAddModal : function(){

		$("#add").modal({
		    remote: "/machine/carbrand/showAddModal"
		});
		$("#add").on("hidden.bs.modal", function() {  
		    $(this).removeData("bs.modal");  
		});
		
	},

	addSave : function(){
		$.post("/machine/carbrand?act=add",$("#form").serialize(),function(){
		 $('#table').bootstrapTable('refresh');
		})
		
	},
	
	//模态窗口弹出
	 edit : function(id){
	     $("#update").modal({	
		    remote: "/machine/carbrand/showAddModal1?id="+id	    	
		});
		$("#update").on("hidden.bs.modal", function() {  
		    $(this).removeData("bs.modal");  //清理数据
		});
	},
	 
	update:function(){
		  $.post("/machine/carbrand?act=update",$("#form1").serialize(),function(){		  
			  $('#table').bootstrapTable('refresh');
	  }) 
	  },
	  
	del:function(id){
		$.post("/machine/carbrand?act=delete",{id:id},	
				function(){			
			 $('#table').bootstrapTable('refresh');
		
		})		
	}
};

