package com.alataf.banking.service;

import com.alataf.banking.dto.AccountDto;

import java.util.List;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto depositBalance(Long id, double amount);

    AccountDto withdrawBalance(Long id, double amount);

    List<AccountDto> getAllAccounts();
}
