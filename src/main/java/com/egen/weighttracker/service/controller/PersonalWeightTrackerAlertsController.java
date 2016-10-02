package com.egen.weighttracker.service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name="/alerts")
public class PersonalWeightTrackerAlertsController {
	
	//read – reads all alerts that are stored in the database
	public ResponseEntity<Void> read(){
		return null;
	}
	
	//readByTimeRange – reads all alerts that are created between the given two timestamps
	public ResponseEntity<Void> readByTimeRange() {
		return null;
	}

}
