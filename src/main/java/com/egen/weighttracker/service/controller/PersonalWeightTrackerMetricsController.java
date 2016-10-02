package com.egen.weighttracker.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.egen.weighttracker.service.metrics.bussiness.MetricsService;
import com.egen.weighttracker.service.metrics.model.Metrics;

@RestController
@RequestMapping(value="/metrics")
public class PersonalWeightTrackerMetricsController {
	
	@Autowired
	private MetricsService metricsService;

	/**
	 *create – this is the API that will consume data from the sensor emulator 
	 * @return
	 */
	@RequestMapping(value="/create", method=RequestMethod.POST, consumes={MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}, produces={MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Void> create(@RequestBody Metrics metrics, UriComponentsBuilder ucBuilder){
		metricsService.create(metrics);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/create/{timeStamp}").buildAndExpand(metrics.getTimeStamp()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
	/**
	 * read – reads all the metrics stored in your database
	 * @return
	 */
	@RequestMapping(value="/read", method=RequestMethod.GET, consumes={MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}, produces={MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<Metrics>> read(){
		List<Metrics> read = metricsService.read();
		return new ResponseEntity<List<Metrics>>(read, HttpStatus.OK);
	}
	
	/**
	 * readByTimeRange – reads all the metrics that were created between the given two timestamps
	 * @return
	 */
	@RequestMapping(value="/readByTimeRange", method=RequestMethod.GET, consumes={MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}, produces={MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<Metrics>> readByTimeRange(@RequestParam(name="fromTimeStamp") long fromTimeStamp, @RequestParam(name="toTimeStamp") long toTimeStamp) {
		List<Metrics> readByTimeRange = metricsService.readByTimeRange(fromTimeStamp, toTimeStamp);
		return new ResponseEntity<List<Metrics>>(readByTimeRange, HttpStatus.OK);
	}

}
