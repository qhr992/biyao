package com.cmhzteam.dao.zhj;

import com.cmhzteam.entity.zhj.Good;
import com.cmhzteam.entity.zhj.Ptype;
import com.cmhzteam.entity.zhj.Stype;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface indexDao {
    public List<Good> manLoad();

    public List<Good> womenLoad();

    public List<Good> liveLoad();

    public List<Ptype> getType();


}
