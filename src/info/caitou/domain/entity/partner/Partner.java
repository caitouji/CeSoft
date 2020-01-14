package info.caitou.domain.entity.partner;

import org.springframework.stereotype.Component;

@Component
public class Partner {
	private String partnerCode;// 医院编号
	private String legalPersons;// 法人
	private String partnerName;// 医院名称
	private String area;// 地区
	private String partnerLevel;// 医院等级
	private String address;// 地址
	private String detailInfo;// 详细信息
	private String province; // 省份
	private String manager; // 负责人
	private String phoneNumber;// 电话
	private String fax;
	private String partnerType;// 单位类型
	private String bankName;// 开户行
	private String bankNumber;// 银行账号
	private String taxNuber;// 税号
	private String contact;// 联系人
	private String telphone;// 联系电话

	public String getPartnerCode() {
		return partnerCode;
	}

	public void setPartnerCode(String partnerCode) {
		this.partnerCode = partnerCode;
	}

	public String getLegalPersons() {
		return legalPersons;
	}

	public void setLegalPersons(String legalPersons) {
		this.legalPersons = legalPersons;
	}

	public String getPartnerName() {
		return partnerName;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPartnerLevel() {
		return partnerLevel;
	}

	public void setPartnerLevel(String partnerLevel) {
		this.partnerLevel = partnerLevel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDetailInfo() {
		return detailInfo;
	}

	public void setDetailInfo(String detailInfo) {
		this.detailInfo = detailInfo;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getPartnerType() {
		return partnerType;
	}

	public void setPartnerType(String partnerType) {
		this.partnerType = partnerType;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankNumber() {
		return bankNumber;
	}

	public void setBankNumber(String bankNumber) {
		this.bankNumber = bankNumber;
	}

	public String getTaxNuber() {
		return taxNuber;
	}

	public void setTaxNuber(String taxNuber) {
		this.taxNuber = taxNuber;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	@Override
	public String toString() {
		return "Partner [partnerCode=" + partnerCode + ", legalPersons=" + legalPersons + ", partnerName=" + partnerName
				+ ", area=" + area + ", partnerLevel=" + partnerLevel + ", address=" + address + ", detailInfo="
				+ detailInfo + ", province=" + province + ", manager=" + manager + ", phoneNumber=" + phoneNumber
				+ ", fax=" + fax + ", partnerType=" + partnerType + ", bankName=" + bankName + ", bankNumber="
				+ bankNumber + ", taxNuber=" + taxNuber + ", contact=" + contact + ", telphone=" + telphone + "]";
	}

}
