package com.cmhzteam.service;

import com.cmhzteam.entity.Test;
import com.cmhzteam.dao.TestDao;
import com.cmhzteam.entity.PageBean;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    TestDao testDao;

    public List<Test> findItemByPage(int currentPage, int pageSize) {
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        PageHelper.startPage(currentPage, pageSize);
        List<Test> list = testDao.test(null);
        PageBean<Test> testPageBean = new PageBean<>(currentPage, pageSize, testDao.getCount(null));
        testPageBean.setItems(list);
        List<Test> items = testPageBean.getItems();
        return items;
    }

}
