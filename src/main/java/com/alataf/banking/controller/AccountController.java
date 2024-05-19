package com.alataf.banking.controller;

import com.alataf.banking.dto.AccountDto;
import com.alataf.banking.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private AccountService accountService;

    /**
     * No need to use @autowired annotation because this class has only one constructor
     * so spring will automatically inject the dependency
     * @param accountService
     */
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    //Add Account REST API
    @PostMapping("/addAccount")
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto){
        return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
    }

    //get Account REST API
    @GetMapping("/getAccountById/{id}")
    public ResponseEntity<AccountDto> getAccountById(@PathVariable Long id) {
        AccountDto accountDto = accountService.getAccountById(id);
        return ResponseEntity.ok(accountDto);
    }

    // Deposit REST API
    @PutMapping("/{id}/deposit")
    public ResponseEntity<AccountDto> deposit(@PathVariable Long id,
                                              @RequestBody Map<String, Double> request) {
        Double amount = request.get("amount");
        AccountDto accountDto = accountService.depositBalance(id, amount);
        return ResponseEntity.ok(accountDto);
    }
}
