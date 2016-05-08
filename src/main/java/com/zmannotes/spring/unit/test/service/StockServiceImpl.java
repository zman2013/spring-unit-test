package com.zmannotes.spring.unit.test.service;

import com.zmannotes.spring.unit.test.dao.StockMapper;
import com.zmannotes.spring.unit.test.domain.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zman on 2016/5/8.
 */
@Service
public class StockServiceImpl implements StockService{

    @Autowired
    private StockMapper stockMapper;

    public void insert(Stock stock){
        stockMapper.insert(stock);
    }

    public String selectByCode(String code){
        Stock stock = stockMapper.selectByPrimaryKey(code);
        return stock.getName();
    }
}
