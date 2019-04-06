package com.fujitsu.services;


import java.util.List;

import com.fujitsu.beans.Customer;
import com.fujitsu.exception.ServiceException;

public interface CustomerService  {
	
	List<Customer> findAllCustomer() throws ServiceException;
	Customer findById(int customer_Id)throws ServiceException;
	
	void add(Customer customer_Id)throws ServiceException;
	void update(Customer customer_Id)throws ServiceException;
	void remove(Customer customer_Id)throws ServiceException;
	
	List<Customer> sortCustomerById() throws ServiceException;
	List<Customer> sortCustomerByName() throws ServiceException;
	List<Customer> sortCustomerByPhoneNUmber() throws ServiceException;
	List<Customer> sortCustomerByEmailId() throws ServiceException;
	List<Customer> sortCustomerByAddress() throws ServiceException;
	List<Customer> sortCustomerByGender() throws ServiceException;
	List<Customer> sortCustomerByNationality() throws ServiceException;
	List<Customer> sortCustomerByIdProof() throws ServiceException;
	List<Customer> sortCustomerByBirthdate() throws ServiceException;
	List<Customer> sortCustomerByUserId() throws ServiceException;
	List<Customer> sortCustomerByIdType() throws ServiceException;
	List<Customer> sortCustomerByCountryCode() throws ServiceException;




}
