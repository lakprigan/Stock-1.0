package com.personal.stockowner.model;

import java.io.Serializable;

public class StockOwner implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long stockOwnerId;
	private String stockOwnerName;
	
	public Long getStockOwnerId() {
		return stockOwnerId;
	}

	public void setStockOwnerId(Long stockOwnerId) {
		this.stockOwnerId = stockOwnerId;
	}

	public String getStockOwnerName() {
		return stockOwnerName;
	}

	public void setStockOwnerName(String stockOwnerName) {
		this.stockOwnerName = stockOwnerName;
	}
	}
