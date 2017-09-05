$(function(){
	seat.init();
	
})

var seat = {	//参数配置
		
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
		field : 'seatmaterial',
		title : '座椅材质 ',
	}, {
		field : 'sportstyleseat',
		title : '运动风格座椅',
	}, {
		field : 'seatadjustment',
		title : '座椅高低调节',
	}, {
		field : 'lumbarsupport',
		title : '腰部支撑调节',
	}, {
		field : 'shouldersupport',
		title : '肩部支撑调节',
	}, {
		field : 'driverelectricadjustment',
		title : '驾驶座电动调节',
	}, {
		field : 'secondrowadjust',
		title : '第二排靠背角度调节',
	}, {
		field : 'movesecondrow',
		title : '第二排座椅移动',
	}, {
		field : 'rearseat',
		title : '后排座椅电动调节',
	}, {
		field : 'reardriverbutton',
		title : '副驾驶后排可调节按钮',
	}, {
		field : 'electricseatmemory',
		title : '电动座椅记忆',
	}, {
		field : 'seatheating',
		title : '座椅加热',
	}, {
		field : 'seatventilation',
		title : '座椅通风',
	}, {
		field : 'seatarrangement',
		title : '座椅按摩',
	}, {
		field : 'secondrowseat',
		title : '第二排独立座椅',
	}, {
		field : 'thirdrowseat',
		title : '第三排座椅',
	}, {
		field : 'rearseatmode',
		title : '后排座椅放倒方式',
	}, {
		field : 'armrest',
		title : '前后中央扶手',
	}, {
		field : 'rearcupholder',
		title : '后排杯架',
	}, {
		field : 'heatingcupholder',
		title : '可加热/制冷杯架',
	}, {
		field : '',
		title : '操作',
		formatter : function (value, row, index) {
			var id = row.tId;
			return "<button class='btn btn-success btn-xs glyphicon glyphicon-edit' data-toggle='modal'" +
				"data-target='#edit' onclick='seat.edit(" + id + ")'></button>&nbsp;" /*+ 
				"<button class='btn btn-primary btn-xs glyphicon glyphicon-remove'" +
				"onclick='seat.del(" + id + ")'></button>"*/;
		}
	} ],
	
	init : function(){	//初始化
		$("#table").bootstrapTable({
			url : "/machine/seat/listPage",
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
		    remote: "/machine/seat/showAddModal?id="+id	    	
		});
		$("#update").on("hidden.bs.modal", function() {  
		    $(this).removeData("bs.modal");  //清理数据
		});
	},
	 update:function(){
		  $.post("/machine/seat?act=update",$("#form1").serialize(),function(){
 			  $('#table').bootstrapTable('refresh');
		 // parent.location.reload();//页面刷新 
	  })
  
	  },
	  
	
};

