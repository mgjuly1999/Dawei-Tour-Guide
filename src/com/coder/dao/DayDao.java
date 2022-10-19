package com.coder.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.coder.model.Admin;
import com.coder.model.Day;
import com.coder.model.User;



@Repository("dayDoa")
public class DayDao extends AbstractDao<Integer,Day>{
	
	public Day saveDay(Day day)
	{
	return (Day)super.persist(day);

		}

public void   updateDay(Day day)
{
super.merge(day);

}
public Day getDayById(int id,String strId){
	Day day=super.criteriaQuerryGetObjectById(id, strId);
	return day;
	}

public List<Day> getDays() {
List<Day> Days=(List<Day>)super.criteriaQuerry();
	return Days;
}
}
