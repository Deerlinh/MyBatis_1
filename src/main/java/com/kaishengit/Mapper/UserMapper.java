package com.kaishengit.Mapper;

import com.kaishengit.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 蔡林红 on 2017/10/22.
 */
public interface UserMapper {

    User findById(int id);
    User findByWithTag(int id);
    int batchSave(@Param("UserList") List<User> UserList);
    int deletePrimaryKey(@Param("idList") List<User> idList);
  /*  List<User> findAllUser();
    User findById(Integer id);
    void  save(User user);
    void  update (User user);

    List<User> page (int offter,int size);*/

}
