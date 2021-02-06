package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public void addSillyMember() {
		System.out.println(getClass() + ": Doing stuff : add a membership account");
	}
	
	public void goTosleep() {
		System.out.println("go to sleep");
	}

}
