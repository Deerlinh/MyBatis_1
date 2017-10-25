import com.kaishengit.Mapper.ArticleMapper;
import com.kaishengit.Mapper.UserMapper;
import com.kaishengit.Utils.MyBatisSqlSessionFactory;
import com.kaishengit.entity.Article;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 蔡林红 on 2017/10/25.
 */
public class ArticleMapperTest {

    private SqlSession sqlSession;
    private ArticleMapper articleMapper;
    @Before
    public void init(){

        sqlSession=sqlSession= MyBatisSqlSessionFactory.getSqlSession();
        articleMapper=sqlSession.getMapper(ArticleMapper.class);
    }
    @After
    public void colse(){sqlSession.close();}
    @Test
    public  void find(){
        String title="%拳皇%";
        List<Article> articles=articleMapper.find(title);
        System.out.println(articles.size());
    }
    @Test
    public  void findByParam(){
        Map<String,Object> searchParam=new HashMap<>();

        searchParam.put("simplecontent","和都");
        List<Article> articleList= articleMapper.findByParam(searchParam);
        for(Article article:articleList){
            System.out.println(article);
        }

    }
    @Test
    public void  findByIdList(){
        List<Integer> idLsit= Arrays.asList(102,103,107);
        List<Article> articleList= articleMapper.findByIdList(idLsit);
        for(Article article: articleList){
            System.out.println(article);
        }
    }
}

