package com.cmhzteam.service.lyp.impl;

import com.cmhzteam.dao.lyp.GoodDetailMapper;
import com.cmhzteam.entity.lyp.GoodDetail;
import com.cmhzteam.entity.lyp.GoodImage;
import com.cmhzteam.entity.lyp.GoodMainParam;
import com.cmhzteam.service.lyp.GoodDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodDetailServiceImpl implements GoodDetailService {
    @Autowired
    GoodDetailMapper mapper;

    @Override
    public List<GoodDetail> findGoodDetail(int gid) {
        return mapper.findGoodDetail(gid);
    }

    @Override
    public List<GoodMainParam> findGoodParam(int gid) {
        return mapper.findGoodParam(gid);
    }

}
