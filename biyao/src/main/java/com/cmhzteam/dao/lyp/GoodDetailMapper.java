package com.cmhzteam.dao.lyp;

import com.cmhzteam.entity.lyp.GoodDetail;
import com.cmhzteam.entity.lyp.GoodMainParam;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface GoodDetailMapper {
    //商品详情+商品详情图片
    List<GoodDetail> findGoodDetail(int gid);

    //商品详情属性
    List<GoodMainParam> findGoodParam(int gid);

}
