package com.coder.dao;


import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.sun.xml.internal.stream.Entity;

public abstract class AbstractDao<PK extends Serializable,T> {
	@Autowired
	private SessionFactory sessionFactory;
	
	private final Class<T> persistentClass;
	
	@SuppressWarnings("unchecked")
	public AbstractDao(){
		this.persistentClass=(Class<T>)
				((ParameterizedType)this.getClass().getGenericSuperclass())
				.getActualTypeArguments()[1];
	}
	
	
	protected Session getSession(){
		return this.sessionFactory.getCurrentSession();
	}
	
	//insert
	public Object persist(T entity){
	Object object=this.getSession().save(entity);
	return object;
	}
	
	
	
	//update
	public void merge(T entity){
		
Transaction t=this.getSession().beginTransaction();
		
		this.getSession().update(entity);
	t.commit();	
	this.getSession().close();
	
	}
	
	//delete
	public void delete(T entity){
Transaction t=this.getSession().beginTransaction();
		
		this.getSession().delete(entity);
	t.commit();	
	this.getSession().close();
	}
	
	public List<T> criteriaQuerry(){
		CriteriaBuilder builder=sessionFactory.getCriteriaBuilder();
		CriteriaQuery<T> querry=builder.createQuery(persistentClass);
		Root<T> root=querry.from(persistentClass);
		querry.select(root);
		Query<T> q=getSession().createQuery(querry);
		List<T> list=q.getResultList();
		return list;
		
	}
	public T criteriaQuerryGetObjectById(int id,String strId){
		CriteriaBuilder builder=sessionFactory.getCriteriaBuilder();
		CriteriaQuery<T> querry=builder.createQuery(persistentClass);
		Root<T> root=querry.from(persistentClass);
		querry.select(root);
		querry.where(builder.equal(root.get(strId),id));
		Query<T> q=getSession().createQuery(querry);
		List<T> list=q.getResultList();
		if(list.size()==0){
		return null;
		}else{
		return list.get(0);
		}
		
	}
	
	public List < T > createQuery(String sql) {
		try (Session session=this.getSession()) {
			return session.createQuery(sql,persistentClass).list();
			}


	}
	
	public T getObjectTwoParam(String password,String strPassword,String email,String strEmail){
		CriteriaBuilder builder=sessionFactory.getCriteriaBuilder();
		CriteriaQuery<T> querry=builder.createQuery(persistentClass);
		Root<T> root=querry.from(persistentClass);
		
		querry.select(root).where(builder.and(builder.equal(root.get(strPassword),password)),(builder.equal(root.get(strEmail),email)));
		Query<T> q=getSession().createQuery(querry);
		List<T> list=q.getResultList();
		
		if(list.size()==0){
		return null;
		}else{
		return list.get(0);
		}
		
	}
	

}
