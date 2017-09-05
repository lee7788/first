package cn.machine.pojo;

public class GaoDe {
	private Integer id;
	private String profile;// 公司简介
	private String Qualifications;//荣誉资质
	private  String Framework;//组织架构
    private  String  Cultire;//企业文化
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getQualifications() {
		return Qualifications;
	}
	public void setQualifications(String qualifications) {
		Qualifications = qualifications;
	}
	public String getFramework() {
		return Framework;
	}
	public void setFramework(String framework) {
		Framework = framework;
	}
	public String getCultire() {
		return Cultire;
	}
	public void setCultire(String cultire) {
		Cultire = cultire;
	}
}
