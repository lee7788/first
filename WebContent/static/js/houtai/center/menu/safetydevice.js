$(function() {
	safetydevice.init();

})

var safetydevice = {

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
				field : 'mastersecondaryseatairbag',
				title : '主/副驾驶安全气囊 ',
			},
			{
				field : 'frontandrearairbag',
				title : '前/后排侧气囊 ',
			},
			{
				field : 'aircurtain',
				title : '前/后头部气囊',
			},
			{
				field : 'kneeairbag',
				title : '膝部气囊 ',
			},
			{
				field : 'tirepressuremonitoring',
				title : '胎压监测 ',
			},
			{
				field : 'notindicated',
				title : '安全带未系提示 ',
			},
			{
				field : 'childseatinterface',
				title : 'IOSFIX儿童座椅接口 ',
			},
			{
				field : 'absabs',
				title : 'ABS防抱死 ',
			},		
			{
				field : 'brakingforcedistribution',
				title : '制动力分配(EBD/CBC)',
			},
			{
				field : 'brakeassist',
				title : '刹车辅助(EBA/BAS/BA) ',
			},
			{
				field : 'tractioncontrol',
				title : '牵引力控制(ASR/TCS/TRC)',
			},

			{
				field : 'carbodycontrol',
				title : '车身稳定控制(ESC/ESP/DSC)',
			},
			{
				field : 'auxiliary',
				title : '并线辅助',
			},
			{
				field : 'ldws',
				title : '车道偏离预警系统',
			},
			{
				field : 'activebrake',
				title : '主动刹车/主动安全系统',
			},
			{
				field : 'nightvisionsystem',
				title : '夜视系统',
			},
			{
				field : 'fatiguedrivingtips',
				title : '疲劳驾驶提示',
			},
			{
				field : 'zzzz',
				title : '操作',
				formatter : function(value, row, index) {
					var id = row.tId;
					return "<button class='btn btn-success btn-xs glyphicon glyphicon-edit' data-toggle='modal'"
							+ "data-target='#edit' onclick='safetydevice.edit("
							+ id + ")'></button>&nbsp;";
				}
			} ],

	init : function() { // 初始化
		$("#table").bootstrapTable({
			url : "/machine/safetydevice/listPage",
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
			remote : "/machine/safetydevice/showAddModel1?tId=" + id
		});
		$("#update").on("hidden.bs.modal", function() {
			$(this).removeData("bs.modal"); // 清理数据
		});
	},
	update : function() {
		$.post("/machine/safetydevice?act=update", $("#form1").serialize(),
				function() {
					$('#table').bootstrapTable('refresh');

				})
	},
};
