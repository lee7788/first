$(function(){
	menu.init();
})

var menu = {	//菜单管理
		
	columns : [ {
		field : 'id',
		title : 'id',
	}, {
		field : 'name',
		title : '名称',
	}, {
		field : 'path',
		title : '路径 ',
	}, {
		field : 'parent',
		title : '父子级 ',
	}, {
		field : 'sort',
		title : '排序',
	}, {
		field : 'zzzz',
		title : '操作',
		formatter : function (value, row, index) {
			var id = row.id;
			return "<button class='btn btn-success btn-xs glyphicon glyphicon-edit' data-toggle='modal'" +
				"data-target='#edit' onclick='menu.edit(" + id + ")'></button>&nbsp;" + 
				"<button class='btn btn-primary btn-xs glyphicon glyphicon-remove'" +
				"onclick='menu.del(" + id + ")'></button>";
		}
	} ],
	
	init : function(){	//初始化
		$("#table").bootstrapTable({
			url : "/machine/menu/listPage",
			queryParams: function(params) {
				return {
					pageSize: params.limit,	//每页显示10条数据
		            offset: params.offset,	//每页的第一条数据
				}
            },
			columns : this.columns,
		});
//		$('#table').bootstrapTable('hideColumn', 'id');
	},

	showAddModal : function(){
		$("#add").modal({
		    remote: "/machine/menu/showAddModal"
		});
		$("#add").on("hidden.bs.modal", function() {  
		    $(this).removeData("bs.modal");  
		});
	},

	addSave : function(){
		$.post("/machine/menu?act=add",$("#form").serialize(),function(){
//			$('#table').bootstrapTable('refresh')
			parent.location.reload();//页面刷新
			
		}    )
		
	},
	//模态窗口弹出
	 edit : function(id){
//		 var tds=$(id).parent().parent(),find('td') 
//         $("#update").model('show')
		$("#update").modal({	
		    remote: "/machine/menu/showAddModal1?id="+id		    	
		});
		$("#update").on("hidden.bs.modal", function() {  
		    $(this).removeData("bs.modal");  //清理数据
		});
	},
	  update:function(){
		  $.post("/machine/menu?act=update",$("#form1").serialize(),function(){
			  $('#table').bootstrapTable('refresh')
			  parent.location.reload();//页面刷新 
		  })
	
		  
	  },
	del:function(id){
		$.post("/machine/menu?act=delete",{id:id},function(){
			
			parent.location.reload();//页面刷新
			
		})
		
	}
};

