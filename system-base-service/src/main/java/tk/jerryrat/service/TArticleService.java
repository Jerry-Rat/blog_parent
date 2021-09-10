package tk.jerryrat.service;

import tk.jerryrat.domain.TArticle;
public interface TArticleService{


    int deleteByPrimaryKey(Integer id);

    int insert(TArticle record);

    int insertSelective(TArticle record);

    TArticle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TArticle record);

    int updateByPrimaryKey(TArticle record);

}
