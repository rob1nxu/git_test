package com.rx.spring5;

public class CoachAdviseService implements AdviseService {
	
	
	public CoachAdviseService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getAdvise() {
		return "An apple a day keeps the doctor away!";
	}

}
