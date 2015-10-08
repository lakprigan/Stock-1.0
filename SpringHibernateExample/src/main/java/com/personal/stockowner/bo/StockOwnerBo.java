package com.personal.stockowner.bo;

import com.personal.stockowner.model.StockOwner;

public interface StockOwnerBo {

	void save(StockOwner stockOwner);

	void update(StockOwner stockOwner);

	void delete(StockOwner stockOwner);

	StockOwner findByStockOwnerName(String stockOwnerName);
}