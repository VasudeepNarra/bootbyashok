package com.tekleads.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

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
	@GenericGenerator(
			strategy="com.tekleads.generators.ContactIdGenerator",
			name="cid_gen"
	)
	@GeneratedValue(generator="cid_gen")
	private String contactId;

	@Column(name = "C_NAME")
	private String contactName;

	@Column(name = "C_NUM")
	private Long contactNum;

}
