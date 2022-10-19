package com.coder.service;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.coder.dao.DayDao;
import com.coder.dao.ShopDao;
import com.coder.dao.TimeTableDao;


import com.coder.form.TimeTableForm;
import com.coder.form.TimeTableRegisterForm;

import com.coder.model.Day;
import com.coder.model.Shop;
import com.coder.model.TimeTable;
import com.coder.model.TimeTableId;
import com.coder.model.Type;
import com.coder.util.DateFormat;

@Service
@Repository("timeTableRegisterServic")
public class TimeTableRegisterServic {
	@Autowired
	private DayDao dayDao;
	@Autowired
	private ShopDao shopDao;
	@Autowired
	private TimeTableDao timeTableDao;
	public void prepareTimeTableRegister(TimeTableRegisterForm myFrom)
	{
		if(myFrom.getTimeTableForm()!=null)
		{
			this.TimeTableRegister(myFrom);
		}
	myFrom.setTimeTables(timeTableDao.getTimeTables());
	
	List<Day> days=this.dayDao.getDays();
	for( Day s:days){
	myFrom.getMapDays().put(""+s.getDayId(),s.getDayName());
	}
	
	}
	public void TimeTableRegister(TimeTableRegisterForm myFrom)
	{   
		TimeTable timeTable=new TimeTable();
		TimeTableForm	timeTableForm=myFrom.getTimeTableForm();
        Shop shop=this.shopDao.criteriaQuerryGetObjectById(1,"shopId");
        Day day=this.dayDao.criteriaQuerryGetObjectById(timeTableForm.getDayId(),"dayId");
	
	timeTable.setStartTime(DateFormat.stringToTime(timeTableForm.getStartTime()));
	timeTable.setEndTime(DateFormat.stringToTime(timeTableForm.getEndTime()));
	
	TimeTableId timeTableId=new TimeTableId();
	timeTableId.setDayId(day.getDayId());
	timeTableId.setShopId(shop.getShopId());
	timeTable.setId(timeTableId);
	
	timeTableDao.saveTimeTable(timeTable);
		
	}
}
