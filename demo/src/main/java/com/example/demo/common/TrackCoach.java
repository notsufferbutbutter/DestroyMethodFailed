package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
	
	public TrackCoach() {
		System.out.println("In constructor: " + getClass().getSimpleName());	
	} 

	@Override
	public String getDailyWorkout() {
		return "Do hard running 5km";
	}

}
