package com.example.mybatisexamples.example04;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisexamples.entity.Address;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface AddressMapper04 extends BaseMapper<Address> {
    @Select("select *," +
            "u.create_time userCreateTime, " +
            "a.id id, " +
            "a.create_time addressCreateTime " +
            "from address a join user u " +
            "on u.id = a.user_id " +
            "where a.detail=#{detail}")
    List<AddressDTO04> list(String detail);

}