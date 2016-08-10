package com.ge.predix.solsvc.service;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * An example of creating a Rest api using Spring Annotations @RestController.  
 * 
 *   
 * 
 * @author predix
 */
@RestController
public class HelloController {

	
    /**
     * 
     */
    public HelloController() {
		super();
	}

	/**
	 * Sample Endpoint which returns a Welcome Message
	 * @param echo - the string to echo back
	 * @return -
	 */
	@SuppressWarnings("nls")
    @RequestMapping(value="/api", method = RequestMethod.GET)
    public String index(@RequestParam(value="echo",defaultValue="echo") String echo) {
        return "Greetings from Predix Spring Boot! " + (new Date());
    }
	

}