package com.rx.spring5;

public class TrackCoach implements Coach {
	
	private AdviseService adviseService;
	
	
	
	public TrackCoach(AdviseService adviseService) {
		super();
		this.adviseService = adviseService;
	}

	@Override
	public String getDailyWorkout() {
		return "run a hard 5k";
	}

	@Override
	public String getDailyAdvise() {
		// TODO Auto-generated method stub
		return "track coach says: " + adviseService.getAdvise();
	}

}
