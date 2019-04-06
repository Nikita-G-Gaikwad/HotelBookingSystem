package com.fujitsu.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fujitsu.beans.Customer;
import com.fujitsu.daos.CustomerDAO;
import com.fujitsu.exception.ServiceException;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDAO customerDao;

	@Override
	public List<Customer> findAllCustomer() throws ServiceException {
		// TODO Auto-generated method stub
		return customerDao.getAllCustomer();
	}

	@Override
	public Customer findById(int customer_Id) throws ServiceException {
		// TODO Auto-generated method stub
		return customerDao.getCutomerById(customer_Id);
	}

	@Override
	public void add(Customer customer_Id) throws ServiceException {
		// TODO Auto-generated method stub
		customerDao.insert(customer_Id);
		
	}

	@Override
	public void update(Customer customer_Id) throws ServiceException {
		// TODO Auto-generated method stub
		customerDao.update(customer_Id);
	}

	@Override
	public void remove(Customer customer_Id) throws ServiceException {
		// TODO Auto-generated method stub
		customerDao.delete(customer_Id);
		
	}

	@Override
	public List<Customer> sortCustomerById() throws ServiceException {
		// TODO Auto-generated method stub
		return findAllCustomer().stream().sorted().collect(Collectors.toList());
	}

	@Override
	public List<Customer> sortCustomerByName() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> sortCustomerByPhoneNUmber() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> sortCustomerByEmailId() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> sortCustomerByAddress() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> sortCustomerByGender() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> sortCustomerByNationality() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> sortCustomerByIdProof() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> sortCustomerByBirthdate() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> sortCustomerByUserId() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> sortCustomerByIdType() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> sortCustomerByCountryCode() throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
