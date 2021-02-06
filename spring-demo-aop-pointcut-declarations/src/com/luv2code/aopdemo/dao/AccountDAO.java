package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {
	
	public void addAccount(Account theAccount, boolean vipFlag) {
		System.out.println(getClass() + ": Doin gmy db work : add my account");
	}
	
	public boolean doWork() {
		System.out.println("do work");
		return false;
	}

}
