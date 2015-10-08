package com.personal.stockowner.bo.impl;

import com.personal.stockowner.bo.StockOwnerBo;
import com.personal.stockowner.dao.StockOwnerDao;
import com.personal.stockowner.model.StockOwner;

public class StockOwnerBoImpl implements StockOwnerBo {
	StockOwnerDao stockOwnerDao;
	
	public void setStockOwnerDao(StockOwnerDao stockOwnerDao) {
		this.stockOwnerDao = stockOwnerDao;
	}

	public void save(StockOwner stockOwner) {
		stockOwnerDao.save(stockOwner);
	}

	public void update(StockOwner stockOwner) {
		stockOwnerDao.update(stockOwner);
	}

	public void delete(StockOwner stockOwner) {
		stockOwnerDao.delete(stockOwner);
	}

	public StockOwner findByStockOwnerName(String stockOwnerName) {
		return stockOwnerDao.findByStockOwnerName(stockOwnerName);
	}

}
