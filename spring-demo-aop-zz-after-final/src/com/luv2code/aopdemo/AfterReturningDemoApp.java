package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class AfterReturningDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		List<Account> theAccounts = theAccountDAO.findAccounts();
		
		System.out.println("\n\n Main Program:After Returning Demo App");
		
		System.out.println(theAccounts);
		
		
		context.close();

	}

}
