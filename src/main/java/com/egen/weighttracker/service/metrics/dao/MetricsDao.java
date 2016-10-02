package com.egen.weighttracker.service.metrics.dao;

import java.util.List;

import com.egen.weighttracker.service.metrics.model.Metrics;

public interface MetricsDao {
	public void create(Metrics metrics);
	public List<Metrics> read();
	public List<Metrics> readByTimeRange(long fromTimeStamp, long toTimeStamp);
}
