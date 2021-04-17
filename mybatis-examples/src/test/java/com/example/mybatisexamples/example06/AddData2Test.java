package com.example.mybatisexamples.example06;


import com.example.mybatisexamples.entity.GithubUser;
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
public class AddData2Test {

    @Autowired
    private AddData2 addData2;

    @Test
    public void setAddData_test2(){
        GithubUser githubUser = new GithubUser();
        githubUser.setId(2L);
        githubUser.setName("sad");
        githubUser.setStars(21);
        addData2.insert(githubUser);

        /*
        GithubUser githubUser = new GithubUser();
        githubUser.setId(1L);
        githubUser.setName("BO");
        githubUser.setFollowers(24);
        githubUser.setStars(18);
        githubUser.setGender("男");
        githubUser.setRepos(18);
        addData2.insert(githubUser);*/
    }
}
