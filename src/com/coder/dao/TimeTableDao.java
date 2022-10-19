package com.coder.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.coder.model.Admin;
import com.coder.model.TimeTable;
import com.coder.model.User;



@Repository("timeTableDoa")
public class TimeTableDao extends AbstractDao<Integer,TimeTable>{
	
	public Object saveTimeTable(TimeTable timeTable)
	{
	return (Object)super.persist(timeTable);

		}

	public List<TimeTable> getTimeTables() {
		List<TimeTable> timeTables=(List<TimeTable>)super.criteriaQuerry();
		return timeTables;
	}



}
