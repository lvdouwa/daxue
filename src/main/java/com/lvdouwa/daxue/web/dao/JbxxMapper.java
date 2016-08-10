package com.lvdouwa.daxue.web.dao;

import com.lvdouwa.daxue.core.generic.GenericDao;
import com.lvdouwa.daxue.web.model.Jbxx;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface JbxxMapper extends GenericDao {
    int deleteByPrimaryKey(Integer uid);

    int insert(Jbxx record);

    Jbxx selectByPrimaryKey(Integer uid);

    List<Jbxx> selectAll();

    int updateByPrimaryKey(Jbxx record);
}