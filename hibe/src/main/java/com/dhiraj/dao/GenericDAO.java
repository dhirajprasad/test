package com.dhiraj.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dhiraj.hibe.HibernateUtil;



public class GenericDAO {

	private SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
    @SuppressWarnings("unchecked")
	 public <T> T save(final T o){
		Session session=sessionFactory.openSession();
    	session.beginTransaction();
    	T obj = (T) session.save(o);
    	session.getTransaction().commit();
    	session.close();
      return (T)obj ;
    }
}
