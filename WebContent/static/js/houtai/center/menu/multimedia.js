$(function(){
	multimedia.init();
	
})

var multimedia = {	//参数配置
		
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
		field : 'gpsnavigation',
		title : 'GPS导航系统 ',
	}, {
		field : 'locationservice',
		title : '定位互动服务',
	}, {
		field : 'szmcolour',
		title : '中控台彩色大屏',
	}, {
		field : 'szmcoloursize',
		title : '中控台彩色大屏尺寸 ',
	}, {
		field : 'lcdscreendisplay',
		title : '中控液晶屏分屏显示',
	}, {
		field : 'bluetoothcarphone',
		title : '蓝牙/车载电话 ',
	}, {
		field : 'mobilemapping',
		title : '手机互联/映射',
	}, {
		field : 'vehiclenetworking',
		title : '车联网',
	}, {
		field : 'cartv',
		title : '车载电视',
	}, {
		field : 'rearlcdscreen',
		title : '后排液晶显示屏',
	}, {
		field : 'powersupply',
		title : '220v/230v电源',
	}, {
		field : 'externaaudiointerface',
		title : '外接音源接口',
	}, {
		field : 'cd',
		title : 'CD/DVD',
	}, {
		field : 'speakerbrand',
		title : '扬声器品牌',
	}, {
		field : 'loudspeakerquantity',
		title : '扬声器数量',
	}, {
		field : '',
		title : '操作',
		formatter : function (value, row, index) {
			var id = row.tId;
			return "<button class='btn btn-success btn-xs glyphicon glyphicon-edit' data-toggle='modal'" +
				"data-target='#edit' onclick='multimedia.edit(" + id + ")'></button>&nbsp;" /*+ 
				"<button class='btn btn-primary btn-xs glyphicon glyphicon-remove'" +
				"onclick='multimedia.del(" + id + ")'></button>"*/;
		}
	} ],
	
	init : function(){	//初始化
		$("#table").bootstrapTable({
			url : "/machine/multimedia/listPage",
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
		    remote: "/machine/multimedia/showAddModal?id="+id	    	
		});
		$("#update").on("hidden.bs.modal", function() {  
		    $(this).removeData("bs.modal");  //清理数据
		});
	},
	 update:function(){
		  $.post("/machine/multimedia?act=update",$("#form1").serialize(),function(){
 			  $('#table').bootstrapTable('refresh');
		 // parent.location.reload();//页面刷新 
	  })
  
	  },
	  
	
};

