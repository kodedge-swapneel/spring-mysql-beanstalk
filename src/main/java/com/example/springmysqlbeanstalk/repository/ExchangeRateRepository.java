package com.example.springmysqlbeanstalk.repository;


import com.example.springmysqlbeanstalk.model.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Integer> {
    ExchangeRate findBySourceCurrencyAndTargetCurrency(String sourceCurrency, String targetCurrency);
}
