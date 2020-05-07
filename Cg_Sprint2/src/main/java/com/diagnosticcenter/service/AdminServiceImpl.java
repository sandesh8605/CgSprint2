package com.diagnosticcenter.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.diagnosticcenter.dao.AdminRepository;
import com.diagnosticcenter.dao.AppointmentRepository;
import com.diagnosticcenter.dao.DiagnosticCenterRepository;
import com.diagnosticcenter.dao.TestRepository;
import com.diagnosticcenter.entity.Appointment;
import com.diagnosticcenter.entity.DiagnosticCenter;
import com.diagnosticcenter.entity.Test;


@Service
@Transactional
public class AdminServiceImpl implements AdminService
{

	 @Autowired
     private AdminRepository ar;
	 @Autowired
     private DiagnosticCenterRepository dr;
	 @Autowired
     private TestRepository tr; 
	 @Autowired
     private AppointmentRepository ap;
	
	
	
    	
	 @Override
     public List<DiagnosticCenter> viewDiagnosticCenter()
     {
    	 return dr.findAll();
     }
     
     
     @Override
     public void addCenter(DiagnosticCenter center)
     {
    	  dr.save(center);
     }
     
     @Override
     public void removeCenter(int centreid)
     {
    	  dr.deleteById(centreid);
     }
	
	
    @Override 
	public List<Test> viewTest()
     {
    	 return tr.findAll();
     }
     
   
    @Override
     public void addTest(Test test)
     {
    	 tr.save(test);
     }
     
    @Override
     public void removeTest(int testid)
     {
    	  tr.deleteById(testid);
     }
    
    
    @Override
    public List<Appointment> viewAppointment1(int centrenumber)
    {
      	 return ap.findAllById(centrenumber);
    }
    
    
    @Override
    public List<Appointment> viewAppointment2()
    {
      	 return ap.findAll();
    }


	@Override
	public Appointment updateAppointment(Appointment a) {
		// TODO Auto-generated method stub
		return null;
	}
     
	/*
    @Override
    public Appointment updateAppointment(Appointment a)
    {
   	 Appointment ud=ap.findById(a.getAppointmentId()).get();
   		if(ud!=null)
   		{
   			ud.setAppointmentstatus(a.getAppointmentId());
   			ud.setDateTime(a.getDateTime());
   		}
   		return ap.save(ud);
    }*/

    /*
 	@Override
 	public String updateCenter(Diagnostic_center d) {
 		boolean bool = diagnostic_center.existsById(d.getCenterid());
 		if(bool == true) {
 			diagnostic_center.save(d);
 			return "Center updated successfully!!";
 		}
 		else {
 			return "center not updated";
 		}
 	}*/
    	
}


