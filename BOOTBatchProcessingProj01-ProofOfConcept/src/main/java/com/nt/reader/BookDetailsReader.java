package com.nt.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.stereotype.Component;

@Component("bReader")
public class BookDetailsReader implements ItemReader<String> 
{

	String[] books=new String[] {"CRJ","HFJ","TIJ","EJ","BBJ"};
	int count=0;
	
	public BookDetailsReader()
	{
		System.out.println("BookDetailsReader::0-param constructor");
	}
	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException 
	{
		 if(count<books.length)
		 {
			 return books[count++];
		 }
		 else {
			 return null;
		 }
		
	}

}
