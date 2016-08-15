package com.lvdouwa.daxue.web.dao;

import com.lvdouwa.daxue.core.generic.GenericDao;
import com.lvdouwa.daxue.web.domain.Jbxx;
import com.lvdouwa.daxue.web.domain.JbxxExample;

import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JbxxMapper extends GenericDao {
    int countByExample(JbxxExample example);

    int deleteByExample(JbxxExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(Jbxx record);

    int insertSelective(Jbxx record);

    List<Jbxx> selectByExample(JbxxExample example);

    Jbxx selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") Jbxx record, @Param("example") JbxxExample example);

    int updateByExample(@Param("record") Jbxx record, @Param("example") JbxxExample example);

    int updateByPrimaryKeySelective(Jbxx record);

    int updateByPrimaryKey(Jbxx record);

    ArrayList<Jbxx> queryByJbxxExample(Jbxx record);
}