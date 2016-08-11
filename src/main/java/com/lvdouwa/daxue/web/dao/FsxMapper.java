package com.lvdouwa.daxue.web.dao;

import com.lvdouwa.daxue.core.generic.GenericDao;
import com.lvdouwa.daxue.web.model.Fsx;
import java.util.List;

public interface FsxMapper extends GenericDao {
    int deleteByPrimaryKey(Integer tid);

    int insert(Fsx record);

    Fsx selectByPrimaryKey(Integer tid);

    List<Fsx> selectAll();

    int updateByPrimaryKey(Fsx record);
}