$(function(){
	user.init();

})

var user = {	//用户参数配置

	columns : [ {
		field : 'id',
		title : 'id',
	}, {
		field : 'name',
		title : '用户名',
	}, {
		field : 'password',
		title : '密码 ',
	
	}, {	
		field : '',
		title : '操作',
		formatter : function (value, row, index) {
			var id = row.id;
			return "<button class='btn btn-success btn-xs glyphicon glyphicon-edit' data-toggle='modal'" +
			"data-target='#edit' onclick='user.edit(" + id + ")'></button>&nbsp;" + 
			"<button class='btn btn-primary btn-xs glyphicon glyphicon-remove'" +
			"onclick='user.del(" + id + ")'></button>";
		}
	} ],

	init : function(){	//初始化
		$("#table").bootstrapTable({
			url : "/machine/user/listPage",
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
		    remote: "/machine/user/showAddModal"
		});
		$("#add").on("hidden.bs.modal", function() {  
		    $(this).removeData("bs.modal");  
		});
		
	},

	addSave : function(){
		$.post("/machine/user?act=add",$("#form").serialize(),function(){
		 $('#table').bootstrapTable('refresh');
		})
		
	},
	
	//模态窗口弹出
	 edit : function(id){
	     $("#update").modal({	
		    remote: "/machine/user/showAddModal1?id="+id	    	
		});
		$("#update").on("hidden.bs.modal", function() {  
		    $(this).removeData("bs.modal");  //清理数据
		});
	},
	 
	update:function(){
		  $.post("/machine/user?act=update",$("#form1").serialize(),function(){		  
			  $('#table').bootstrapTable('refresh');
	  }) 
	  },
	  
	del:function(id){
		$.post("/machine/user?act=delete",{id:id},	
				function(){			
			 $('#table').bootstrapTable('refresh');
		
		})		
	}
};

