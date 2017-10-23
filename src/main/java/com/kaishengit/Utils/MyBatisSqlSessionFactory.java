package com.kaishengit.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by 蔡林红 on 2017/10/23.
 * @author lin
 *
 */
public class MyBatisSqlSessionFactory {
    /* 创建单例 SqlSessionFactory */
        private  static SqlSessionFactory sqlSessionFactory;

        static {
            try {
                Reader reader = Resources.getResourceAsReader("conf.xml");
                sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);


            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

    public  static SqlSession getSqlSession(){
        return  getSqlSessionFactory().openSession();
    }
}
