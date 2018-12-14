package com.cmhzteam.service.zhj;


import com.cmhzteam.dao.zhj.indexDao;
import com.cmhzteam.entity.zhj.Good;
import com.cmhzteam.entity.zhj.Ptype;
import com.cmhzteam.entity.zhj.Stype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class indexService {
    @Autowired
    indexDao dao;

    public Map<String, Object> indexShow() {
        Map<String, Object> map = new HashMap<String, Object>();
        List<Good> list1 = dao.manLoad();
        List<Good> list2 = dao.womenLoad();
        List<Good> list3 = dao.liveLoad();
        map.put("list1", list1);
        map.put("list2", list2);
        map.put("list3", list3);
        return map;
    }

    public List<Ptype> typeList() {
        List<Ptype> list = dao.getType();
        return list;
    }
}
