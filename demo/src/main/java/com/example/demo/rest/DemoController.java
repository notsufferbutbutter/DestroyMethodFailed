package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.Coach;

@RestController
public class DemoController {
	private Coach myCoach;
	
//	private Coach anotherCoach;

	@Autowired
	public DemoController(@Qualifier("tennisCoach") Coach theCoach) {
		System.out.println("In constructor: " + getClass().getSimpleName());	
		myCoach = theCoach;
	}
	
	
	@GetMapping("/dailyworkout")
	public String getDailyWorkout() {
		return myCoach.getDailyWorkout();
	}
	
//	@GetMapping("/check")
//	public String check() {
//		return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
//	}
}
