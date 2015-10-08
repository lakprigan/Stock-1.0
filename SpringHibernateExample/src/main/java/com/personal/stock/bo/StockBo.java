package com.personal.stock.bo;

import com.personal.stock.model.Stock;

public interface StockBo {

	void save(Stock stock);

	void update(Stock stock);

	void delete(Stock stock);

	Stock findByStockCode(String stockCode);
}