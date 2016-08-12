package com.lvdouwa.daxue.web.service.impl;

import com.lvdouwa.daxue.core.generic.GenericDao;
import com.lvdouwa.daxue.core.generic.GenericServiceImpl;
import com.lvdouwa.daxue.web.dao.JbxxMapper;
import com.lvdouwa.daxue.web.model.Jbxx;
import com.lvdouwa.daxue.web.service.JbxxQueryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.ArrayList;

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

    //notice: not override
    public  ArrayList<Jbxx> queryByJbxx( Jbxx jbxx){ return jbxxMapper.queryByJbxxExample(jbxx); }


    @Override
    public GenericDao<Jbxx, Integer> getDao() {
        return jbxxMapper;
    }

}
