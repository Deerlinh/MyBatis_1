import com.kaishengit.Mapper.MybatisMapper;

import com.kaishengit.Mapper.UserMapper;
import com.kaishengit.Utils.MyBatisSqlSessionFactory;
import com.kaishengit.entity.Student;

import com.kaishengit.entity.Tag;
import com.kaishengit.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.naming.Name;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 蔡林红 on 2017/10/24.
 */
public class MyTest {
    private SqlSession sqlSession;
    private UserMapper userMapper;
    @Before
    public void init(){

        sqlSession=sqlSession= MyBatisSqlSessionFactory.getSqlSession();
       userMapper=sqlSession.getMapper(UserMapper.class);
    }
    @After
    public void colse(){sqlSession.close();}
    @Test
    public  void findById(){
    User user= userMapper.findById(2);
        System.out.println(user);
        System.out.println(user.getName()+user.getStudent().getClassName());
    }
    @Test
    public void  findByWithTog(){
        User user= userMapper.findByWithTag(2);
        System.out.println(user);
        List<Tag> tagList=user.getTagList();
        for(Tag tag:tagList){
            System.out.println(tag);

        }
    }


    @Test
    public  void batchSave(){
        User user1= new User();
        user1.setName("xixi");
        user1.setAge(22);
        user1.setClsId(2);
        User user2= new User();
        user2.setName("x");
        user2.setAge(22);
        user2.setClsId(2);
        User user3= new User();
        user3.setName("xixisss");
        user3.setAge(22);
        user3.setClsId(2);
        List<User> userList= Arrays.asList(user1,user2,user3);
        userMapper.batchSave(userList);
        sqlSession.commit();
    }

}
