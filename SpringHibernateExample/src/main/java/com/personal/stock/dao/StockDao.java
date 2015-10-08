package com.personal.stock.dao;

import com.personal.stock.model.Stock;

public interface StockDao {

	void save(Stock stock);

	void update(Stock stock);

	void delete(Stock stock);

	Stock findByStockCode(String stockCode);

}