package tk.jerryrat.service;

import tk.jerryrat.domain.TComment;
public interface TCommentService{


    int deleteByPrimaryKey(Integer id);

    int insert(TComment record);

    int insertSelective(TComment record);

    TComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TComment record);

    int updateByPrimaryKey(TComment record);

}
