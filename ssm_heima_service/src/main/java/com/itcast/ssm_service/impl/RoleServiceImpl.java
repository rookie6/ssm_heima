package com.itcast.ssm_service.impl;

import com.itcast.ssm_dao.IRoleDao;
import com.itcast.ssm_domain.Permission;
import com.itcast.ssm_domain.Role;
import com.itcast.ssm_service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private IRoleDao roleDao;

    public List<Role> findAll() throws Exception {
        return roleDao.findAll();
    }

    public void save(Role role) throws Exception {
        roleDao.save(role);
    }

    public Role findById(Integer roleId) {
        return roleDao.findById(roleId);
    }

    public List<Permission> findOtherPermissions(Integer roleId) {
        return roleDao.findOtherPermissions(roleId);
    }

    public void addPermissionToRole(Integer roleId, Integer[] permissionIds) {
        for (Integer permissionId:permissionIds) {
            roleDao.addPermissionToRole(roleId,permissionId);
        }
    }
}
