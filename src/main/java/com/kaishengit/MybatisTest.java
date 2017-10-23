package com.kaishengit;

import com.kaishengit.Mapper.UserMapper;
import com.kaishengit.Utils.MyBatisSqlSessionFactory;
import com.kaishengit.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import java.io.IOException;
import java.io.Reader;

/**
 * Created by 蔡林红 on 2017/10/22.
 * @author linhong
 */

public class MybatisTest {
    @Test
    public  void first() throws IOException {

        Reader reader=Resources.getResourceAsReader("conf.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);

        SqlSession sqlSession= sqlSessionFactory.openSession();
/*
        User user =sqlSession.selectOne("com.kaishengit.Mapper.UserMapper.findById",1);
        System.out.println(user.getName());*/
       /* User user= new User();
        user.setName("jim");
        user.setAge(22);
        sqlSession.insert("com.kaishengit.Mapper.UserMapper.save",user);
        sqlSession.commit();*/

        //使用mapper接口
       /* UserMapper userMapper= sqlSession.getMapper(UserMapper.class);
        User user=userMapper.findById(2);
        System.out.println(user);*/

        sqlSession.close();
    }
    @Test
    public  void  delete(){
        SqlSession sqlSession= MyBatisSqlSessionFactory.getSqlSession();
        sqlSession.delete("com.kaishengit.Mapper.UserMapper.delete",1);
        sqlSession.commit();
        sqlSession.close();

    }



}
