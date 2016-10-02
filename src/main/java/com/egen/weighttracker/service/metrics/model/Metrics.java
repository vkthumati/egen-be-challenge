package com.egen.weighttracker.service.metrics.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"timeStamp","value"})
@XmlRootElement(name = "metrics")
public class Metrics {
	@XmlElement(name = "timeStamp", required = true)
	private long timeStamp;
	
	@XmlElement(name = "value", required = true)
	private int value;
	
	public Metrics(long timeStamp, int weight){
		this.timeStamp = timeStamp;
		this.value = weight;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (timeStamp ^ (timeStamp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Metrics metrics = (Metrics) obj;
		if (timeStamp != metrics.timeStamp)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		 return "Metrics [timeStamp=" + timeStamp + ", value=" + value + "]";
	}

}
