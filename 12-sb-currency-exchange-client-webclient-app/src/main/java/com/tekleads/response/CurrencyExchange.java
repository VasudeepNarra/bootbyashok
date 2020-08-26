package com.tekleads.response;

public class CurrencyExchange {

	private Integer currencyId;
	private String currencyFrom;
	private String currencyTo;
	private Double currencyValue;

	public Integer getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}

	public String getCurrencyFrom() {
		return currencyFrom;
	}

	public void setCurrencyFrom(String currencyFrom) {
		this.currencyFrom = currencyFrom;
	}

	public String getCurrencyTo() {
		return currencyTo;
	}

	public void setCurrencyTo(String currencyTo) {
		this.currencyTo = currencyTo;
	}

	public Double getCurrencyValue() {
		return currencyValue;
	}

	public void setCurrencyValue(Double currencyValue) {
		this.currencyValue = currencyValue;
	}

	@Override
	public String toString() {
		return "CurrencyExchange [currencyId=" + currencyId + ", currencyFrom=" + currencyFrom + ", currencyTo="
				+ currencyTo + ", currencyValue=" + currencyValue + "]";
	}

}
