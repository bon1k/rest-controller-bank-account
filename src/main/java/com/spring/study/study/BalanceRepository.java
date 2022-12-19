package com.spring.study.study;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Repository
public class BalanceRepository {
    Map<Long, BigDecimal> storage =     new HashMap<>(Map.of(1L, BigDecimal.TEN));

    public BigDecimal getBalanceForId(Long accountId) {
        return storage.get(accountId);
    }


    public void save(Long id, BigDecimal amount){
        storage.put(id, amount);
    }
}
