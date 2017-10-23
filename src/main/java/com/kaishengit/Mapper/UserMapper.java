package com.kaishengit.Mapper;

import com.kaishengit.entity.User;

import java.util.List;

/**
 * Created by 蔡林红 on 2017/10/22.
 */
public interface UserMapper {

    List<User> findAllUser();
    User findById(Integer id);
    void  save(User user);
    void  update (User user);
    void del(User user);

}
