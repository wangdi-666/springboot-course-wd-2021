package com.example.mybatisexamples.example03;

import com.example.mybatisexamples.entity.Address;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;



@SpringBootTest
@Transactional
@Rollback(value = false)
@Slf4j
public class AddDataTest {

    @Autowired
    private AddData addData;

    /*
    无需手动设置主键值，默认主键生成策略为雪花算法
     */
    @Test
    public void setAddData_test() {
        Address address = new Address();
        address.setId(5L);
        address.setDetail("910");
        address.setUserId(1381799076500688898L);
        addData.insert(address);
    }

}
