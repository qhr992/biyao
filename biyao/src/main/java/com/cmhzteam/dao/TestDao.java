package com.cmhzteam
        .dao;

import com.cmhzteam.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface TestDao {

    public List<Test> test(Map<String, Object> map);

    public int getCount(Map<String, Object> map);

}
