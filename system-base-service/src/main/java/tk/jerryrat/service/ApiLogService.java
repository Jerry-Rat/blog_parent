package tk.jerryrat.service;

import tk.jerryrat.domain.ApiLog;
public interface ApiLogService{


    int deleteByPrimaryKey(Long id);

    int insert(ApiLog record);

    int insertSelective(ApiLog record);

    ApiLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ApiLog record);

    int updateByPrimaryKey(ApiLog record);

}
