package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface PortfolioRE  extends JpaRepository<Portfolio,Long >{
//	 @Query("SELECT p FROM Portfolio p JOIN p.isgInfo i WHERE i.name IN :values")
//	List<Portfolio> findByCheckboxDescIn(List<String> values);
//query usingg
	//using predefind java 8
	//using hibernates
	
	
	
//	List<PIsgInfo> findDistinctByIsAdvisoryOnly();
	

}
