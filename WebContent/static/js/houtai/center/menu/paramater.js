$(function() {
	paramater.init();

})

var paramater = { // 基本参数配置

	columns : [
			{
				field : 'tId',
				title : 'id',
			},
			{
				field : 'cName',
				title : '品牌',
			},
				
			{
				field : 'cSeries',
				title : '系列',
			},
			
			{
				field : 'ctype',
				title : '类型 ',
			},
			{
				field : 'level',
				title : '级别 ',
			},
			{
				field : 'cTime_Market',
				title : '上市时间',
			},
			{
				field : 'cEngine',
				title : '发动机',
			},
			{
				field : 'cTransmission',
				title : '变速箱',
			},
			{
				field : 'cVolume',
				title : '长*宽*高(mm) ',
			},
			{
				field : 'cStructure',
				title : '车身结构',
			},
			{
				field : 'cMax_Speed',
				title : '最高车速(km/h)',
			},
			{
				field : 'officialacceleration',
				title : '官方0-100km/h加速(s)',
			},

			{
				field : 'measuredacceleration',
				title : '实测0-100km/h加速(s)',
			},
			{
				field : 'actualbraking',
				title : '实测0-100km/h制动(m)',
			},
			{
				field : 'integratedcoil',
				title : '工信部综合油耗(L/100km)',
			},
			{
				field : 'cOil',
				title : '实测油耗(L/100km)',
			},
			{
				field : 'cVehicle_warranty',
				title : '整车质保',
			},
			{
				field : 'groundclearance',
				title : '实测离地间隙（mm）',
			},


			{
				field : 'zzzz',
				title : '操作',
				formatter : function(value, row, index) {
					var id = row.tId;
					return "<button class='btn btn-success btn-xs glyphicon glyphicon-edit' data-toggle='modal'"
							+ "data-target='#edit' onclick='paramater.edit("
							+ id
							+ ")'></button>&nbsp;"
							+ "<button class='btn btn-primary btn-xs glyphicon glyphicon-remove'"
							+ "onclick='paramater.del(" + id + ")'></button>";
				}
			} ],

	init : function() { // 初始化
		$("#table").bootstrapTable({
			url : "/machine/parameter/listPage",
			queryParams : function(params) {
				return {
					pageSize : params.limit, // 每页显示10条数据
					offset : params.offset, // 每页的第一条数据
				}
			},
			columns : this.columns,
		});
		$('#table').bootstrapTable('hideColumn', 'tId');
	},

	showAddModal : function() {

		$("#add").modal({
			remote : "/machine/parameter/showAddModal"
		});
		$("#add").on("hidden.bs.modal", function() {
			$(this).removeData("bs.modal");
		});

	},

	addSave : function() {
		$.post("/machine/parameter?act=add", $("#form").serialize(), function() {
			$('#table').bootstrapTable('refresh');
		})

	},
	// 模态窗口弹出
	edit : function(id) {
		$("#update").modal({
			remote : "/machine/parameter/showAddModel1?tId=" + id
		});
		$("#update").on("hidden.bs.modal", function() {
			$(this).removeData("bs.modal"); // 清理数据
		});
	},
	update : function() {
		$.post("/machine/parameter?act=update", $("#form1").serialize(), function() {
			$('#table').bootstrapTable('refresh');

		})
	},
	del : function(id) {
		$.post("/machine/parameter?act=delete", {
			tId : id
		}, function() {
			$('#table').bootstrapTable('refresh');
			// // parent.location.reload();//页面刷新
			//			
		})

	}
};
