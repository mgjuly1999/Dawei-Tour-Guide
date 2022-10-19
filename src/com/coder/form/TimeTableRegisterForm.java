package com.coder.form;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

import com.coder.model.Type;
import com.coder.model.Shop;
import com.coder.model.TimeTable;
public class TimeTableRegisterForm {
	
	private TimeTableForm timeTableForm=null;
	private TimeTable timeTable;
	private List<TimeTable> timeTables;
	private Map<String,String> mapDays=new HashedMap<String,String>();
	public TimeTableForm getTimeTableForm() {
		return timeTableForm;
	}
	public void setTimeTableForm(TimeTableForm timeTableForm) {
		this.timeTableForm = timeTableForm;
	}
	public TimeTable getTimeTable() {
		return timeTable;
	}
	public Map<String, String> getMapDays() {
		return mapDays;
	}
	public void setMapDays(Map<String, String> mapDays) {
		this.mapDays = mapDays;
	}
	public void setTimeTable(TimeTable timeTable) {
		this.timeTable = timeTable;
	}
	public List<TimeTable> getTimeTables() {
		return timeTables;
	}
	public void setTimeTables(List<TimeTable> timeTables) {
		this.timeTables = timeTables;
	}
}
