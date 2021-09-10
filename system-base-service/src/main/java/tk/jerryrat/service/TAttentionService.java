package tk.jerryrat.service;

import tk.jerryrat.domain.TAttention;
public interface TAttentionService{


    int deleteByPrimaryKey(Integer id);

    int insert(TAttention record);

    int insertSelective(TAttention record);

    TAttention selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TAttention record);

    int updateByPrimaryKey(TAttention record);

}
