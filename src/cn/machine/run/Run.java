package cn.machine.run;

import org.mybatis.generator.api.ShellRunner;

/**
 * 运行使其自动映射文件
 * ！！！注：该方法仅限无dao,pojo,mapper方法时使用！！！
 * ！！！使用会覆盖所有数据
 */
public class Run {

	public static void main(String[] args) {

		String config = Run.class.getClassLoader()
				.getResource("generatorConfig.xml").getFile();
		String[] arg = { "-configfile", config, "-overwrite" };
		ShellRunner.main(arg);
	}
}
