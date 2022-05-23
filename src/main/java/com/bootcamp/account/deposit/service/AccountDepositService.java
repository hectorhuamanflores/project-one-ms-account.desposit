package com.bootcamp.account.deposit.service;

import com.bootcamp.account.deposit.dto.AccountDepositRequest;
import com.bootcamp.account.deposit.entity.AccountDeposit;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountDepositService {

    public Flux<AccountDeposit> getAllAccountDeposit();
    public Mono<AccountDeposit> getAccountDepositById(String id);
    public Flux<AccountDeposit> getAccountDepositByIdAccount(String idAccount);
    public Mono<AccountDeposit> createAccountDeposit(AccountDepositRequest AccountDeposit);
    public Mono<AccountDeposit> updateAccountDeposit(AccountDeposit AccountDeposit);
    public Mono<AccountDeposit> deleteAccountDeposit(String id);
    
    
}
