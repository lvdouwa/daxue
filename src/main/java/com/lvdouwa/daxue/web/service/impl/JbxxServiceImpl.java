package com.lvdouwa.daxue.web.service.impl;

import com.lvdouwa.daxue.core.generic.GenericDao;
import com.lvdouwa.daxue.core.generic.GenericServiceImpl;
import com.lvdouwa.daxue.web.dao.JbxxMapper;
import com.lvdouwa.daxue.web.domain.Jbxx;
import com.lvdouwa.daxue.web.service.JbxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by u6031313 on 8/9/2016.
 */
@Service("jbxxService")
public class JbxxServiceImpl implements JbxxService {

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

    public List<Jbxx> selectList() {
        return null;
    }

}
