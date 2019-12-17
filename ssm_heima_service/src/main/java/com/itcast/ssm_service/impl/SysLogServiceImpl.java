package com.itcast.ssm_service.impl;

import com.itcast.ssm_dao.ISysLogDao;
import com.itcast.ssm_domain.SysLog;
import com.itcast.ssm_service.ISysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SysLogServiceImpl implements ISysLogService {

    @Autowired
    private ISysLogDao sysLogDao;

    public void save(SysLog sysLog) throws Exception {
        sysLogDao.save(sysLog);
    }

    public List<SysLog> findAll() throws Exception {
        return sysLogDao.findAll();
    }
}
