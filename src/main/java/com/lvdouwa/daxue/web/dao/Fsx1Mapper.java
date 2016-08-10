package com.lvdouwa.daxue.web.dao;

import com.lvdouwa.daxue.core.generic.GenericDao;
import com.lvdouwa.daxue.web.model.Fsx1;
import java.util.List;

public interface Fsx1Mapper extends GenericDao {
    int deleteByPrimaryKey(Integer tid);

    int insert(Fsx1 record);

    Fsx1 selectByPrimaryKey(Integer tid);

    List<Fsx1> selectAll();

    int updateByPrimaryKey(Fsx1 record);
}