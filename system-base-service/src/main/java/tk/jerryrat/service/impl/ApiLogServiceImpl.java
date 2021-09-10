package tk.jerryrat.service.impl;

import org.springframework.stereotype.Service;
import tk.jerryrat.domain.ApiLog;
import tk.jerryrat.mapper.ApiLogMapper;
import tk.jerryrat.service.ApiLogService;

import javax.annotation.Resource;
@Service
public class ApiLogServiceImpl implements ApiLogService{

    @Resource
    private ApiLogMapper apiLogMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return apiLogMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ApiLog record) {
        return apiLogMapper.insert(record);
    }

    @Override
    public int insertSelective(ApiLog record) {
        return apiLogMapper.insertSelective(record);
    }

    @Override
    public ApiLog selectByPrimaryKey(Long id) {
        return apiLogMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ApiLog record) {
        return apiLogMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ApiLog record) {
        return apiLogMapper.updateByPrimaryKey(record);
    }

}
