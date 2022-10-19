package com.coder.form;

import com.coder.model.TimeTableId;

public class TimeTableForm {
	private Integer dayId;
	private String dayName;
	private TimeTableId id;
	private String startTime;
	private String endTime;
	public Integer getDayId() {
		return dayId;
	}
	public void setDayId(Integer dayId) {
		this.dayId = dayId;
	}
	public String getDayName() {
		return dayName;
	}
	public void setDayName(String dayName) {
		this.dayName = dayName;
	}
	public TimeTableId getId() {
		return id;
	}
	public void setId(TimeTableId id) {
		this.id = id;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
}
