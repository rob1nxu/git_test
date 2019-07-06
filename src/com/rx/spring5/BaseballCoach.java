package com.rx.spring5;

public class BaseballCoach implements Coach {
	
	//define a private field for the dependency
	private AdviseService adviseService;
	
	//define a constructor for dependency injection
	public BaseballCoach(AdviseService theAdviseService) {
		adviseService = theAdviseService; 
	}
	
	@Override
	public String getDailyWorkout() {
		return "spend 30min on batting practise";
	}

	@Override
	public String getDailyAdvise() {
		
		//use AdviseService to get advise
		return adviseService.getAdvise();
	}

}
