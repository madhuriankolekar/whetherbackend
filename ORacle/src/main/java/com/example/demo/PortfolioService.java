package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class PortfolioService {

    @Autowired
    private PortfolioRE portfolioRepository;

    public List<Portfolio> getAllPortfolios() {
        return portfolioRepository.findAll();
    }

	
//	public List<Portfolio> getIsManaged() {
//	    List<String> values = Arrays.asList("Yes", "No");
//	    return portfolioRepository.findByCheckboxDescIn(values);
//	}


	public List<PIsgInfo> getOfferingIsgInformationByIsAdvisoryOnly() {
		// TODO Auto-generated method stub
		return null;
	}


	 public List<String> getIsAdvisoryOnlyForAllPortfolios() {
	        // Use predefined JpaRepository method findAll()
	        List<Portfolio> portfolios = portfolioRepository.findAll();

	        // Collecting the isAdvisoryOnly attribute for each related OfferingIsgInformation
	        List<String> isAdvisoryOnlyList = new ArrayList<>();
	        for (Portfolio portfolio : portfolios) {
	            List<PIsgInfo> offeringIsgInformationList = portfolio.getIsgInfo();
	            for (PIsgInfo offering : offeringIsgInformationList) {
	                isAdvisoryOnlyList.add(offering.getPassword());
	            }
	        }
	        return isAdvisoryOnlyList;
	    }

//	 public List<PIsgInfo> getDistinctIsAdvisoryOnly() {
//	        return portfolioRepository.findDistinctByIsAdvisoryOnly();
//	    }

	  @Autowired
	    PIsgRepo pIsgRepo;
	 public List<String> getAllNames() {
	        return pIsgRepo.findAll()  // Fetch all PIsgInfo records
	                .stream()
	                .map(PIsgInfo::getName)  // Extract the name field from each PIsgInfo
	                .collect(Collectors.toList());
	    }



	 public List<String> getIsAdvisoryOnlyStatus() {
	        return pIsgRepo.findAll()  // Fetch all PIsgInfo records
	                .stream()
	                .map(isgInfo -> isgInfo.getIsAdvisoryOnly() ? "yes" : "no")  // Map true/false to "yes"/"no"
	                .collect(Collectors.toList());  // Collect to list
	    }
	 
}
