package com.haohao.dao.mapper;

import com.haohao.domain.TestBean;
import org.springframework.stereotype.Repository;

@Repository
public interface TestBeanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestBean record);

    int insertSelective(TestBean record);

    TestBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestBean record);

    int updateByPrimaryKey(TestBean record);
}