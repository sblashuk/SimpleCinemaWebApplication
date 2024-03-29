package com.cinema.service;

import com.cinema.model.Customer;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface CustomerService {
    /**
     *
     * @return all customers.
     */
    List<Customer> getAllCustomers() throws DataAccessException;

    /**
     *
     * @return customers by session id.
     */
    List<Customer> getCustomersBySessionId(Integer sessionId) throws DataAccessException;

    /**
     *
     * @param customerId customer's id.
     * @return customer.
     */
    Customer getCustomerById(Integer customerId) throws DataAccessException;

    /**
     *
     * @param customer new customer.
     * @return customer's id.
     */
    Integer addCustomer(Customer customer) throws DataAccessException;

    /**
     *
     * @param customer customer for update.
     * @return the number of update rows.
     */
    Integer updateCustomer(Customer customer) throws DataAccessException;

    /**
     *
     * @param customerId customer's id.
     * @return quantity of delete customer.
     */
    Integer deleteCustomer(Integer customerId) throws DataAccessException;
}
