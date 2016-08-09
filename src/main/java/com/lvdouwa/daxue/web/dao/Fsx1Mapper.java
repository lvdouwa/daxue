package com.lvdouwa.daxue.web.dao;

import com.lvdouwa.daxue.core.generic.GenericDao;
import com.lvdouwa.daxue.web.model.Fsx1;

public interface Fsx1Mapper extends GenericDao {
    int insert(Fsx1 record);

    int insertSelective(Fsx1 record);
}