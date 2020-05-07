package com.diagnosticcenter.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.diagnosticcenter.entity.DiagnosticCenter;




public interface DiagnosticCenterRepository extends JpaRepository<DiagnosticCenter,Integer>
{
	@Query("select d from Diagnostic_center d")
	List<DiagnosticCenter> viewDiagnostic_center();
	
	@Query("select d from Diagnostic_center d")
	List<DiagnosticCenter> viewDiagnostic_centers();

}