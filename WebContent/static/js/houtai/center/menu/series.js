$(function(){
	series.init();
	
})

var series={	//汽车系列
		
	columns : [ {
		field : 'id',
		title : 'id',
	}, {
		field : 'cSeries',
		title : '车系',
	},{
		field : 'zzzz',
		title : '操作',
		formatter : function (value, row, index) {
			var id = row.id;
			return "<button class='btn btn-success btn-xs glyphicon glyphicon-edit' data-toggle='modal'" +
				"data-target='#edit' onclick='series.edit(" + id + ")'></button>&nbsp;" + 
				"<button class='btn btn-primary btn-xs glyphicon glyphicon-remove'" +
				"onclick='series.del(" + id + ")'></button>";
		}
	} ],
	
	init : function(){	//初始化
		$("#table").bootstrapTable({
			url : "/machine/series/listPage",
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
		    remote: "/machine/series/showAddModal"
		});
		$("#add").on("hidden.bs.modal", function() {  
		    $(this).removeData("bs.modal");  
		});
		
	},

	addSave : function(){
		$.post("/machine/series?act=add",$("#form").serialize(),function(){
		 $('#table').bootstrapTable('refresh');
	
		}    )
		
	},
	//模态窗口弹出
	 edit : function(id){
	     $("#update").modal({	
		    remote: "/machine/series/showAddModal1?id="+id	    	
		});
		$("#update").on("hidden.bs.modal", function() {  
		    $(this).removeData("bs.modal");  //清理数据
		});
	},
	 
	update:function(){
		  $.post("/machine/series?act=update",$("#form1").serialize(),function(){
			  
			  
			  $('#table').bootstrapTable('refresh');
		
	  })
	
		  
	  },
	del:function(id){
		

			
		$.post("/machine/series?act=delete",{id:id},
				
				function(){
			
			
			 $('#table').bootstrapTable('refresh');
////			parent.location.reload();//页面刷新
//			
		})
		
	}
};

