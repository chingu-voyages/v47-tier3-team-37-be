package com.cornellnotes.Cornell.Notes.Backend.repositories;

import org.springframework.data.repository.CrudRepository;
import com.cornellnotes.Cornell.Notes.Backend.model.Account;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
