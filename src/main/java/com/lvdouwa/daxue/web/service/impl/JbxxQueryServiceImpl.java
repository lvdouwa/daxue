package com.lvdouwa.daxue.web.service.impl;

import com.lvdouwa.daxue.web.dao.JbxxMapper;
import com.lvdouwa.daxue.web.domain.Jbxx;
import com.lvdouwa.daxue.web.service.JbxxService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DYF-THINK on 2016/8/15.
 */
public class JbxxQueryServiceImpl implements JbxxService {

    @Autowired
    private JbxxMapper jbxxMapper;


    public int insert(Jbxx jbxx) {
        return 0;
    }

    public int update(Jbxx jbxx) {
        return 0;
    }

    public int delete(Integer id) {
        return 0;
    }

    public Jbxx selectById(Integer id) {
        return jbxxMapper.selectByPrimaryKey(id);
    }

    public Jbxx selectOne() {
        return null;
    }

    public ArrayList<Jbxx> queryByJbxx(Jbxx jbxx){ return jbxxMapper.queryByJbxxExample(jbxx); }

    public List<Jbxx> selectList() {
        return null;
    }

}
