package MybatisTest;

import com.kaishengit.Mapper.MybatisMapper;
import com.kaishengit.Mapper.UserMapper;
import com.kaishengit.Utils.MyBatisSqlSessionFactory;
import com.kaishengit.entity.Article;
import com.kaishengit.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * Created by 蔡林红 on 2017/10/22.
 * @author linhong
 */

public class MybatisTest {

    private SqlSession sqlSession;
    private MybatisMapper mybatisMapper;
    @Before
    public void init(){

        sqlSession=sqlSession=MyBatisSqlSessionFactory.getSqlSession();
        mybatisMapper=sqlSession.getMapper(MybatisMapper.class);
    }
    @After
    public void colse(){
        sqlSession.close();
    }

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
        User user= new User();

        SqlSession sqlSession= MyBatisSqlSessionFactory.getSqlSession();

        sqlSession.delete("com.kaishengit.Mapper.UserMapper.delete",1);
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public  void findById(){
        User user=mybatisMapper.findById(2002);
        System.out.println(user);

    }
    @Test
    public void save(){
        User user = new User();
        user.setName("jake");
        user.setAge(23);
        user.setClsId(2);
       User user1= mybatisMapper.save(user);
    }
}
