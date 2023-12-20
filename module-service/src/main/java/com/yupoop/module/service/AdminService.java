package com.yupoop.module.service;

import com.yupoop.module.bean.Admin;
import com.yupoop.module.dao.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: Qiongchao
 * @Version: 1.0.0
 * @Date: 2023/12/20
 */
@Service
public class AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Transactional
    public List<Admin> getAdminList(){
        return adminMapper.getAdminList();
    }
}
