package com.lvdouwa.daxue.web.dao;

import com.lvdouwa.daxue.web.model.Fsx1;
import com.lvdouwa.daxue.web.model.Fsx1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Fsx1Mapper {
    int countByExample(Fsx1Example example);

    int deleteByExample(Fsx1Example example);

    int insert(Fsx1 record);

    int insertSelective(Fsx1 record);

    List<Fsx1> selectByExample(Fsx1Example example);

    int updateByExampleSelective(@Param("record") Fsx1 record, @Param("example") Fsx1Example example);

    int updateByExample(@Param("record") Fsx1 record, @Param("example") Fsx1Example example);
}