package com.tekleads;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tekleads.client.CurrencyExchangeClient;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		CurrencyExchangeClient clientBean = ctxt.getBean(CurrencyExchangeClient.class);
		// clientBean.invokeCEApiSync01("EUR", "INR");
		clientBean.invokeCEApiSync02("EUR", "INR");

		System.out.println("###################################################");

		// clientBean.invokeCEApiAsync01("EUR", "INR");
		clientBean.invokeCEApiAsync02("EUR", "INR");
	}

}
