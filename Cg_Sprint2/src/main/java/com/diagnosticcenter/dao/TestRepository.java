package com.diagnosticcenter.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.diagnosticcenter.entity.Test;




public interface TestRepository extends JpaRepository<Test,Serializable>
{
	@Query("select t from Test t where centrenum=?1")
	List<Test> findAllById(int centreid);

	@Query("select t from Test t")
	List<Test> viewTest();


}