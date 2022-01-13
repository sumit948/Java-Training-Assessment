package com.example.serviceone.weeksixserviceone;


import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyControllerOne {
	private static final Logger LOG = Logger.getLogger(MyControllerOne.class.getName());

    @GetMapping("/fromserviceone")
       public String index() {
    	 //insted of writing System.out.println use Log.log
          LOG.log(Level.INFO, "Service one");  //display while executed
          return "Welcome to Service one!";
       }
    
    @GetMapping("/employeeone")
    private Employee getalldata() {
    	Employee emp = new Employee();
    	emp.setEmployeeName("Satya");
    	emp.setEmployeeAdd("Kolhapur");
    	return emp;
    }
}
