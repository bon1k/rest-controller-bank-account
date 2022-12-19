package com.spring.study.study;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.TestComponent;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BankServiceTest {

    private BalanceRepository balanceRepository = new BalanceRepository();
    private BankService bankService = new BankService(balanceRepository);


    @Test
    void addMoney() {
        final BigDecimal balance = bankService.addMoney(1L,BigDecimal.ONE);
        assertEquals(balance, BigDecimal.valueOf(11));
    }
}