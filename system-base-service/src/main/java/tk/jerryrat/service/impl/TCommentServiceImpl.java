package tk.jerryrat.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import tk.jerryrat.domain.TComment;
import tk.jerryrat.mapper.TCommentMapper;
import tk.jerryrat.service.TCommentService;
@Service
public class TCommentServiceImpl implements TCommentService{

    @Resource
    private TCommentMapper tCommentMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return tCommentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TComment record) {
        return tCommentMapper.insert(record);
    }

    @Override
    public int insertSelective(TComment record) {
        return tCommentMapper.insertSelective(record);
    }

    @Override
    public TComment selectByPrimaryKey(Integer id) {
        return tCommentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TComment record) {
        return tCommentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TComment record) {
        return tCommentMapper.updateByPrimaryKey(record);
    }

}
