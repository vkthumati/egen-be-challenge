package com.egen.weighttracker.service.metrics.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.egen.weighttracker.service.metrics.dao.MetricsDao;
import com.egen.weighttracker.service.metrics.model.Metrics;

@Repository
public class MetricsDaoImpl implements MetricsDao{
	public MetricsDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void create(Metrics metrics) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<Metrics> read() {
		List<Metrics> metricsList = new ArrayList<Metrics>();
		metricsList.add(new Metrics(new Date().getTime(), 161));
		metricsList.add(new Metrics(new Date().getTime(), 162));
		metricsList.add(new Metrics(new Date().getTime(), 163));
		metricsList.add(new Metrics(new Date().getTime(), 164));
		metricsList.add(new Metrics(new Date().getTime(), 165));
		metricsList.add(new Metrics(new Date().getTime(), 166));
		metricsList.add(new Metrics(new Date().getTime(), 167));
		metricsList.add(new Metrics(new Date().getTime(), 168));
		
		return metricsList;
	}
	
	@Override
	public List<Metrics> readByTimeRange(long fromTimeStamp, long toTimeStamp) {
		// TODO Auto-generated method stub
		return null;
	}
}
