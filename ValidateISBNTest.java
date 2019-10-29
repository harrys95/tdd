package com.virtualpairprogrammers.isbntools;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidateISBNTest {

	@Test
	public void checkAValid10DigitISBN() {
		ValidateISBN validator = new ValidateISBN();
	    boolean result = validator.checkISBN("1420629743");
	    assertTrue("first value", result);
	    result = validator.checkISBN("0140186425");
	    assertTrue("second value", result);
	}
	@Test
	public void checkAValid13DigitISBN() {
		ValidateISBN validator = new ValidateISBN();
	    boolean result = validator.checkISBN("9781503280786");
	    assertTrue("first value", result);	
	    result = validator.checkISBN("9781853267338");
	    assertTrue("second value", result);
	}
	@Test
	public void TenDigitISBNNumbersEndingInAnXAreValid() {
		ValidateISBN validator = new ValidateISBN();
	    boolean result = validator.checkISBN("012000030X");
	    assertTrue(result);
	}
    @Test
	public void checkAInvalid10DigitISBN() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("1420629744");
	    assertFalse(result);		
	}
   @Test
   public void checkAInvalid13DigitISBN() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("9781503280787");
	    assertFalse(result);
   }
   @Test(expected = NumberFormatException.class)
   public void nineDigitISBNAreNotAllowed() {
   ValidateISBN validator = new ValidateISBN();
   validator.checkISBN("123456789");
   }
   @Test(expected = NumberFormatException.class)
   public void nonNumericISBNsAreNotAllowed() {
	   ValidateISBN validator = new ValidateISBN();
	   validator.checkISBN("helloworld");
   }
}
