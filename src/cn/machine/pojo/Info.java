package cn.machine.pojo;

import java.util.List;

public class Info {
	private int id;//主键	
	private String cName;
	private String cSeries;
	private String cType;	
	private int  cSupplier;//用户
	private String name;
	private int cPicture;
	private double cNet_price;//净车价
	private double cTax;//购置税
	private double vehicle_vessel_tax;//车船税
	private double registration_fee;//上牌费用
	private double insurance;//交强险
	private double commercial_insurance;//商业保险
	private double fine_suit;//精品套装
	private double mortgage;//按揭（另计）
	private double cPrice;//全包售价
	private String  packagePrice;//套餐价
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getcNet_price() {
		return cNet_price;
	}
	public void setcNet_price(double cNet_price) {
		this.cNet_price = cNet_price;
	}
	public double getcTax() {
		return cTax;
	}
	public void setcTax(double cTax) {
		this.cTax = cTax;
	}
	public double getVehicle_vessel_tax() {
		return vehicle_vessel_tax;
	}
	public void setVehicle_vessel_tax(double vehicle_vessel_tax) {
		this.vehicle_vessel_tax = vehicle_vessel_tax;
	}
	public double getRegistration_fee() {
		return registration_fee;
	}
	public void setRegistration_fee(double registration_fee) {
		this.registration_fee = registration_fee;
	}
	public double getInsurance() {
		return insurance;
	}
	public void setInsurance(double insurance) {
		this.insurance = insurance;
	}
	public double getCommercial_insurance() {
		return commercial_insurance;
	}
	public void setCommercial_insurance(double commercial_insurance) {
		this.commercial_insurance = commercial_insurance;
	}
	public double getFine_suit() {
		return fine_suit;
	}
	public void setFine_suit(double fine_suit) {
		this.fine_suit = fine_suit;
	}
	public double getMortgage() {
		return mortgage;
	}
	public void setMortgage(double mortgage) {
		this.mortgage = mortgage;
	}
	public double getcPrice() {
		return cPrice;
	}
	public void setcPrice(double cPrice) {
		this.cPrice = cPrice;
	}
	public String getPackagePrice() {
		return packagePrice;
	}
	public void setPackagePrice(String packagePrice) {
		this.packagePrice = packagePrice;
	}
	
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcType() {
		return cType;
	}
	public void setcType(String cType) {
		this.cType = cType;
	}
	
	public String getcSeries() {
		return cSeries;
	}
	public void setcSeries(String cSeries) {
		this.cSeries = cSeries;
	}
	public int getcSupplier() {
		return cSupplier;
	}
	public void setcSupplier(int cSupplier) {
		this.cSupplier = cSupplier;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getcPicture() {
		return cPicture;
	}
	public void setcPicture(int cPicture) {
		this.cPicture = cPicture;
	}
	
	
}