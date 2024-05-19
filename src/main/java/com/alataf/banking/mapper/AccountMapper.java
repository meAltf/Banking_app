package com.alataf.banking.mapper;

import com.alataf.banking.dto.AccountDto;
import com.alataf.banking.entity.Account;

public class AccountMapper {

    /**
     * converting dto to JPA entity
     * @param accountDto
     * @return
     */
    public static Account mapToAccount(AccountDto accountDto) {
        if (accountDto == null) return null;

        Account account = new Account();
        account.setId(accountDto.getId());
        account.setAccountHolderName(accountDto.getAccountHolderName());
        account.setBalance(accountDto.getBalance());
        return account;
    }

    /**
     * converting JPA entity to dto
     * @param account
     * @return
     */
    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;
    }



}
