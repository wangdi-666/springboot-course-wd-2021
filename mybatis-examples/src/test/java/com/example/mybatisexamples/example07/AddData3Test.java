package com.example.mybatisexamples.example07;


import com.example.mybatisexamples.entity.Account;
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
public class AddData3Test {

    @Autowired
    private AddData3 addData3;

    @Test
    public void setAddData_test3(){
        Account account = new Account();
        account.setId(1L);
        account.setName("BO");
        account.setBalance(400f);
        account.setVersion(10);
        addData3.insert(account);
    }
}
