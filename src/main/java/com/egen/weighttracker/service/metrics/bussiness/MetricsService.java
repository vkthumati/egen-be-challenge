package com.egen.weighttracker.service.metrics.bussiness;

import java.util.List;

import com.egen.weighttracker.service.metrics.model.Metrics;

public interface MetricsService {
	public void create(Metrics metrics);
	public List<Metrics> read();
	public List<Metrics> readByTimeRange(long fromTimeStamp, long toTimeStamp);
}
