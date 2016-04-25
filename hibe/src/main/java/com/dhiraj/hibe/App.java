package com.dhiraj.hibe;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

import org.hibernate.Query;
import org.hibernate.Session;

import com.dhiraj.dao.GenericDAO;
import com.dhiraj.entity.Course;
import com.dhiraj.entity.Stock;
class Over{
	static void  m(){
		System.out.println("sdf");
	}
	static void m(int x){
		System.out.println(x);
	}
}


class One{
	Number m(int a,int b){
	return null;	
	}
}
class Two extends One{
	Float m(int a,int b){
		Two t= new Two();
		if ( t instanceof One) {
			System.out.println("ter");  ;
			
		}
		return null;
	}
}


public class App 
{
    public static void main( String[] args )
    {
    	MyList myList = new MyList();
    	myList.add(2);
    	myList.add(3);
    	myList.add(312);
    	System.out.println(myList);
    	Over ov= new Over();
    	Over.m();
    	Over.m(3);
    	 System.out.println("Hibernate one to many (Annotation)");
    		Session session = HibernateUtil.getSessionFactory().openSession();
    		session.beginTransaction();
    			Stock stock = new Stock("7092","ST8sd2s3");
    			GenericDAO dao=new GenericDAO();
    			dao.save(stock);
//    			session.save(stock);
//    	        StockDailyRecord stockDailyRecords = new StockDailyRecord();
//    	        stockDailyRecords.setPriceChange(new Float("10.0"));
//    	        stockDailyRecords.setVolume(400000L);
//    	        stockDailyRecords.setDate(Calendar.getInstance().getTime());
//    	        session.save(stockDailyRecords);
//    	        stockDailyRecords.setStock(stock); 
    	        
//    	        StockDailyRecord dailyRecord=new StockDailyRecord(stock,1123.0f, 5245l, Calendar.getInstance().getTime());
    	        
//    	        Set<StockDailyRecord> dailyRecords=  new HashSet<StockDailyRecord>();
//    	        dailyRecords.add(stockDailyRecords);
//    	        dailyRecords.add(dailyRecord);
    	        
//    	        stock.setStockDailyRecords(dailyRecords);
//    	        stock.getStockDailyRecords().add(stockDailyRecords);
//    	        session.save(stockDailyRecords);
//    	        session.save(stock);
//    	        dailyRecord.setStock(new Stock("7064","ST25"));
//    	        StockDailyRecord dailyRecord1=new StockDailyRecord(stock,11.0f, 52l, Calendar.getInstance().getTime());
//    	        dailyRecords.add(dailyRecord1);
//    	        stock.setStockDailyRecords(dailyRecords);
//    	        StockDailyRecord st=(StockDailyRecord)session.load(StockDailyRecord.class, 1);
//    	        System.out.println(st.getVolume());
    		
    		//cache 
    		Course cr=(Course)session.load(Course.class, 1);
    		System.out.println(cr.getCoursename());
    		session.getTransaction().commit();
    		session.close();
    		Session session1 = HibernateUtil.getSessionFactory().openSession();
    		session1.beginTransaction();
    		Course cr1=(Course)session1.load(Course.class, 1);
    		System.out.println("session1"+cr1.getCoursename());
    		HQLEx.join(session1);
    		HQLEx.update(session1);
    		session1.getTransaction().commit();
    		session1.close();
//    		course(session);
    		System.out.println("Done");
    		
//    		collectio();
    }
    
    static void course(Session session){
    	session.beginTransaction();
//    	Student st=new Student();
//    	st.setSname("vinod");
//    	Course crs=new Course();
//    	crs.setCoursename("C");
//    	crs.setFee(120f);
//    	crs.getStudent().add(st);
//    	session.save(crs);
//    	Course crs1=new Course();
//    	crs.setCoursename("JAV");
//    	crs1.setFee(120f);
    	Query query=session.createQuery("update ");
    	Stock c=(Stock)session.load(Stock.class,25);
    	session.getTransaction().commit();
    	
    	
    }
    
    static Integer i = new Integer(2);
  static  void collectio(){
	  class one{
		  
	  }
    	Set<Integer> intset=new HashSet<Integer>();
    	intset.add(new Integer(45));
    	intset.add(1);
    	intset.add(2);
    	intset.add(3);
    	intset.add(i);
    	TreeSet<Object> tset=new TreeSet<Object>();
    	tset.add(new one());
    	System.out.println(intset);
    	LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<Integer>(intset);
    	LinkedList<Integer> list=new LinkedList<Integer>(linkedHashSet);
//    	System.out.println(list);
    }
  
}
