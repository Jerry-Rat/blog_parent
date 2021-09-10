package tk.jerryrat.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import tk.jerryrat.domain.TMusic;
import tk.jerryrat.mapper.TMusicMapper;
import tk.jerryrat.service.TMusicService;
@Service
public class TMusicServiceImpl implements TMusicService{

    @Resource
    private TMusicMapper tMusicMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tMusicMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TMusic record) {
        return tMusicMapper.insert(record);
    }

    @Override
    public int insertSelective(TMusic record) {
        return tMusicMapper.insertSelective(record);
    }

    @Override
    public TMusic selectByPrimaryKey(Integer id) {
        return tMusicMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TMusic record) {
        return tMusicMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TMusic record) {
        return tMusicMapper.updateByPrimaryKey(record);
    }

}
