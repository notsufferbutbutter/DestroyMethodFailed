package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach{
	
	public HockeyCoach() {
		System.out.println("In constructor: " + getClass().getSimpleName());	
	}

	@Override
	public String getDailyWorkout() {
		return "15 Minute Walk";
	}
}
