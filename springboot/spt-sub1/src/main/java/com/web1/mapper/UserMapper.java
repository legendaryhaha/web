package com.web1.mapper;

import org.apache.ibatis.annotations.Select;

/***
 *
 * @author:fsn
 * @date: 2020/1/5 16:38
 * @description
 */

public interface UserMapper {
    @Select("select count(*) from `users`")
    int selectUserCount();

    @Select("select count(*) from `users` where `role_id`= #{key}")
    int selectUserByKey(int key);
}
