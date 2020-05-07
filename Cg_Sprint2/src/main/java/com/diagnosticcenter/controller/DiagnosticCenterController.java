package com.diagnosticcenter.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diagnosticcenter.entity.Appointment;
import com.diagnosticcenter.entity.DiagnosticCenter;
import com.diagnosticcenter.entity.Test;
import com.diagnosticcenter.service.AdminService;


@RestController // requestingmappig annotations must and shouldbe used in restcontroller
@RequestMapping("/admin") //
@CrossOrigin("http://localhost:4200") //

public class DiagnosticCenterController {
	 
	 @Autowired //
     private AdminService adminservice;
	 
	    
    
     
	 
	 @PutMapping("/approveAppointment") // updating values
     public Appointment updateAppoinment(@RequestBody Appointment appointment) //
     {
    	 return adminservice.updateAppointment(appointment);
     }
	 
	/*
	 @GetMapping(value="/getAppointment/{appointmentid}")
	     public Appointment viewAppointment(@PathVariable("appointmentid") int appointmentid)
	     {
	    	 return adminservice.viewAppointment(appointmentid);
	     }
	  */ 

	     @GetMapping(value="/getAllAppointments/{centrenumber}")
	     public List<Appointment> viewAppointment1(@PathVariable("centrenumber") int centrenumber)
	     {
	    	 return adminservice.viewAppointment1(centrenumber);
	     }
	         
	     @GetMapping(value="/getAllAppointments")
	     public List<Appointment> viewAppointment2()
	     {
	    	 return adminservice.viewAppointment2();
	     }
	         
	     
	     
	      
		     @PostMapping(value="/addCenter") //inserting values
		     public String addCenter(@RequestBody()DiagnosticCenter center)
		     {
		    	 adminservice.addCenter(center);
		    	 return "Center added";	 
		     }
		     
		     @GetMapping(value="/getAllCenters")
		     public List<DiagnosticCenter> viewDiagnostic_center()
		     {
		    	 return adminservice.viewDiagnosticCenter();
		     }
		  
		     
		     @DeleteMapping("/removeCenter/{centreid}")
		     public String removeDiagnostic_center(@PathVariable int centreid)
		     {
		    	 adminservice.removeCenter(centreid);
		    	 return "Diagnostic_center Details Removed";
		     }
		     
		     /*
			     @PostMapping(value="/addTest/{centreid}")
			     public String addTest(@PathVariable int centreid,@RequestBody()Test test)
			     {
			    	 adminservice.addTest(centreid);
			    	 return "Test added";	 
			     }
			    */ 
			     
			     @PostMapping(value="/addTest")
			     public String addTest(@RequestBody()Test test)
			     {
			    	 adminservice.addTest(test);
			    	 return "Test added";	 
			     }
			     
			     
			     @GetMapping(value="/getAllTests")
			     public List<Test> viewTest()
			     {
			    	 return adminservice.viewTest();
			     }
			     
			     
			     @DeleteMapping("/removeTest/{testid}")
			     public String removeTest(@PathVariable int testid)
			     {
			    	 adminservice.removeTest(testid);
			    	 return "Test Details Removed";
			     }
			     
			 
} 


	