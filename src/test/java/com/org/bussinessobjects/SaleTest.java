package com.org.bussinessobjects;

import static org.junit.Assert.*;

import org.junit.Test;

public class SaleTest {

	@Test
    public void testSaleNotfication() {
		Sale saleObj = new Sale();
		assertTrue(saleObj.processNotification("apple at 10p"));
		assertFalse(saleObj.processNotification("at 10p"));
	}
	
	@Test
    public void testSaleNotficationMsg2() {
		Sale saleObj = new Sale();
		assertTrue(saleObj.processNotification("20 sales of apples at 10p each"));
		assertFalse(saleObj.processNotification("20 sales of at 10p each"));
	}
}
