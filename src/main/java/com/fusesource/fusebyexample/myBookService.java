package com.fusesource.fusebyexample;

import org.apache.camel.Processor;
import org.apache.camel.Exchange;

//import javax.servlet.http.HttpServletRequest;

public class myBookService implements Processor {
    public void process(Exchange exchange) throws Exception {
        // just get the body as a string
        //String body = exchange.getIn().getBody(String.class);
        
    	// Get the bookId Header
    	String bookId = (String) exchange.getIn().getHeader("bookid");
        System.out.println("Retrieving Book...");
        
        // we have access to the HttpServletRequest here and we can grab it if we need to
        //HttpServletRequest req = exchange.getIn().getBody(HttpServletRequest.class);
        //assertNotNull(req);

        // for unit testing
        //assertEquals("bookid=123", body);

        // send a html response
        exchange.getOut().setBody("<html><body>Book " + bookId + " is Camel in Action.</body></html>");
    }
}