package com.itcast.ssm_dao;

import com.itcast.ssm_domain.Permission;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IPermissionDao {

    @Select("select * from permission where id in (select permissionId from role_permission where roleId=#{id})")
    public List<Permission> findPermissionByRoleId(Integer id) throws Exception;

    @Select("select * from permission")
    List<Permission> findAll() throws Exception;

    @Select("insert into permission(permissionName,url) values(#{permissionName},#{url})")
    void save(Permission permission) throws Exception;
}
