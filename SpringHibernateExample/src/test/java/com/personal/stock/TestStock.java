package com.personal.stock;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.personal.stock.bo.StockBo;
import com.personal.stock.model.Stock;

/*Author@LP on 7th Oct 2015
 * Test class for Stock
 */
public class TestStock {
	public static void main( String[] args )
    {
    	ApplicationContext appContext = 
    	  new ClassPathXmlApplicationContext("config/BeanLocations.xml");
	
    	StockBo stockBo = (StockBo)appContext.getBean("stockBo");
    	
    	/** insert **/
    	Stock stock = new Stock();
    	stock.setStockCode("1");
    	stock.setStockName("Mac");
    	stockBo.save(stock);
    	
    	/** select **/
    	Stock stock2 = stockBo.findByStockCode("1");
    	System.out.println(stock2);
    	
    	/** update **/
    	stock2.setStockName("Mac");
    	stockBo.update(stock2);
    	
    	/** delete **/
    	stockBo.delete(stock2);
    	
    	System.out.println("Done");
    }
}
