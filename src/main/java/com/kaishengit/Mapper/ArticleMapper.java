package com.kaishengit.Mapper;

import com.kaishengit.entity.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by 蔡林红 on 2017/10/25.
 */
public interface ArticleMapper {
    List<Article>  find (@Param("title") String title);
    List<Article> findByParam(Map<String,Object> searchParam);
    List<Article> findByIdList(List<Integer> idList);
}
