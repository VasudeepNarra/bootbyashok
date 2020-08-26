package com.tekleads.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "contact")
public class Contact {

	private Integer contactId;
	private String contactName;
	private Long contactNumber;
	private String gender;

	public Contact() {

	}

	public Contact(Integer contactId, String contactName, Long contactNumber, String gender) {
		this.contactId = contactId;
		this.contactName = contactName;
		this.contactNumber = contactNumber;
		this.gender = gender;
	}

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", contactName=" + contactName + ", contactNumber=" + contactNumber
				+ ", gender=" + gender + "]";
	}

}
