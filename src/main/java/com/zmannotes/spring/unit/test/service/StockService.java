package com.zmannotes.spring.unit.test.service;

import com.zmannotes.spring.unit.test.dao.StockMapper;
import com.zmannotes.spring.unit.test.domain.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zman on 2016/5/8.
 */
public interface StockService {

    void insert(Stock stock);

    String selectByCode(String code);
}
