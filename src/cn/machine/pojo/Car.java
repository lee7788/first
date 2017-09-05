package cn.machine.pojo;

/**
 * @author asus
 *
 */
public class Car {
private int tId;//主键
private int cid;
private String cName;//品牌
private String cSeries;//车系
private String ctype;//类型
private String cVolume;//车长
private String cEngine;//发动机
private  String   cType_Gearbox;//变速箱类型
private  int  cGear_Number;//档位个数
private  String  cOil;//实测油耗
private String   cCombustion_Form;//燃烧形式
private  String  cFuel_Number;//燃油编号
private  String  cOil_Supply_Way;//供油方式
private String  cPrice;//车价格
private String cTime_Market;//上市時間
private String cTransmission;//变速箱

private String cWheelbase;//轴距（mm）
private String  cTank_Volume;//油箱容积
private String cLuggage_Space;//行李箱容积
private  String  cStructure;//车身结构
private  int  cMax_Speed;// 最高车速
private  String  cVehicle_warranty;//质保
private  String  cAir_Intake;// 进气形式
private  int  cNumber_Cylinders; //气缸数
private String cMaximum_Horsepower;//最大马力（Ps）
private  String  cMost_Powerful;//最大功率（kw）
private  String  cMaximum_Torque;//最大扭矩（N.m）
private  String  cMaximum_Torque_Speed;//最大功率转速（rpm）
private int sid;//车系表id
private String level;//级别
private String officialacceleration;//官方0-100km/h加速（s）
private String measuredacceleration;//实测0-100km/h加速（s）
private String actualbraking;//实测100-0km/h制动
private String integratedcoil;//工信部综合油耗(L/100km)
private String groundclearance;//实测离地间隙（mm）
private String length;//长度
private String wide;//宽度
private String height;//高度
private String fronttrack;//前轮距
private String rearwheel;//后轮距
private String minimumgroundclearance;//最小离地间隙
private String curbweight;//整备质量
private String numberdoors;//车门数
private String numberseats;//座位个数
private String displacement;//排量
private String arrangement;//气缸排列形式
private String valvetrain;//每缸气门数
private String compressiontatio;//压缩比
private String valvetrain1;//配气机构
private String bore;//缸径(mm)
private String trip;//行程(mm)
private String cylinderheadmaterial;//缸盖材料
private String cylindermaterial;//缸体材料
private String environmentalstandard;//环保标准
private String drivemode;//驱动方式
private String frontsuspensiontype;//前悬架类型
private String rearsuspensiontype;//后悬架类型
private String powertype;//助力类型
private String carbodystructure;//车体结构
private String frontbraketype;//前制动器类型
private String rearbraketype;//后制动器类型
private String parkingbraketype;//驻车制动类型
private String fronttyrespecification;//前轮胎规格
private String reartirespecification;//后轮胎规格
private String sparewheelspecification;//备胎规格
private String mastersecondaryseatairbag;//主副驾驶安全气囊
private String frontandrearairbag;//前后排侧气囊
private String aircurtain;//前后头部气囊
private String kneeairbag;//膝部气囊
private String tirepressuremonitoring;//胎压监测
private String notindicated;//安全带未系提示
private String childseatinterface;//IOSFIX儿童座椅接口
private String absabs;//ABS防抱死
private String brakingforcedistribution;//制动力分配(EBD/CBC)
private String brakeassist;//刹车辅助(EBA/BAS/BA)
private String tractioncontrol;//牵引力控制(ASR/TCS/TRC)
private String carbodycontrol;//车身稳定控制(ESC/ESP/DSC)
private String auxiliary;//并线辅助
private String ldws;//车道偏离预警系统
private String activebrake;//主动刹车/主动安全系统
private String nightvisionsystem;//夜视系统
private String fatiguedrivingtips;//疲劳驾驶提示

/*
 *辅助、操控配置
 **/
private String vehicleradar;//前后驻车雷达
private String reversingvideoimages;//倒车视频影像
private String panoramiccamera;//全景摄像头
private String cruisecontrol;//定速巡航
private String adaptivecruise;//自适应巡航
private String automaticparkingaccess;//自动泊车入位
private String enginestartstop;//发动机启停技术
private String hillstartassist;//上坡辅助
private String automaticparking;//自动驻车
private String gentleslopedescent;//徒坡缓降
private String variablesuspension;//可变悬架
private String airsuspension;//空气悬架
private String electromagneticsuspension;//电磁感应悬架
private String variablesteeringratio;//可变转向比
private String differentiallock;//前桥限滑差速器/差速锁
private String centraldifferentiallock;//中央差速器锁止功能
private String reardifferentiallock;//后桥限滑差速器/差速锁
private String overallactivesteering;//整体主动转向系统

/*
 *外部/防盗配置
 **/
private String powersunroof;//电动天窗
private String panoramicsunroof;//全景天窗
private String sportsappearancekit;//运动外观套件
private String aluminumalloywheels;//铝合金轮圈
private String electricpulldoor;//电动吸合门
private String sidedoor;//侧滑门
private String etrunk;//电动后备厢
private String itrunk;//感应后备厢
private String rrack;//车顶行李架
private String eantitheft;//发动机电子防盗
private String carlock;//车内中控锁
private String remotekey;//遥控钥匙
private String keylessstart;//无钥匙启动
private String keylessentry;//无钥匙进入
private String remotebootengine;//远程启动发动

/*
 *内部配置
 **/
private String leathersteeringwheel;//真皮方向盘
private String steeringwheeladjustment;//方向盘电动调节
private String multifunctionals;//多功能方向盘
private String steeringwheelshift;//方向盘换挡
private String steeringwheelheat;//方向盘加热
private String steeringwheelmemory;//方向盘记忆
private String displayscreen;//行车电脑显示屏
private String fulllcddashboard;//全液晶仪表盘
private String digitaldisplay;//HUD抬头数字显示
private String builtrecorder;//内置行车记录仪
private String activenoiserreduction;//主动降噪
private String wirelesscharging;//手机无线充电

/*
 *座椅配置
 **/
private String seatmaterial;//座椅材质
private String sportstyleseat;//运动风格座椅
private String seatadjustment;//座椅高低调节
private String lumbarsupport;//腰部支撑调节
private String shouldersupport;//肩部支撑调节
private String driverelectricadjustment;//驾驶座电动调节
private String secondrowadjust;//第二排靠背角度调节
private String movesecondrow;//第二排座椅移动
private String rearseat;//后排座椅电动调节
private String reardriverbutton;//副驾驶后排可调节按钮
private String electricseatmemory;//电动座椅记忆
private String seatheating;//座椅加热
private String seatventilation;//座椅通风
private String seatarrangement;//座椅按摩
private String secondrowseat;//第二排独立座椅
private String thirdrowseat;//第三排座椅
private String rearseatmode;//后排座椅放倒方式
private String armrest;//前后中央扶手
private String rearcupholder;//后排杯架
private String heatingcupholder;//可加热/制冷杯架

/*
 *多媒体配置
 **/
private String gpsnavigation;//GPS导航系统
private String locationservice;//定位互动服务
private String szmcolour;//中控台彩色大屏
private String szmcoloursize;//中控台彩色大屏尺寸
private String lcdscreendisplay;//中控液晶屏分屏显示
private String bluetoothcarphone;//蓝牙/车载电话
private String mobilemapping;//手机互联/映射
private String vehiclenetworking;//车联网
private String cartv;//车载电视
private String rearlcdscreen;//后排液晶显示屏
private String powersupply;//220v/230v电源
private String externaaudiointerface;//外接音源接口
private String cd;//CD/DVD
private String speakerbrand;//扬声器品牌
private String loudspeakerquantity;//扬声器数量

/*
 *灯光配置
 **/
private String dippedheadlight;//近光灯
private String highbeam;//远光灯
private String leddaytimelight;//LED日间行光灯
private String adaptivelight;//自适应远近光
private String automaticheadlamp;//自动头灯
private String corneringlamp;//转向辅助灯
private String turnheadlamp;//转向头灯
private String frontfoglamp;//前雾灯
private String heightadjustable;//大灯高度可调
private String cleaningdevice;//大灯清洗装置
private String interiorlight;//车内氛围灯

/*
 *玻璃/后视镜
 **/
private String powerwindow;//前/后电动车窗
private String windowkeylift;//车窗一键升降
private String clampholder;//车窗防夹手
private String insulatingglass;//防紫外线/隔热玻璃
private String rearviewmirrorelectric;//后视镜电动调节
private String rearviewmirrorheat;//后视镜加热
private String automaticantiglare;//内外后视镜自动防炫目
private String mediumvehicle;//流媒体车内后视镜
private String powerfolding;//后视镜电动折叠
private String mirrormemory;//后视镜记忆
private String suncurtain;//后风遮挡阳帘
private String rearsideshade;//后排侧遮阳帘
private String privacyglass;//后排侧隐私玻璃
private String shadingmirror;//遮阳板化妆镜
private String rearwiper;//后雨刷
private String inductionwiper;//感应雨刷

/*
 *空调/冰箱 
 **/
private String controlmode;//空调控制方式
private String airconditioning;//后排独立空调
private String airoutlet;//后座出风口
private String zoncontrol;//温度分区控制
private String pollenfiltration;//车内空气调节/花粉过滤
private String carrefrigerator;//车载冰箱
private String  cColor;//车颜色
private String interiorcolor;//内饰颜色


public String getcSeries() {
	return cSeries;
}
public void setcSeries(String cSeries) {
	this.cSeries = cSeries;
}
public String getLevel() {
	return level;
}
public void setLevel(String level) {
	this.level = level;
}
public String getOfficialacceleration() {
	return officialacceleration;
}
public void setOfficialacceleration(String officialacceleration) {
	this.officialacceleration = officialacceleration;
}
public String getMeasuredacceleration() {
	return measuredacceleration;
}
public void setMeasuredacceleration(String measuredacceleration) {
	this.measuredacceleration = measuredacceleration;
}
public String getActualbraking() {
	return actualbraking;
}
public void setActualbraking(String actualbraking) {
	this.actualbraking = actualbraking;
}
public String getIntegratedcoil() {
	return integratedcoil;
}
public void setIntegratedcoil(String integratedcoil) {
	this.integratedcoil = integratedcoil;
}
public String getGroundclearance() {
	return groundclearance;
}
public void setGroundclearance(String groundclearance) {
	this.groundclearance = groundclearance;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getLength() {
	return length;
}
public void setLength(String length) {
	this.length = length;
}
public String getWide() {
	return wide;
}
public void setWide(String wide) {
	this.wide = wide;
}
public String getHeight() {
	return height;
}
public void setHeight(String height) {
	this.height = height;
}
public String getFronttrack() {
	return fronttrack;
}
public void setFronttrack(String fronttrack) {
	this.fronttrack = fronttrack;
}
public String getRearwheel() {
	return rearwheel;
}
public void setRearwheel(String rearwheel) {
	this.rearwheel = rearwheel;
}
public String getMinimumgroundclearance() {
	return minimumgroundclearance;
}
public void setMinimumgroundclearance(String minimumgroundclearance) {
	this.minimumgroundclearance = minimumgroundclearance;
}
public String getCurbweight() {
	return curbweight;
}
public void setCurbweight(String curbweight) {
	this.curbweight = curbweight;
}
public String getNumberdoors() {
	return numberdoors;
}
public void setNumberdoors(String numberdoors) {
	this.numberdoors = numberdoors;
}
public String getNumberseats() {
	return numberseats;
}
public void setNumberseats(String numberseats) {
	this.numberseats = numberseats;
}
public String getDisplacement() {
	return displacement;
}
public void setDisplacement(String displacement) {
	this.displacement = displacement;
}
public String getArrangement() {
	return arrangement;
}
public void setArrangement(String arrangement) {
	this.arrangement = arrangement;
}
public String getValvetrain() {
	return valvetrain;
}
public void setValvetrain(String valvetrain) {
	this.valvetrain = valvetrain;
}
public String getCompressiontatio() {
	return compressiontatio;
}
public void setCompressiontatio(String compressiontatio) {
	this.compressiontatio = compressiontatio;
}
public String getValvetrain1() {
	return valvetrain1;
}
public void setValvetrain1(String valvetrain1) {
	this.valvetrain1 = valvetrain1;
}
public String getBore() {
	return bore;
}
public void setBore(String bore) {
	this.bore = bore;
}
public String getTrip() {
	return trip;
}
public void setTrip(String trip) {
	this.trip = trip;
}
public String getCylinderheadmaterial() {
	return cylinderheadmaterial;
}
public void setCylinderheadmaterial(String cylinderheadmaterial) {
	this.cylinderheadmaterial = cylinderheadmaterial;
}
public String getCylindermaterial() {
	return cylindermaterial;
}
public void setCylindermaterial(String cylindermaterial) {
	this.cylindermaterial = cylindermaterial;
}
public String getEnvironmentalstandard() {
	return environmentalstandard;
}
public void setEnvironmentalstandard(String environmentalstandard) {
	this.environmentalstandard = environmentalstandard;
}
public String getDrivemode() {
	return drivemode;
}
public void setDrivemode(String drivemode) {
	this.drivemode = drivemode;
}
public String getFrontsuspensiontype() {
	return frontsuspensiontype;
}
public void setFrontsuspensiontype(String frontsuspensiontype) {
	this.frontsuspensiontype = frontsuspensiontype;
}
public String getRearsuspensiontype() {
	return rearsuspensiontype;
}
public void setRearsuspensiontype(String rearsuspensiontype) {
	this.rearsuspensiontype = rearsuspensiontype;
}
public String getPowertype() {
	return powertype;
}
public void setPowertype(String powertype) {
	this.powertype = powertype;
}
public String getCarbodystructure() {
	return carbodystructure;
}
public void setCarbodystructure(String carbodystructure) {
	this.carbodystructure = carbodystructure;
}
public String getFrontbraketype() {
	return frontbraketype;
}
public void setFrontbraketype(String frontbraketype) {
	this.frontbraketype = frontbraketype;
}
public String getRearbraketype() {
	return rearbraketype;
}
public void setRearbraketype(String rearbraketype) {
	this.rearbraketype = rearbraketype;
}
public String getParkingbraketype() {
	return parkingbraketype;
}
public void setParkingbraketype(String parkingbraketype) {
	this.parkingbraketype = parkingbraketype;
}
public String getFronttyrespecification() {
	return fronttyrespecification;
}
public void setFronttyrespecification(String fronttyrespecification) {
	this.fronttyrespecification = fronttyrespecification;
}
public String getReartirespecification() {
	return reartirespecification;
}
public void setReartirespecification(String reartirespecification) {
	this.reartirespecification = reartirespecification;
}
public String getSparewheelspecification() {
	return sparewheelspecification;
}
public void setSparewheelspecification(String sparewheelspecification) {
	this.sparewheelspecification = sparewheelspecification;
}
public String getMastersecondaryseatairbag() {
	return mastersecondaryseatairbag;
}
public void setMastersecondaryseatairbag(String mastersecondaryseatairbag) {
	this.mastersecondaryseatairbag = mastersecondaryseatairbag;
}
public String getFrontandrearairbag() {
	return frontandrearairbag;
}
public void setFrontandrearairbag(String frontandrearairbag) {
	this.frontandrearairbag = frontandrearairbag;
}
public String getAircurtain() {
	return aircurtain;
}
public void setAircurtain(String aircurtain) {
	this.aircurtain = aircurtain;
}
public String getKneeairbag() {
	return kneeairbag;
}
public void setKneeairbag(String kneeairbag) {
	this.kneeairbag = kneeairbag;
}
public String getTirepressuremonitoring() {
	return tirepressuremonitoring;
}
public void setTirepressuremonitoring(String tirepressuremonitoring) {
	this.tirepressuremonitoring = tirepressuremonitoring;
}
public String getNotindicated() {
	return notindicated;
}
public void setNotindicated(String notindicated) {
	this.notindicated = notindicated;
}
public String getChildseatinterface() {
	return childseatinterface;
}
public void setChildseatinterface(String childseatinterface) {
	this.childseatinterface = childseatinterface;
}
public String getAbsabs() {
	return absabs;
}
public void setAbsabs(String absabs) {
	this.absabs = absabs;
}
public String getBrakingforcedistribution() {
	return brakingforcedistribution;
}
public void setBrakingforcedistribution(String brakingforcedistribution) {
	this.brakingforcedistribution = brakingforcedistribution;
}
public String getBrakeassist() {
	return brakeassist;
}
public void setBrakeassist(String brakeassist) {
	this.brakeassist = brakeassist;
}
public String getTractioncontrol() {
	return tractioncontrol;
}
public void setTractioncontrol(String tractioncontrol) {
	this.tractioncontrol = tractioncontrol;
}
public String getCarbodycontrol() {
	return carbodycontrol;
}
public void setCarbodycontrol(String carbodycontrol) {
	this.carbodycontrol = carbodycontrol;
}
public String getAuxiliary() {
	return auxiliary;
}
public void setAuxiliary(String auxiliary) {
	this.auxiliary = auxiliary;
}
public String getLdws() {
	return ldws;
}
public void setLdws(String ldws) {
	this.ldws = ldws;
}
public String getActivebrake() {
	return activebrake;
}
public void setActivebrake(String activebrake) {
	this.activebrake = activebrake;
}
public String getNightvisionsystem() {
	return nightvisionsystem;
}
public void setNightvisionsystem(String nightvisionsystem) {
	this.nightvisionsystem = nightvisionsystem;
}
public String getFatiguedrivingtips() {
	return fatiguedrivingtips;
}
public void setFatiguedrivingtips(String fatiguedrivingtips) {
	this.fatiguedrivingtips = fatiguedrivingtips;
}
public String getVehicleradar() {
	return vehicleradar;
}
public void setVehicleradar(String vehicleradar) {
	this.vehicleradar = vehicleradar;
}
public String getReversingvideoimages() {
	return reversingvideoimages;
}
public void setReversingvideoimages(String reversingvideoimages) {
	this.reversingvideoimages = reversingvideoimages;
}
public String getPanoramiccamera() {
	return panoramiccamera;
}
public void setPanoramiccamera(String panoramiccamera) {
	this.panoramiccamera = panoramiccamera;
}
public String getCruisecontrol() {
	return cruisecontrol;
}
public void setCruisecontrol(String cruisecontrol) {
	this.cruisecontrol = cruisecontrol;
}
public String getAdaptivecruise() {
	return adaptivecruise;
}
public void setAdaptivecruise(String adaptivecruise) {
	this.adaptivecruise = adaptivecruise;
}
public String getAutomaticparkingaccess() {
	return automaticparkingaccess;
}
public void setAutomaticparkingaccess(String automaticparkingaccess) {
	this.automaticparkingaccess = automaticparkingaccess;
}
public String getEnginestartstop() {
	return enginestartstop;
}
public void setEnginestartstop(String enginestartstop) {
	this.enginestartstop = enginestartstop;
}
public String getHillstartassist() {
	return hillstartassist;
}
public void setHillstartassist(String hillstartassist) {
	this.hillstartassist = hillstartassist;
}
public String getAutomaticparking() {
	return automaticparking;
}
public void setAutomaticparking(String automaticparking) {
	this.automaticparking = automaticparking;
}
public String getGentleslopedescent() {
	return gentleslopedescent;
}
public void setGentleslopedescent(String gentleslopedescent) {
	this.gentleslopedescent = gentleslopedescent;
}
public String getVariablesuspension() {
	return variablesuspension;
}
public void setVariablesuspension(String variablesuspension) {
	this.variablesuspension = variablesuspension;
}
public String getAirsuspension() {
	return airsuspension;
}
public void setAirsuspension(String airsuspension) {
	this.airsuspension = airsuspension;
}
public String getElectromagneticsuspension() {
	return electromagneticsuspension;
}
public void setElectromagneticsuspension(String electromagneticsuspension) {
	this.electromagneticsuspension = electromagneticsuspension;
}
public String getVariablesteeringratio() {
	return variablesteeringratio;
}
public void setVariablesteeringratio(String variablesteeringratio) {
	this.variablesteeringratio = variablesteeringratio;
}
public String getDifferentiallock() {
	return differentiallock;
}
public void setDifferentiallock(String differentiallock) {
	this.differentiallock = differentiallock;
}
public String getCentraldifferentiallock() {
	return centraldifferentiallock;
}
public void setCentraldifferentiallock(String centraldifferentiallock) {
	this.centraldifferentiallock = centraldifferentiallock;
}
public String getReardifferentiallock() {
	return reardifferentiallock;
}
public void setReardifferentiallock(String reardifferentiallock) {
	this.reardifferentiallock = reardifferentiallock;
}
public String getOverallactivesteering() {
	return overallactivesteering;
}
public void setOverallactivesteering(String overallactivesteering) {
	this.overallactivesteering = overallactivesteering;
}
public String getPowersunroof() {
	return powersunroof;
}
public void setPowersunroof(String powersunroof) {
	this.powersunroof = powersunroof;
}
public String getPanoramicsunroof() {
	return panoramicsunroof;
}
public void setPanoramicsunroof(String panoramicsunroof) {
	this.panoramicsunroof = panoramicsunroof;
}
public String getSportsappearancekit() {
	return sportsappearancekit;
}
public void setSportsappearancekit(String sportsappearancekit) {
	this.sportsappearancekit = sportsappearancekit;
}
public String getAluminumalloywheels() {
	return aluminumalloywheels;
}
public void setAluminumalloywheels(String aluminumalloywheels) {
	this.aluminumalloywheels = aluminumalloywheels;
}
public String getElectricpulldoor() {
	return electricpulldoor;
}
public void setElectricpulldoor(String electricpulldoor) {
	this.electricpulldoor = electricpulldoor;
}
public String getSidedoor() {
	return sidedoor;
}
public void setSidedoor(String sidedoor) {
	this.sidedoor = sidedoor;
}
public String getEtrunk() {
	return etrunk;
}
public void setEtrunk(String etrunk) {
	this.etrunk = etrunk;
}
public String getItrunk() {
	return itrunk;
}
public void setItrunk(String itrunk) {
	this.itrunk = itrunk;
}
public String getRrack() {
	return rrack;
}
public void setRrack(String rrack) {
	this.rrack = rrack;
}
public String getEantitheft() {
	return eantitheft;
}
public void setEantitheft(String eantitheft) {
	this.eantitheft = eantitheft;
}
public String getCarlock() {
	return carlock;
}
public void setCarlock(String carlock) {
	this.carlock = carlock;
}
public String getRemotekey() {
	return remotekey;
}
public void setRemotekey(String remotekey) {
	this.remotekey = remotekey;
}
public String getKeylessstart() {
	return keylessstart;
}
public void setKeylessstart(String keylessstart) {
	this.keylessstart = keylessstart;
}
public String getKeylessentry() {
	return keylessentry;
}
public void setKeylessentry(String keylessentry) {
	this.keylessentry = keylessentry;
}
public String getRemotebootengine() {
	return remotebootengine;
}
public void setRemotebootengine(String remotebootengine) {
	this.remotebootengine = remotebootengine;
}
public String getLeathersteeringwheel() {
	return leathersteeringwheel;
}
public void setLeathersteeringwheel(String leathersteeringwheel) {
	this.leathersteeringwheel = leathersteeringwheel;
}
public String getSteeringwheeladjustment() {
	return steeringwheeladjustment;
}
public void setSteeringwheeladjustment(String steeringwheeladjustment) {
	this.steeringwheeladjustment = steeringwheeladjustment;
}
public String getMultifunctionals() {
	return multifunctionals;
}
public void setMultifunctionals(String multifunctionals) {
	this.multifunctionals = multifunctionals;
}
public String getSteeringwheelshift() {
	return steeringwheelshift;
}
public void setSteeringwheelshift(String steeringwheelshift) {
	this.steeringwheelshift = steeringwheelshift;
}
public String getSteeringwheelheat() {
	return steeringwheelheat;
}
public void setSteeringwheelheat(String steeringwheelheat) {
	this.steeringwheelheat = steeringwheelheat;
}
public String getSteeringwheelmemory() {
	return steeringwheelmemory;
}
public void setSteeringwheelmemory(String steeringwheelmemory) {
	this.steeringwheelmemory = steeringwheelmemory;
}
public String getDisplayscreen() {
	return displayscreen;
}
public void setDisplayscreen(String displayscreen) {
	this.displayscreen = displayscreen;
}
public String getFulllcddashboard() {
	return fulllcddashboard;
}
public void setFulllcddashboard(String fulllcddashboard) {
	this.fulllcddashboard = fulllcddashboard;
}
public String getDigitaldisplay() {
	return digitaldisplay;
}
public void setDigitaldisplay(String digitaldisplay) {
	this.digitaldisplay = digitaldisplay;
}
public String getBuiltrecorder() {
	return builtrecorder;
}
public void setBuiltrecorder(String builtrecorder) {
	this.builtrecorder = builtrecorder;
}
public String getActivenoiserreduction() {
	return activenoiserreduction;
}
public void setActivenoiserreduction(String activenoiserreduction) {
	this.activenoiserreduction = activenoiserreduction;
}
public String getWirelesscharging() {
	return wirelesscharging;
}
public void setWirelesscharging(String wirelesscharging) {
	this.wirelesscharging = wirelesscharging;
}
public String getSeatmaterial() {
	return seatmaterial;
}
public void setSeatmaterial(String seatmaterial) {
	this.seatmaterial = seatmaterial;
}
public String getSportstyleseat() {
	return sportstyleseat;
}
public void setSportstyleseat(String sportstyleseat) {
	this.sportstyleseat = sportstyleseat;
}
public String getSeatadjustment() {
	return seatadjustment;
}
public void setSeatadjustment(String seatadjustment) {
	this.seatadjustment = seatadjustment;
}
public String getLumbarsupport() {
	return lumbarsupport;
}
public void setLumbarsupport(String lumbarsupport) {
	this.lumbarsupport = lumbarsupport;
}
public String getShouldersupport() {
	return shouldersupport;
}
public void setShouldersupport(String shouldersupport) {
	this.shouldersupport = shouldersupport;
}
public String getDriverelectricadjustment() {
	return driverelectricadjustment;
}
public void setDriverelectricadjustment(String driverelectricadjustment) {
	this.driverelectricadjustment = driverelectricadjustment;
}
public String getSecondrowadjust() {
	return secondrowadjust;
}
public void setSecondrowadjust(String secondrowadjust) {
	this.secondrowadjust = secondrowadjust;
}
public String getMovesecondrow() {
	return movesecondrow;
}
public void setMovesecondrow(String movesecondrow) {
	this.movesecondrow = movesecondrow;
}
public String getRearseat() {
	return rearseat;
}
public void setRearseat(String rearseat) {
	this.rearseat = rearseat;
}
public String getReardriverbutton() {
	return reardriverbutton;
}
public void setReardriverbutton(String reardriverbutton) {
	this.reardriverbutton = reardriverbutton;
}
public String getElectricseatmemory() {
	return electricseatmemory;
}
public void setElectricseatmemory(String electricseatmemory) {
	this.electricseatmemory = electricseatmemory;
}
public String getSeatheating() {
	return seatheating;
}
public void setSeatheating(String seatheating) {
	this.seatheating = seatheating;
}
public String getSeatventilation() {
	return seatventilation;
}
public void setSeatventilation(String seatventilation) {
	this.seatventilation = seatventilation;
}
public String getSeatarrangement() {
	return seatarrangement;
}
public void setSeatarrangement(String seatarrangement) {
	this.seatarrangement = seatarrangement;
}
public String getSecondrowseat() {
	return secondrowseat;
}
public void setSecondrowseat(String secondrowseat) {
	this.secondrowseat = secondrowseat;
}
public String getThirdrowseat() {
	return thirdrowseat;
}
public void setThirdrowseat(String thirdrowseat) {
	this.thirdrowseat = thirdrowseat;
}
public String getRearseatmode() {
	return rearseatmode;
}
public void setRearseatmode(String rearseatmode) {
	this.rearseatmode = rearseatmode;
}
public String getArmrest() {
	return armrest;
}
public void setArmrest(String armrest) {
	this.armrest = armrest;
}
public String getRearcupholder() {
	return rearcupholder;
}
public void setRearcupholder(String rearcupholder) {
	this.rearcupholder = rearcupholder;
}
public String getHeatingcupholder() {
	return heatingcupholder;
}
public void setHeatingcupholder(String heatingcupholder) {
	this.heatingcupholder = heatingcupholder;
}
public String getGpsnavigation() {
	return gpsnavigation;
}
public void setGpsnavigation(String gpsnavigation) {
	this.gpsnavigation = gpsnavigation;
}
public String getLocationservice() {
	return locationservice;
}
public void setLocationservice(String locationservice) {
	this.locationservice = locationservice;
}
public String getSzmcolour() {
	return szmcolour;
}
public void setSzmcolour(String szmcolour) {
	this.szmcolour = szmcolour;
}
public String getSzmcoloursize() {
	return szmcoloursize;
}
public void setSzmcoloursize(String szmcoloursize) {
	this.szmcoloursize = szmcoloursize;
}
public String getLcdscreendisplay() {
	return lcdscreendisplay;
}
public void setLcdscreendisplay(String lcdscreendisplay) {
	this.lcdscreendisplay = lcdscreendisplay;
}
public String getBluetoothcarphone() {
	return bluetoothcarphone;
}
public void setBluetoothcarphone(String bluetoothcarphone) {
	this.bluetoothcarphone = bluetoothcarphone;
}
public String getMobilemapping() {
	return mobilemapping;
}
public void setMobilemapping(String mobilemapping) {
	this.mobilemapping = mobilemapping;
}
public String getVehiclenetworking() {
	return vehiclenetworking;
}
public void setVehiclenetworking(String vehiclenetworking) {
	this.vehiclenetworking = vehiclenetworking;
}
public String getCartv() {
	return cartv;
}
public void setCartv(String cartv) {
	this.cartv = cartv;
}
public String getRearlcdscreen() {
	return rearlcdscreen;
}
public void setRearlcdscreen(String rearlcdscreen) {
	this.rearlcdscreen = rearlcdscreen;
}
public String getPowersupply() {
	return powersupply;
}
public void setPowersupply(String powersupply) {
	this.powersupply = powersupply;
}
public String getExternaaudiointerface() {
	return externaaudiointerface;
}
public void setExternaaudiointerface(String externaaudiointerface) {
	this.externaaudiointerface = externaaudiointerface;
}
public String getCd() {
	return cd;
}
public void setCd(String cd) {
	this.cd = cd;
}
public String getSpeakerbrand() {
	return speakerbrand;
}
public void setSpeakerbrand(String speakerbrand) {
	this.speakerbrand = speakerbrand;
}
public String getLoudspeakerquantity() {
	return loudspeakerquantity;
}
public void setLoudspeakerquantity(String loudspeakerquantity) {
	this.loudspeakerquantity = loudspeakerquantity;
}
public String getDippedheadlight() {
	return dippedheadlight;
}
public void setDippedheadlight(String dippedheadlight) {
	this.dippedheadlight = dippedheadlight;
}
public String getHighbeam() {
	return highbeam;
}
public void setHighbeam(String highbeam) {
	this.highbeam = highbeam;
}
public String getLeddaytimelight() {
	return leddaytimelight;
}
public void setLeddaytimelight(String leddaytimelight) {
	this.leddaytimelight = leddaytimelight;
}
public String getAdaptivelight() {
	return adaptivelight;
}
public void setAdaptivelight(String adaptivelight) {
	this.adaptivelight = adaptivelight;
}
public String getAutomaticheadlamp() {
	return automaticheadlamp;
}
public void setAutomaticheadlamp(String automaticheadlamp) {
	this.automaticheadlamp = automaticheadlamp;
}
public String getCorneringlamp() {
	return corneringlamp;
}
public void setCorneringlamp(String corneringlamp) {
	this.corneringlamp = corneringlamp;
}
public String getTurnheadlamp() {
	return turnheadlamp;
}
public void setTurnheadlamp(String turnheadlamp) {
	this.turnheadlamp = turnheadlamp;
}
public String getFrontfoglamp() {
	return frontfoglamp;
}
public void setFrontfoglamp(String frontfoglamp) {
	this.frontfoglamp = frontfoglamp;
}
public String getHeightadjustable() {
	return heightadjustable;
}
public void setHeightadjustable(String heightadjustable) {
	this.heightadjustable = heightadjustable;
}
public String getCleaningdevice() {
	return cleaningdevice;
}
public void setCleaningdevice(String cleaningdevice) {
	this.cleaningdevice = cleaningdevice;
}
public String getInteriorlight() {
	return interiorlight;
}
public void setInteriorlight(String interiorlight) {
	this.interiorlight = interiorlight;
}
public String getPowerwindow() {
	return powerwindow;
}
public void setPowerwindow(String powerwindow) {
	this.powerwindow = powerwindow;
}
public String getWindowkeylift() {
	return windowkeylift;
}
public void setWindowkeylift(String windowkeylift) {
	this.windowkeylift = windowkeylift;
}
public String getClampholder() {
	return clampholder;
}
public void setClampholder(String clampholder) {
	this.clampholder = clampholder;
}
public String getInsulatingglass() {
	return insulatingglass;
}
public void setInsulatingglass(String insulatingglass) {
	this.insulatingglass = insulatingglass;
}
public String getRearviewmirrorelectric() {
	return rearviewmirrorelectric;
}
public void setRearviewmirrorelectric(String rearviewmirrorelectric) {
	this.rearviewmirrorelectric = rearviewmirrorelectric;
}
public String getRearviewmirrorheat() {
	return rearviewmirrorheat;
}
public void setRearviewmirrorheat(String rearviewmirrorheat) {
	this.rearviewmirrorheat = rearviewmirrorheat;
}
public String getAutomaticantiglare() {
	return automaticantiglare;
}
public void setAutomaticantiglare(String automaticantiglare) {
	this.automaticantiglare = automaticantiglare;
}
public String getMediumvehicle() {
	return mediumvehicle;
}
public void setMediumvehicle(String mediumvehicle) {
	this.mediumvehicle = mediumvehicle;
}
public String getPowerfolding() {
	return powerfolding;
}
public void setPowerfolding(String powerfolding) {
	this.powerfolding = powerfolding;
}
public String getMirrormemory() {
	return mirrormemory;
}
public void setMirrormemory(String mirrormemory) {
	this.mirrormemory = mirrormemory;
}
public String getSuncurtain() {
	return suncurtain;
}
public void setSuncurtain(String suncurtain) {
	this.suncurtain = suncurtain;
}
public String getRearsideshade() {
	return rearsideshade;
}
public void setRearsideshade(String rearsideshade) {
	this.rearsideshade = rearsideshade;
}
public String getPrivacyglass() {
	return privacyglass;
}
public void setPrivacyglass(String privacyglass) {
	this.privacyglass = privacyglass;
}
public String getShadingmirror() {
	return shadingmirror;
}
public void setShadingmirror(String shadingmirror) {
	this.shadingmirror = shadingmirror;
}
public String getRearwiper() {
	return rearwiper;
}
public void setRearwiper(String rearwiper) {
	this.rearwiper = rearwiper;
}
public String getInductionwiper() {
	return inductionwiper;
}
public void setInductionwiper(String inductionwiper) {
	this.inductionwiper = inductionwiper;
}
public String getControlmode() {
	return controlmode;
}
public void setControlmode(String controlmode) {
	this.controlmode = controlmode;
}
public String getAirconditioning() {
	return airconditioning;
}
public void setAirconditioning(String airconditioning) {
	this.airconditioning = airconditioning;
}
public String getAiroutlet() {
	return airoutlet;
}
public void setAiroutlet(String airoutlet) {
	this.airoutlet = airoutlet;
}
public String getZoncontrol() {
	return zoncontrol;
}
public void setZoncontrol(String zoncontrol) {
	this.zoncontrol = zoncontrol;
}
public String getPollenfiltration() {
	return pollenfiltration;
}
public void setPollenfiltration(String pollenfiltration) {
	this.pollenfiltration = pollenfiltration;
}
public String getCarrefrigerator() {
	return carrefrigerator;
}
public void setCarrefrigerator(String carrefrigerator) {
	this.carrefrigerator = carrefrigerator;
}
public String getInteriorcolor() {
	return interiorcolor;
}
public void setInteriorcolor(String interiorcolor) {
	this.interiorcolor = interiorcolor;
}
public String getcType_Gearbox() {
	return cType_Gearbox;
}
public void setcType_Gearbox(String cType_Gearbox) {
	this.cType_Gearbox = cType_Gearbox;
}
public int getcGear_Number() {
	return cGear_Number;
}
public void setcGear_Number(int cGear_Number) {
	this.cGear_Number = cGear_Number;
}
public String getcCombustion_Form() {
	return cCombustion_Form;
}
public void setcCombustion_Form(String cCombustion_Form) {
	this.cCombustion_Form = cCombustion_Form;
}
public String getcFuel_Number() {
	return cFuel_Number;
}
public void setcFuel_Number(String cFuel_Number) {
	this.cFuel_Number = cFuel_Number;
}
public String getcOil_Supply_Way() {
	return cOil_Supply_Way;
}
public void setcOil_Supply_Way(String cOil_Supply_Way) {
	this.cOil_Supply_Way = cOil_Supply_Way;
}
public String getcTime_Market() {
	return cTime_Market;
}
public void setcTime_Market(String cTime_Market) {
	this.cTime_Market = cTime_Market;
}
public String getcTransmission() {
	return cTransmission;
}
public void setcTransmission(String cTransmission) {
	this.cTransmission = cTransmission;
}
public String getcColor() {
	return cColor;
}
public void setcColor(String cColor) {
	this.cColor = cColor;
}
public String getcWheelbase() {
	return cWheelbase;
}
public void setcWheelbase(String cWheelbase) {
	this.cWheelbase = cWheelbase;
}
public String getcTank_Volume() {
	return cTank_Volume;
}
public void setcTank_Volume(String cTank_Volume) {
	this.cTank_Volume = cTank_Volume;
}
public String getcLuggage_Space() {
	return cLuggage_Space;
}
public void setcLuggage_Space(String cLuggage_Space) {
	this.cLuggage_Space = cLuggage_Space;
}
public String getcStructure() {
	return cStructure;
}
public void setcStructure(String cStructure) {
	this.cStructure = cStructure;
}
public int getcMax_Speed() {
	return cMax_Speed;
}
public void setcMax_Speed(int cMax_Speed) {
	this.cMax_Speed = cMax_Speed;
}
public String getcVehicle_warranty() {
	return cVehicle_warranty;
}
public void setcVehicle_warranty(String cVehicle_warranty) {
	this.cVehicle_warranty = cVehicle_warranty;
}
public String getcAir_Intake() {
	return cAir_Intake;
}
public void setcAir_Intake(String cAir_Intake) {
	this.cAir_Intake = cAir_Intake;
}
public int getcNumber_Cylinders() {
	return cNumber_Cylinders;
}
public void setcNumber_Cylinders(int cNumber_Cylinders) {
	this.cNumber_Cylinders = cNumber_Cylinders;
}
public String getcMaximum_Horsepower() {
	return cMaximum_Horsepower;
}
public void setcMaximum_Horsepower(String cMaximum_Horsepower) {
	this.cMaximum_Horsepower = cMaximum_Horsepower;
}
public String getcMost_Powerful() {
	return cMost_Powerful;
}
public void setcMost_Powerful(String cMost_Powerful) {
	this.cMost_Powerful = cMost_Powerful;
}
public String getcMaximum_Torque() {
	return cMaximum_Torque;
}
public void setcMaximum_Torque(String cMaximum_Torque) {
	this.cMaximum_Torque = cMaximum_Torque;
}
public String getcMaximum_Torque_Speed() {
	return cMaximum_Torque_Speed;
}
public void setcMaximum_Torque_Speed(String cMaximum_Torque_Speed) {
	this.cMaximum_Torque_Speed = cMaximum_Torque_Speed;
}
public String getcPrice() {
	return cPrice;
}
public void setcPrice(String cPrice) {
	this.cPrice = cPrice;
}


public int gettId() {
	return tId;
}
public void settId(int tId) {
	this.tId = tId;
}
public String getcName() {
	return cName;
}
public void setcName(String cName) {
	this.cName = cName;
}
public String getCtype() {
	return ctype;
}
public void setCtype(String ctype) {
	this.ctype = ctype;
}
public String getcVolume() {
	return cVolume;
}
public void setcVolume(String cVolume) {
	this.cVolume = cVolume;
}
public String getcEngine() {
	return cEngine;
}
public void setcEngine(String cEngine) {
	this.cEngine = cEngine;
}
public String getcOil() {
	return cOil;
}
public void setcOil(String cOil) {
	this.cOil = cOil;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}




}
