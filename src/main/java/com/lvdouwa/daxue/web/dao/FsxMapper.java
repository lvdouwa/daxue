package com.lvdouwa.daxue.web.dao;

import com.lvdouwa.daxue.core.generic.GenericDao;
import com.lvdouwa.daxue.web.domain.Fsx;
import com.lvdouwa.daxue.web.domain.FsxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FsxMapper extends GenericDao {
    int countByExample(FsxExample example);

    int deleteByExample(FsxExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(Fsx record);

    int insertSelective(Fsx record);

    List<Fsx> selectByExample(FsxExample example);

    Fsx selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") Fsx record, @Param("example") FsxExample example);

    int updateByExample(@Param("record") Fsx record, @Param("example") FsxExample example);

    int updateByPrimaryKeySelective(Fsx record);

    int updateByPrimaryKey(Fsx record);
}