$(function() {
	wheelbrake.init();

})

var wheelbrake = {

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
				field : 'frontbraketype',
				title : '前制动器类型 ',
			},
			{
				field : 'rearbraketype',
				title : '后制动器类型 ',
			},
			{
				field : 'parkingbraketype',
				title : '驻车制动类型',
			},			
			
			{
				field : 'fronttyrespecification',
				title : '前轮胎规格',
			},	
			{
				field : 'reartirespecification',
				title : '后轮胎规格',
			},
			{
				field : 'sparewheelspecification',
				title : '备胎规格',
			},	
			{
				field : 'zzzz',
				title : '操作',
				formatter : function(value, row, index) {
					var id = row.tId;
					return "<button class='btn btn-success btn-xs glyphicon glyphicon-edit' data-toggle='modal'"
							+ "data-target='#edit' onclick='wheelbrake.edit("
							+ id
							+ ")'></button>&nbsp;"
						;
				}
			} ],

	init : function() { // 初始化
		$("#table").bootstrapTable({
			url : "/machine/wheelbrake/listPage",
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

	// 模态窗口弹出
	edit : function(id) {
		$("#update").modal({
			remote : "/machine/wheelbrake/showAddModel1?tId=" + id
		});
		$("#update").on("hidden.bs.modal", function() {
			$(this).removeData("bs.modal"); // 清理数据
		});
	},
	update : function() {
		$.post("/machine/wheelbrake?act=update", $("#form1").serialize(), function() {
			$('#table').bootstrapTable('refresh');

		})
	},
};
