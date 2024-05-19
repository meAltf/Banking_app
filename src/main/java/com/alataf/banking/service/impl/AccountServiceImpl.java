package com.alataf.banking.service.impl;

import com.alataf.banking.dto.AccountDto;
import com.alataf.banking.entity.Account;
import com.alataf.banking.mapper.AccountMapper;
import com.alataf.banking.repository.AccountRepository;
import com.alataf.banking.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }
}
