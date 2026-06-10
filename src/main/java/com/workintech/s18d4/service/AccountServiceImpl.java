package com.workintech.s18d4.service;

import com.workintech.s18d4.repository.AccountRepository;
import com.workintech.s18d4.entity.Account;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    //private final CustomerRepository customerRepository;

    //public AccountServiceImpl(AccountRepository accountRepository,
                     //         CustomerRepository customerRepository) {
       // this.accountRepository = accountRepository;
      //  this.customerRepository = customerRepository;
   // }

    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account find(long id) {
        return accountRepository.findById(id).orElse(null);
    }

    @Override
    public Account save(Account account) {
        //Customer customer = customerRepository.findById(customerId).orElseThrow();
        //account.setCustomer(customer);
        return accountRepository.save(account);
    }

   // @Override
    //public Account update(Long customerId, Account account) {
       // Customer customer = customerRepository.findById(customerId).orElseThrow();

       // account.setCustomer(customer);
        //return accountRepository.save(account);
    //}

    @Override
    public Account delete(long id) {
        Account account = find(id);
        accountRepository.delete(account);
        return account;
    }
}
