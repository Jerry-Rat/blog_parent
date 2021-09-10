package tk.jerryrat.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import tk.jerryrat.domain.TArticle;
import tk.jerryrat.mapper.TArticleMapper;
import tk.jerryrat.service.TArticleService;
@Service
public class TArticleServiceImpl implements TArticleService{

    @Resource
    private TArticleMapper tArticleMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tArticleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TArticle record) {
        return tArticleMapper.insert(record);
    }

    @Override
    public int insertSelective(TArticle record) {
        return tArticleMapper.insertSelective(record);
    }

    @Override
    public TArticle selectByPrimaryKey(Integer id) {
        return tArticleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TArticle record) {
        return tArticleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TArticle record) {
        return tArticleMapper.updateByPrimaryKey(record);
    }

}
