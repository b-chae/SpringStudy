package com.luv2code.aopdemo.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class TrafficFortuneService {

	public String getFortune() {
		
		System.out.println(">> Service Started");
		
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(">> Service Finished");
		
		return "Except heavy traffic this morning";
	}
}
