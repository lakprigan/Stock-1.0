package com.personal.stockowner.dao;

import com.personal.stockowner.model.StockOwner;

public interface StockOwnerDao {

	void save(StockOwner stockOwner);

	void update(StockOwner stockOwner);

	void delete(StockOwner stockOwner);

	StockOwner findByStockOwnerName(String stockOwnerName);

}
