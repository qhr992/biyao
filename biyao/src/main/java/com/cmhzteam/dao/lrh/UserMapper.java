package com.cmhzteam.dao.lrh;

import com.cmhzteam.entity.lrh.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Map;


/**
 * 用户表的持久化接口
 */
@Repository
@Mapper
public interface UserMapper {
    /**
     * 根据用户名和密码来查询用户
     *
     * @param map 用户名和密码的集合
     * @return 用户
     */
    public User selectUserByUsernameAndPassword(Map<String, Object> map);

    /**
     * 根据用户名来查找用户
     *
     * @param  Mobile 用户名
     * @return 用户
     */
    public User selectUserByUsername(String Mobile);

    /**
     * 新增一个用户
     *
     * @param map 用户名和密码的集合
     * @return 受影响的行数
     */
    public int insertUser(Map<String, Object> map);
}
