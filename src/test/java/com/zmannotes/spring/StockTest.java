package com.zmannotes.spring;

import com.zmannotes.spring.unit.test.dao.StockMapper;
import com.zmannotes.spring.unit.test.domain.Stock;
import com.zmannotes.spring.unit.test.service.StockService;
import com.zmannotes.spring.unit.test.service.StockServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

/**
 * Created by zman on 2016/5/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//指定配置文件
@ContextConfiguration(locations = {"/spring/stock-session-factory.xml"})
//指定资源文件
@TestPropertySource(locations = {"/application.properties"})
public class StockTest {

    @InjectMocks
    @Autowired
    private StockService stockService;
    @Mock
    private StockMapper stockMapperMocker;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Transactional
    @Test
    public void test(){
        Stock stock = new Stock();
        stock.setName("露露");

        when(stockMapperMocker.insert(any(Stock.class))).thenReturn(1);
    	when(stockMapperMocker.selectByPrimaryKey(anyString())).thenReturn(stock);

        stockService.insert(null);
        String name = stockService.selectByCode("000848");
        System.out.println( name );
    }

}
