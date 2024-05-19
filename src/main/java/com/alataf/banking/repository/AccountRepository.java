package com.alataf.banking.repository;

import com.alataf.banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

    /**
     * extends JpaRepository<EntityName, it's primaryKey data type>-- Always..
     */

}
