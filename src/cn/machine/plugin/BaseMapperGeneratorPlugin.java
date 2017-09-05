package cn.machine.plugin;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.TopLevelClass;

/**
 * 创建dao中的mapper方法，使其继承BaseMapper
 *
 */
public class BaseMapperGeneratorPlugin extends PluginAdapter {

	public boolean validate(List<String> warnings) {
		return true;
	}

	/**
	 * 生成dao
	 */
	@Override
	public boolean clientGenerated(Interface interfaze,
			TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		/**
		 * 主键默认采用java.lang.Integer
		 */
		FullyQualifiedJavaType fqjt = new FullyQualifiedJavaType("BaseMapper<"
				+ introspectedTable.getBaseRecordType() + ","
				+ "java.lang.Integer" + ">");
		FullyQualifiedJavaType imp = new FullyQualifiedJavaType(
				"cn.machine.dao.BaseMapper");
		/**
		 * 添加 extends BaseMapper
		 */
		interfaze.addSuperInterface(fqjt);

		/**
		 * 添加import cn.machine.dao.BaseMapper;
		 */
		interfaze.addImportedType(imp);
		/**
		 * 方法不需要
		 */
		interfaze.getMethods().clear();
		interfaze.getAnnotations().clear();
		return true;
	}

}