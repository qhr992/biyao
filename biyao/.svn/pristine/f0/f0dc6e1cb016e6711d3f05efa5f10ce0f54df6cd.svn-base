package com.cmhzteam.service.lyp;

import com.cmhzteam.entity.lyp.Comment;
import com.cmhzteam.entity.lyp.Page;
import org.springframework.stereotype.Controller;

import java.util.List;

public interface CommentService {
    //按商品ID展示评论
    List<Comment> findByGid(int gid);

    //添加评论
    int add(Comment com);

    //查找该商品的评论的 总条数
    int findSumByGid(int gid);

    //按商品ID 分页 展示评论
    List<Comment> findByGidPage(Page page);
}
