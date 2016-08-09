package com.lvdouwa.daxue.web.dao;

import com.lvdouwa.daxue.core.generic.GenericDao;
import com.lvdouwa.daxue.web.model.Jbxx;
import org.springframework.stereotype.Repository;

@Repository
public interface JbxxMapper extends GenericDao {
    int deleteByPrimaryKey(Integer uid);

    int insert(Jbxx record);

    int insertSelective(Jbxx record);

    Jbxx selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Jbxx record);

    int updateByPrimaryKey(Jbxx record);
}