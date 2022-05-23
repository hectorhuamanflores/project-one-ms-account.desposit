package com.bootcamp.account.deposit.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.account.deposit.entity.AccountDeposit;

import reactor.core.publisher.Flux;

@Repository
public interface AccountDepositRepository  extends ReactiveCrudRepository<AccountDeposit,String> {
    /*
     * find(loQuetrae)By(loQueBusca)
     * findByNombreContainingOrApellidoContaining(String nombre,String apellido);
     * 
     */
	Flux<AccountDeposit> findByIdAccount(String idAccount);
	
}
