package tk.jerryrat.service;

import tk.jerryrat.domain.TMusic;
public interface TMusicService{


    int deleteByPrimaryKey(Integer id);

    int insert(TMusic record);

    int insertSelective(TMusic record);

    TMusic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TMusic record);

    int updateByPrimaryKey(TMusic record);

}
