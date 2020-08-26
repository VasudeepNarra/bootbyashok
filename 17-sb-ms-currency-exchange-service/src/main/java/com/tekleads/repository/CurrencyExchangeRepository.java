package com.tekleads.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tekleads.entity.CurrencyExchangeEntity;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchangeEntity, Serializable> {

	public CurrencyExchangeEntity findByCurrencyFromAndCurrencyTo(String from, String to);

}
