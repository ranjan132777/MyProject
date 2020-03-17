package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "WHUSERTYPETAB")
public class WhUserType {
	@Id
	@GeneratedValue
	@Column(name = "uid")
	private Integer userId;
	@Column(name = "utype")

	private String userType;
	@Column(name = "ucode")
	private Integer userCode;
	@Column(name = "ufor")
	private String userFor;
	@Column(name = "uemail")
	private String userEmail;
	@Column(name = "ucontact")
	private Long userContact;
	@Column(name = "uidtype")
	private String userIdType;
	@Column(name = "ifother")
	private String ifOther;
	@Column(name = "idnumber")
	private Long idNumber;

	public WhUserType(Integer id) {
		super();
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Integer getUserCode() {
		return userCode;
	}

	public void setUserCode(Integer userCode) {
		this.userCode = userCode;
	}

	public String getUserFor() {
		return userFor;
	}

	public void setUserFor(String userFor) {
		this.userFor = userFor;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Long getUserContact() {
		return userContact;
	}

	public void setUserContact(Long userContact) {
		this.userContact = userContact;
	}

	public String getUserIdType() {
		return userIdType;
	}

	public void setUserIdType(String userIdType) {
		this.userIdType = userIdType;
	}

	public String getIfOther() {
		return ifOther;
	}

	public void setIfOther(String ifOther) {
		this.ifOther = ifOther;
	}

	public Long getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(Long idNumber) {
		this.idNumber = idNumber;
	}

	@Override
	public String toString() {
		return "WHUserType [userType=" + userType + ", userCode=" + userCode + ", userFor=" + userFor + ", userEmail="
				+ userEmail + ", userContact=" + userContact + ", userIdType=" + userIdType + ", ifOther=" + ifOther
				+ ", idNumber=" + idNumber + "]";
	}

}
