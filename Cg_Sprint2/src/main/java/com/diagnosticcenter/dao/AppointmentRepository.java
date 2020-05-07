package com.diagnosticcenter.dao;



import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.diagnosticcenter.entity.Appointment;




public interface AppointmentRepository extends JpaRepository<Appointment,Integer>
{
	@Query("select a from Appointment a where centrenumber=?1")
	List<Appointment> viewAppointment1(int centrenumber);
	@Query("select a from Appointment a where usersid=?1")
	List<Appointment> findAllById(int centrenumber);
	@Query("select a from Appointment a")
	List<Appointment> viewAppointment2();

}