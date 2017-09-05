$(function() {
	carbody.init();

})

var carbody = { // 车身

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
				field : 'length',
				title : '长度(mm) ',
			},
			{
				field : 'wide',
				title : '宽度(mm)',
			},
			{
				field : 'height',
				title : '高度(mm)',
			},
			{
				field : 'fronttrack',
				title : '前轮距(mm)',
			},
			{
				field : 'rearwheel',
				title : '后轮距(mm) ',
			},
			{
				field : 'minimumgroundclearance',
				title : '最小离地间隙(mm)',
			},
			{
				field : 'curbweight',
				title : '整备质量(kg)',
			},
			{
				field : 'numberdoors',
				title : '车门数(个)',
			},

			{
				field : 'numberseats',
				title : '座位数(个)',
			},
			{
				field : 'cTank_Volume',
				title : '油箱容积(L)',
			},
			{
				field : 'cLuggage_Space',
				title : '行李箱容积(L)',
			},
			{
				field : 'zzzz',
				title : '操作',
				formatter : function(value, row, index) {
					var id = row.tId;
					return "<button class='btn btn-success btn-xs glyphicon glyphicon-edit' data-toggle='modal'"
							+ "data-target='#edit' onclick='carbody.edit("
							+ id
							+ ")'></button>&nbsp;"
						;
				}
			} ],

	init : function() { // 初始化
		$("#table").bootstrapTable({
			url : "/machine/carbody/listPage",
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
			remote : "/machine/carbody/showAddModel1?tId=" + id
		});
		$("#update").on("hidden.bs.modal", function() {
			$(this).removeData("bs.modal"); // 清理数据
		});
	},
	update : function() {
		$.post("/machine/carbody?act=update", $("#form1").serialize(), function() {
			$('#table').bootstrapTable('refresh');

		})
	},
};
