package com.rab3tech.admin.dao.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.rab3tech.dao.entity.Customer;
import com.rab3tech.dao.entity.LoanType;
import com.rab3tech.dao.entity.Role;

/**
 * 
 * @author nagendra
 * 
 * 
 * Spring Data JPA repository
 * 
 * 
 * 
 */
public interface MagicCustomerRepository extends JpaRepository<Customer, Integer> {
	public Optional<Customer> findByEmail(String email);
	
	
	@Modifying
    @Query("DELETE Customer c WHERE c.login.loginid = ?1")
	public void deleteByUserid(String  userid);


	


	


	





	
}

