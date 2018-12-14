package com.cmhzteam.service.lyp.impl;

import com.cmhzteam.dao.lyp.CommentMapper;
import com.cmhzteam.entity.lyp.Comment;
import com.cmhzteam.entity.lyp.Page;
import com.cmhzteam.service.lyp.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentMapper mapper;

    //按商品ID展示评论
    @Override
    public List<Comment> findByGid(int gid) {
        return mapper.findByGid(gid);
    }

    //添加评论
    @Override
    public int add(Comment com) {
        return mapper.add(com);
    }
    //查找该商品的评论的 总条数

    @Override
    public int findSumByGid(int gid) {
        return mapper.findSumByGid(gid);
    }

    //按商品ID 分页 展示评论
    @Override
    public List<Comment> findByGidPage(Page page) {
        return mapper.findByGidPage(page);
    }
}
