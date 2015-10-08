package com.personal.stockowner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.personal.stockowner.bo.StockOwnerBo;
import com.personal.stockowner.model.StockOwner;

/*Author@LP on 7th Oct 2015
 * Test class for Stock Owner
 */
public class TestStockOwner {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"config/BeanLocations.xml");

		StockOwnerBo stockOwnerBo = (StockOwnerBo) appContext
				.getBean("stockOwnerBo");

		StockOwner stockOwner = new StockOwner();
		stockOwner.setStockOwnerName("Laxmipriya Ganesh");
		stockOwnerBo.save(stockOwner);

		StockOwner stockowner2 = stockOwnerBo
				.findByStockOwnerName("Laxmipriya Ganesh");
		System.out.println(stockowner2);

		stockowner2.setStockOwnerName("Arun Nagaraj");
		stockOwnerBo.update(stockowner2);

		stockOwnerBo.delete(stockowner2);

		System.out.println("Done");

	}
}
