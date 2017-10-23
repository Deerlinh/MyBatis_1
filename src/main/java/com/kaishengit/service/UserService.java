package com.kaishengit.service;

import com.kaishengit.Mapper.UserMapper;
import com.kaishengit.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * Created by 蔡林红 on 2017/10/22.
 */
public class UserService {
    private Logger logger= LoggerFactory.getLogger(getClass());

    public List<User> findAllUser() {
        try {
            Reader reader = Resources.getResourceAsReader("conf.xml");
            SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(reader);

            SqlSession sqlSession = sqlSessionFactory.openSession();

            UserMapper userMapper=sqlSession.getMapper(UserMapper.class);


        } catch (IOException e) {
            e.printStackTrace();
        }

    return null;
    }

}
