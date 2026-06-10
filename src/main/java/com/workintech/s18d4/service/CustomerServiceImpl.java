package com.workintech.s18d4.service;

import com.workintech.s18d4.repository.CustomerRepository;
import com.workintech.s18d4.entity.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

   // public CustomerServiceImpl(CustomerRepository customerRepository) {
        //this.customerRepository = customerRepository;
    //}

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer find(long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    //@Override
    //public Customer update(Long id, Customer customer) {
       // Customer existingCustomer = findById(id);

        //existingCustomer.setFirstName(customer.getFirstName());
        //existingCustomer.setLastName(customer.getLastName());
        //existingCustomer.setEmail(customer.getEmail());
        //existingCustomer.setSalary(customer.getSalary());
        //existingCustomer.setAddress(customer.getAddress());

        //return customerRepository.save(existingCustomer);
    //}

    @Override
    public Customer delete(long id) {
        Customer customer = find(id);

        customerRepository.delete(customer);
        return customer;
    }
}