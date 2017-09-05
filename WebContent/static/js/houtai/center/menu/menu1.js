$(function(){
	
	menu1.init();
})
var menu1={// 关于高德
	columns:[
	        {
	        	field : 'id',
	    		title : 'id',
	        } ,{
	        	field : 'profile',
	    		title : ' 公司简介',
	        },{
	        	field : 'qualifications',
	    		title : ' 荣誉资质',
	        },{
	        	field : 'framework',
	    		title : ' 组织架构',
	        },{
	        	field : 'cultire',
	    		title : ' 企业文化',
	        	
	        },{
	        	field : 'zzzz',
	    		title : '操作',
	    		formatter : function (value, row, index) {
	    			var id = row.id;
	    			return "<button class='btn btn-success btn-xs glyphicon glyphicon-edit' data-toggle='modal'" +
	    				"data-target='#edit' onclick='menu1.edit(" + id + ")'></button>&nbsp;" 
	    		}
	    	}	                 
	         ],
init : function(){	//初始化
	$("#table").bootstrapTable({
		url : "/machine/menu1?act=serch",
		queryParams: function(params) {
			return {
				pageSize: params.limit,	//每页显示10条数据
	            offset: params.offset,	//每页的第一条数据
			}
        },
		columns : this.columns,
	});
//	$('#table').bootstrapTable('hideColumn', 'id');
},

edit:function(id){

	$("#update").modal({	
	    remote: "/machine/menu1/showAddModel?id="+id		    	
	});
	$("#update").on("hidden.bs.modal", function() {  
	    $(this).removeData("bs.modal");  //清理数据
	});
},
update:function(){
	  $.post("/machine/menu1?act=update",$("#form1").serialize(),function(){
		  $('#table').bootstrapTable('refresh')
		  parent.location.reload();//页面刷新 
	  })

	  
},
	
}