package com.example.freeofzn;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HelloMapper {
    public List<HelloDTO> selectAll()throws Exception;
}