package com.cornellnotes.Cornell.Notes.Backend.controller;

import com.cornellnotes.Cornell.Notes.Backend.model.Account;
import com.cornellnotes.Cornell.Notes.Backend.repositories.AccountRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
    private final AccountRepository accountRepository;

    public AccountController(final AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    @GetMapping
    public Iterable<Account> getUsers(){
        return this.accountRepository.findAll();
    }

}
