package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.Map;

/**
 * @author zc
 * @create 2023-08-08-17:06
 */
@Mapper
public interface UserMapper {
    //根据openid查询用户
    @Select("select * from user where openid=#{openid}")
    User getByOpenid(String openid);
    //插入用户数据
    void insert(User user);

    @Select("select * from user where id=#{id}")
    User getById(Long userId);
    //动态条件统计用户数量
    Integer countByMap(Map map);
}
