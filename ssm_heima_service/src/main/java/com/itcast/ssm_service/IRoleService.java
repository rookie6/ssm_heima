package com.itcast.ssm_service;

import com.itcast.ssm_domain.Permission;
import com.itcast.ssm_domain.Role;

import java.util.List;

public interface IRoleService {

    public List<Role> findAll() throws Exception;

    void save(Role role) throws Exception;

    Role findById(Integer roleId);

    List<Permission> findOtherPermissions(Integer roleId);

    void addPermissionToRole(Integer roleId, Integer[] permissionIds);
}
