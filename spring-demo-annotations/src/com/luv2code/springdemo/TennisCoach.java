package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("inside constructor");
	}
	
	@PostConstruct
	public void doMyStartupStuffy() {
		System.out.println("inside my startup stuff");
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("inside my cleanup stuff");
	}
	
	
	/* Constructor Injection
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/
	
	/* method injection 
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println("inside CrazyStuff!");
		fortuneService = theFortuneService;
	}
	*/

	@Override
	public String getDailyWorkout() {
		return "practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	

}
