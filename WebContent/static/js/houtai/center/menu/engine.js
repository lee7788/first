$(function() {
	engine.init();

})

var engine = { // 车身

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
				field : 'displacement',
				title : '排量',
			},
			{
				field : 'cAir_Intake',
				title : '进气形式',
			},
			{
				field : 'arrangement',
				title : '气缸排列形式',
			},
			{
				field : 'cNumber_Cylinders',
				title : '气缸数(个)',
			},
			{
				field : 'valvetrain',
				title : '每缸气门数(个)',
			},
			{
				field : 'compressiontatio',
				title : '压缩比',
			},
			{
				field : 'valvetrain1',
				title : '配气机构',
			},
			{
				field : 'bore',
				title : '缸径(mm)',
			},

			{
				field : 'trip',
				title : '行程(mm)',
			},
			{
				field : 'cMaximum_Horsepower',
				title : '最大马力（Ps）',
			},
			{
				field : 'cMost_Powerful',
				title : '最大功率（kw）',
			},
			{
				field : 'cMaximum_Torque',
				title : '最大扭矩（N.m）',
			},{
				field : 'cMaximum_Torque_Speed',
				title : '最大功率转速（rpm）',
			},{
				field : 'maximum_TorqueSpeed',
				title : '最大扭矩转速（rpm）',
			},{
				field : 'engineSpecificTechnology',
				title : '发动机特有技术',
			},{
				field : 'cCombustion_Form',
				title : '燃料形式',
			},
			{
				field : 'cFuel_Number',
				title : '燃油编号',
			},{
				field : 'cOil_Supply_Way',
				title : '供油方式',
			},
			{
				field : 'cylinderheadmaterial',
				title : '缸盖材料',
			},
			{
				field : 'cylindermaterial',
				title : '缸体材料',
			},
			{
				field : 'environmentalstandard',
				title : '环保标准',
			},
			{
				field : 'zzzz',
				title : '操作',
				formatter : function(value, row, index) {
					var id = row.tId;
					return "<button class='btn btn-success btn-xs glyphicon glyphicon-edit' data-toggle='modal'"
							+ "data-target='#edit' onclick='engine.edit("
							+ id
							+ ")'></button>&nbsp;"
						;
				}
			} ],

	init : function() { // 初始化
		$("#table").bootstrapTable({
			url : "/machine/engine/listPage",
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
			remote : "/machine/engine/showAddModel1?tId=" + id
		});
		$("#update").on("hidden.bs.modal", function() {
			$(this).removeData("bs.modal"); // 清理数据
		});
	},
	update : function() {
		$.post("/machine/engine?act=update", $("#form1").serialize(), function() {
			$('#table').bootstrapTable('refresh');

		})
	},
};
