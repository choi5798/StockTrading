package com.stocktrading.stock.service;

import com.stocktrading.stock.repository.StockRepository;
import org.springframework.stereotype.Service;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;

@Service
public class StockService {

    private final StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public void findStock(String stockTicker) {
        try {
            Stock stock = YahooFinance.get(stockTicker);
            stock.print();
        } catch (IOException e) {
            throw new IllegalStateException("주식 정보를 가져오는 데 실패했음.");
        }
    }

}
