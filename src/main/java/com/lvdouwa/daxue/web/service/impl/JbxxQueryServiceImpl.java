package com.lvdouwa.daxue.web.service.impl;

import com.lvdouwa.daxue.core.generic.GenericDao;
import com.lvdouwa.daxue.core.generic.GenericServiceImpl;
import com.lvdouwa.daxue.web.dao.JbxxMapper;
import com.lvdouwa.daxue.web.model.Jbxx;
import com.lvdouwa.daxue.web.service.JbxxQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by DYF-THINK on 2016/8/11.
 */
@Service("jbxxQueryService")
public class JbxxQueryServiceImpl implements JbxxQueryService {

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
        return null;
    }

    public Jbxx selectOne() {
        return null;
    }

    public List<Jbxx> selectList() {
        return null;
    }
}
