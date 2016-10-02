package com.egen.weighttracker.service.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.egen.weighttracker.service.metrics.model.Metrics;

@RestController
@RequestMapping(name="/metrics")
public class PersonalWeightTrackerMetricsController {

	/**
	 *create – this is the API that will consume data from the sensor emulator 
	 * @return
	 */
	@RequestMapping(value="/create", method=RequestMethod.POST, consumes={MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}, produces={MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Void> create(@RequestBody Metrics metrics, UriComponentsBuilder ucBuilder){
		
		
		
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/create/{timeStamp}").buildAndExpand(metrics.getTimeStamp()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
	//read – reads all the metrics stored in your database
	public ResponseEntity<Void> read(){
		return null;
	}
	
	//readByTimeRange – reads all the metrics that were created between the given two timestamps
	//read – reads all the metrics stored in your database
	public ResponseEntity<Void> readByTimeRange() {
		return null;
	}

}
