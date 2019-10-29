package com.virtualpairprogrammers.isbntools;

import static org.junit.Assert.*;

import org.junit.Test;

public class StockManagementTest {

	@Test
	public void testCanGetACorrectLocaterCode() {
		String isbn = "0140177396";
		StockManager stockManager = new StockManager();
		String locatorCode = StockManager.getLocatorCode(isbn);
	    assertEquals("7396", locatorCode);
	}

}
	