package com.tekleads.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CONTACT_DTLS")
public class ContactDtlsEntity {

	@Id
	@Column(name = "C_ID")
	private Integer contactId;

	@Column(name = "C_NAME")
	private String contactName;

	@Column(name = "C_NUM")
	private Long contactNum;

}
