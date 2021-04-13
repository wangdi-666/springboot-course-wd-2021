package com.example.mybatisexamples.example03;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisexamples.entity.Address;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface AddData extends BaseMapper<Address> {

}
