import com.kaishengit.Mapper.ArticleMapper;
import com.kaishengit.Utils.MyBatisSqlSessionFactory;
import com.kaishengit.entity.Article;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;

/**
 * Created by 蔡林红 on 2017/10/26.
 */
public class CaCheTest {


    //缓存
    //在MyBatis 中 一级缓存默认存在
    //区间：在同一个SqlSession 中，同一个对象
   @Test
    public  void find1(){
        SqlSession sqlSession= MyBatisSqlSessionFactory.getSqlSession();
        ArticleMapper articleMapper=sqlSession.getMapper(ArticleMapper.class);
        String title="%拳皇%";
        List<Article> articles=articleMapper.find(title);
        System.out.println(articles.size());

        String title2="%拳皇%";
        List<Article> articles2=articleMapper.find(title);
        System.out.println(articles2.size());
        sqlSession.close();
    }

//二级缓存默认关闭，需要开启，将被缓存的对象序列化
//在Mapper.xml中 使用<cache/>节点
    //区间：在同一个SqlSessionFactory中，多个SqlSession 之间
    @Test
    public  void find(){
        SqlSession sqlSession= MyBatisSqlSessionFactory.getSqlSession();
        ArticleMapper articleMapper=sqlSession.getMapper(ArticleMapper.class);
      String title="%拳皇%";
        List<Article> articles=articleMapper.find(title);
        System.out.println(articles.size());
        sqlSession.close();




        SqlSession sqlSession2= MyBatisSqlSessionFactory.getSqlSession();
        ArticleMapper articleMapper2=sqlSession2.getMapper(ArticleMapper.class);
        String title2="%拳皇%";
        List<Article> articles2=articleMapper2.find(title2);
        System.out.println(articles2.size());
        sqlSession2.close();

    }

}
