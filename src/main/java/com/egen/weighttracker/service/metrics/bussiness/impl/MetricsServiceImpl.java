package com.egen.weighttracker.service.metrics.bussiness.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egen.weighttracker.service.metrics.bussiness.MetricsService;
import com.egen.weighttracker.service.metrics.dao.MetricsDao;
import com.egen.weighttracker.service.metrics.model.Metrics;

@Service
public class MetricsServiceImpl implements MetricsService {

	@Autowired
	private MetricsDao metricsDao;
	
	@Override
	public void create(Metrics metrics) {
		metricsDao.create(metrics);
	}
	
	@Override
	public List<Metrics> read() {
		return metricsDao.read();
	}
	
	@Override
	public List<Metrics> readByTimeRange(long fromTimeStamp, long toTimeStamp) {
		return metricsDao.readByTimeRange(fromTimeStamp, toTimeStamp);
	}
	
}
