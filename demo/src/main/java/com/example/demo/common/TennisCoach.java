package com.example.demo.common;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {
	
	public TennisCoach() {
		System.out.println("In constructor: " + getClass().getSimpleName());	
	} 
	
	//define our init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
	}
	
	//define our destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("In doMyCleanupStuff(): " + getClass().getSimpleName());
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do 15 min backhand practice";
	}
}
