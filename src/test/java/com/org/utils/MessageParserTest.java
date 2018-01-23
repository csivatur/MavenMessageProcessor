package com.org.utils;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MessageParserTest {	
	
	@Test
    public void testProductTypeMsg1() {
		MessageParser parseObj=new MessageParser("apple at 10p");
		assertEquals("Result", "apples", parseObj.getProductType());
	}
	
	@Test
    public void testProductTypeMsg2() {
		MessageParser parseObj=new MessageParser("20 sales of apples at 10p each");
		assertEquals("Result", "apples", parseObj.getProductType());
	}
	
	@Test
    public void testProductTypeMsg3() {
		MessageParser parseObj=new MessageParser("Add 20p apples");
		assertEquals("Result", "apples", parseObj.getProductType());
	}
	
	@Test
    public void testProductQuantityMsg1() {
		MessageParser parseObj=new MessageParser("apple at 10p");
		assertEquals("Result", 1, parseObj.getProductQuantity());
	}
	
	@Test
    public void testProductQuantityMsg2() {
		MessageParser parseObj=new MessageParser("20 sales of apples at 10p each");
		assertEquals("Result", 20, parseObj.getProductQuantity());
	}
	
	@Test
    public void testProductPriceMsg1() {
		MessageParser parseObj=new MessageParser("apple at 10p");
		assertEquals(0.1F, parseObj.getProductPrice(),1 * Math.abs(0.01));
	}
}
