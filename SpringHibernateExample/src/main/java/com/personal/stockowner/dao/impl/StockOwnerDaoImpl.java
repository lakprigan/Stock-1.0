package com.personal.stockowner.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.personal.stock.model.Stock;
import com.personal.stockowner.dao.StockOwnerDao;
import com.personal.stockowner.model.StockOwner;

public class StockOwnerDaoImpl extends HibernateDaoSupport implements
		StockOwnerDao {

	public void save(StockOwner stockOwner) {
         getHibernateTemplate().save(stockOwner);		
	}

	public void update(StockOwner stockOwner) {
		getHibernateTemplate().update(stockOwner);
	}

	public void delete(StockOwner stockOwner) {
		getHibernateTemplate().delete(stockOwner);	
	}

	public StockOwner findByStockOwnerName(String stockOwnerName) {
		List list = getHibernateTemplate().find(
                "from Stockowner where stockowner_name=?",stockOwnerName
          );
	return (StockOwner)list.get(0);
	}


}
