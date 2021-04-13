package com.example.mybatisexamples.example02;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisexamples.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper02 extends BaseMapper<User> {
    // 继承BaseMapper接口，无需自己写sql语句，会自动生成并执行sql语句。直接在测试类里实现就可以

    @Select("select id, name from user where company=#{comp}")
    List<User> listByCompany(String comp);
}
