package com.lvdouwa.daxue.web.dao;

import com.lvdouwa.daxue.core.generic.GenericDao;
import com.lvdouwa.daxue.web.model.Fsx3;
import java.util.List;

public interface Fsx3Mapper extends GenericDao {
    int deleteByPrimaryKey(Integer tid);

    int insert(Fsx3 record);

    Fsx3 selectByPrimaryKey(Integer tid);

    List<Fsx3> selectAll();

    int updateByPrimaryKey(Fsx3 record);
}