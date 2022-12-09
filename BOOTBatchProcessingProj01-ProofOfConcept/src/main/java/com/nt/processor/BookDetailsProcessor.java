package com.nt.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component("bdProcessor")
public class BookDetailsProcessor implements ItemProcessor<String, String> 
{
public  BookDetailsProcessor()
{
	System.out.println(" BookDetailsProcessor:0-param constructor");
}
	
	@Override
	public String process(String item) throws Exception 
	{
	String bookWithTitle=null;
	if(item.equalsIgnoreCase("CRJ"))
		return bookWithTitle=item+"By HS AND PN";
	else if(item.equalsIgnoreCase("TIJ"))
		return bookWithTitle=item+"By BE";
	if(item.equalsIgnoreCase("HFJ"))
		return bookWithTitle=item+"By KS";
	if(item.equalsIgnoreCase("EJ"))
		return bookWithTitle=item+"By JB";
	if(item.equalsIgnoreCase("BBJ"))
		return bookWithTitle=item+"By RNR";
	return bookWithTitle;
	}
	

}
