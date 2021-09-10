package tk.jerryrat.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import tk.jerryrat.domain.TAttention;
import tk.jerryrat.mapper.TAttentionMapper;
import tk.jerryrat.service.TAttentionService;
@Service
public class TAttentionServiceImpl implements TAttentionService{

    @Resource
    private TAttentionMapper tAttentionMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tAttentionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TAttention record) {
        return tAttentionMapper.insert(record);
    }

    @Override
    public int insertSelective(TAttention record) {
        return tAttentionMapper.insertSelective(record);
    }

    @Override
    public TAttention selectByPrimaryKey(Integer id) {
        return tAttentionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TAttention record) {
        return tAttentionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TAttention record) {
        return tAttentionMapper.updateByPrimaryKey(record);
    }

}
