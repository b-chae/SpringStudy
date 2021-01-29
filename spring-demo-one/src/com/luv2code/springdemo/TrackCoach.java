package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "run Track for 30 mintes";
	}

	@Override
	public String getDailyFortune() {
		return "Just do It : " + fortuneService.getFortune();
	}
	
	public void doMyStartupStuff() {
		System.out.println("TrackCOach : inside custom init method");
	}
	
	public void doMyCleanupStuff() {
		System.out.println("TrackCOach : inside custom destroy method");
	}

}
