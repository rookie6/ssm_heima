package com.itcast.ssm_service;

import com.itcast.ssm_domain.Permission;

import java.util.List;

public interface IPermissionService {
    List<Permission> findAll() throws Exception;

    void save(Permission permission) throws Exception;
}
