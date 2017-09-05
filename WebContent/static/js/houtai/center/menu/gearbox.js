$(function() {
	gearbox.init();

})

var gearbox = {

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
				field : 'cTransmission',
				title : '变速箱 ',
			},
			{
				field : 'cGear_Number',
				title : '档位个数(个)',
			},			
			{
				field : 'cType_Gearbox',
				title : '变速箱类型',
			},			
			{
				field : 'zzzz',
				title : '操作',
				formatter : function(value, row, index) {
					var id = row.tId;
					return "<button class='btn btn-success btn-xs glyphicon glyphicon-edit' data-toggle='modal'"
							+ "data-target='#edit' onclick='gearbox.edit("
							+ id
							+ ")'></button>&nbsp;"
						;
				}
			} ],

	init : function() { // 初始化
		$("#table").bootstrapTable({
			url : "/machine/gearbox/listPage",
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
			remote : "/machine/gearbox/showAddModel1?tId=" + id
		});
		$("#update").on("hidden.bs.modal", function() {
			$(this).removeData("bs.modal"); // 清理数据
		});
	},
	update : function() {
		$.post("/machine/gearbox?act=update", $("#form1").serialize(), function() {
			$('#table').bootstrapTable('refresh');

		})
	},
};
