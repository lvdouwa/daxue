package com.lvdouwa.daxue.web.service.impl;

import com.lvdouwa.daxue.core.generic.GenericDao;
import com.lvdouwa.daxue.core.generic.GenericServiceImpl;
import com.lvdouwa.daxue.web.dao.JbxxMapper;
import com.lvdouwa.daxue.web.model.Jbxx;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by DYF-THINK on 2016/8/11.
 */
@Service("jbxxService")
public class JbxxQueryServiceImpl extends GenericServiceImpl<Jbxx,Integer> implements JbxxQueryService {

    @Resource
    private JbxxMapper jbxxMapper;

    @Override
    public int insert(Jbxx jbxx) {
        return jbxxMapper.insertSelective(jbxx);
    }

    @Override
    public int delete(Integer id) {
        return jbxxMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(Jbxx jbxx) {
        return jbxxMapper.updateByPrimaryKey(jbxx);
    }

    @Override
    public Jbxx selectById(Integer id) {
        return jbxxMapper.selectByPrimaryKey(id);
    }

    @Override
    public GenericDao<Jbxx, Integer> getDao() {
        return jbxxMapper;
    }

}
