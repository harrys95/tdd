package com.virtualpairprogrammers.isbntools;

public class StockManager {
	
	private ExternalISBNDataService service;
	

	public String getLocatorCode(String isbn) {
	Book book = service.lookup(isbn);
	StringBuilder locator = new StringBuilder();
	locator.append(isbn.substring(isbn.length() -4));
	locator.append(book.getAuthor().subSequence(0, 1));
	locator.append(book.getTitle().split("").length);
	return locator.toString();
	}

}
