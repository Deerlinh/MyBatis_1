package com.kaishengit.Mapper;

import com.kaishengit.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by 蔡林红 on 2017/10/24.
 */
public interface MybatisMapper {
    //通过@注解配置
    @Select("SELECT  * from mybatis WHERE  id =#{id}")
    User findById(int id);

    @Insert("INSERT  INTO  mybatis (name,age,cls_id) VALUES (#{name},#{age},#{clsId})")
    User save(User user);

    @Delete("DELETE  from mybatis WHERE  id=#{id}")
    void delete(int id);



}
