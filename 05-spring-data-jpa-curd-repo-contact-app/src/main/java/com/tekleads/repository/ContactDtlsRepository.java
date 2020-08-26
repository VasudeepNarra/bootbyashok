package com.tekleads.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tekleads.entity.ContactDtlsEntity;

public interface ContactDtlsRepository extends CrudRepository<ContactDtlsEntity, Integer> {

	public List<ContactDtlsEntity> findTop3ByContactName(String name);

	public List<ContactDtlsEntity> findByContactName(String name);

	@Query(value = "from ContactDtlsEntity ORDER BY contactName asc")
	public List<ContactDtlsEntity> findAllContacts();

	@Query(value = "from ContactDtlsEntity where contactName=:txt ORDER BY contactName asc")
	public List<ContactDtlsEntity> findAllContactsByName(String txt);
	public ContactDtlsEntity findByContactNameAndContactId(String name, Integer cid);

}
