package com.whatsapp.testST;

public class Book {
	public static Book b1=new Book();
private Book()
{
}
 public static Book getInstance()
{
		System.out.println("Welcome to Lazy object singleton");
return b1;
}
}


