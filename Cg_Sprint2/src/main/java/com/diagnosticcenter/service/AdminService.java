package com.diagnosticcenter.service;



import java.util.List;

import com.diagnosticcenter.entity.Appointment;
import com.diagnosticcenter.entity.DiagnosticCenter;
import com.diagnosticcenter.entity.Test;



public interface AdminService {
	
	
	List<DiagnosticCenter> viewDiagnosticCenter();
	List<Test> viewTest();

	void addCenter(DiagnosticCenter center);
	void removeCenter(int centreid);
	void addTest(Test test);
	void removeTest(int testid);

	Appointment updateAppointment(Appointment a);
	List<Appointment> viewAppointment1(int centrenumber);

	List<Appointment> viewAppointment2();


	

}