package com.itcast.ssm_dao;

import com.itcast.ssm_domain.Member;
import org.apache.ibatis.annotations.Select;

public interface IMemberDao {

    @Select("select * from `member` where id=#{id}")
    public Member findById(Integer id);
}
