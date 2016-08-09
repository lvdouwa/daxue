package com.lvdouwa.daxue.web.dao;

import com.lvdouwa.daxue.web.model.Fsx3;
import com.lvdouwa.daxue.web.model.Fsx3Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Fsx3Mapper {
    int countByExample(Fsx3Example example);

    int deleteByExample(Fsx3Example example);

    int insert(Fsx3 record);

    int insertSelective(Fsx3 record);

    List<Fsx3> selectByExample(Fsx3Example example);

    int updateByExampleSelective(@Param("record") Fsx3 record, @Param("example") Fsx3Example example);

    int updateByExample(@Param("record") Fsx3 record, @Param("example") Fsx3Example example);
}