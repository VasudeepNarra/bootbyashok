package com.tekleads.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class CmdRunnerOne implements CommandLineRunner {

	public CmdRunnerOne() {
		System.out.println("CmdRunnerOne::Constructor");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.print("CmdRunnerOne::run( ) :: ");
		System.out.println(Arrays.toString(args));
	}
}
