/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.how2java.pojo;


import java.util.Date;

/**
 * drugimformationEntity
 * @author 高子恒
 * @version 2019-08-16
 */


public class Producer {
    private String id; //产商编号
	private String producername;		// 产商名字
	private String companyaddress;		// 公司地址
	private String zipcode;		// 邮政编码
	private String factoryaddress;		// 工厂地址
	private String factoryname;		// 工厂名
	private String phonenumber;		// 联系电话
	private String linkman;		// 联系人
	private String lposition;		// 联系人职位
	private String website;		// 公司网站
	private String institution;		// 企业所有制
	private Date startday;		// 创立日期
	private Double registeredCapital;		// 注册资金
	private String totalStaff;		// 员工人数
	private Date cooperationTime;		// 合作时间
	private String delFlag;		// 是否废除


	public String getProducername() {
		return producername;
	}

	public void setProducername(String producername) {
		this.producername = producername;
	}

	public String getCompanyaddress() {
		return companyaddress;
	}

	public void setCompanyaddress(String companyaddress) {
		this.companyaddress = companyaddress;
	}
	

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	

	public String getFactoryaddress() {
		return factoryaddress;
	}

	public void setFactoryaddress(String factoryaddress) {
		this.factoryaddress = factoryaddress;
	}
	

	public String getFactoryname() {
		return factoryname;
	}

	public void setFactoryname(String factoryname) {
		this.factoryname = factoryname;
	}
	

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	

	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}
	

	public String getLposition() {
		return lposition;
	}

	public void setLposition(String lposition) {
		this.lposition = lposition;
	}
	

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
	

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public Date getStartday() {
		return startday;
	}

	public void setStartday(Date startday) {
		this.startday = startday;
	}
	
	public Double getRegisteredCapital() {
		return registeredCapital;
	}

	public void setRegisteredCapital(Double registeredCapital) {
		this.registeredCapital = registeredCapital;
	}
	

	public String getTotalStaff() {
		return totalStaff;
	}

	public void setTotalStaff(String totalStaff) {
		this.totalStaff = totalStaff;
	}
	

	public Date getCooperationTime() {
		return cooperationTime;
	}

	public void setCooperationTime(Date cooperationTime) {
		this.cooperationTime = cooperationTime;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	
}