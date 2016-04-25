package com.dhiraj.hibe;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HQLEx {
	
public static void join(Session session){
	
	String hql="select stk.stockName ,v.volume from Stock stk inner join stk.stockDailyRecords v where stk.stockId=25";
	Query query=session.createQuery(hql);
	List<Object[]> list= query.list();
	System.out.println(list.size());
	for (Object[] objects : list) {
		System.out.println("Objects:"+objects.getClass().getSimpleName());
		for (Object object : objects) {
			System.out.println(object);
		}
	}
}
public static void update(Session session){
	String hql="update StockDailyRecord stdr set volume=:vol where stdr.stock.stockId=:stkid";
	Query query=session.createQuery(hql);
	query.setInteger("vol", 2500);
	query.setInteger("stkid", 25);
	int modifications=query.executeUpdate();
	System.out.println(">>"+modifications);
}
}
