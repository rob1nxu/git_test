package com.rx.spring5;

public class CricketCoach implements Coach {
	
	private AdviseService adviseService;
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no arg constructor");
	}
	
	//setter method for dependency injection
	public void setAdviseService(AdviseService adviseService) {
		System.out.println("CricketCoach: inside setter method");
		this.adviseService = adviseService;
	}

	@Override
	public String getDailyWorkout() {
		return "practise fast bowling for 15in";
	}

	@Override
	public String getDailyAdvise() {
		return adviseService.getAdvise();
	}

}
