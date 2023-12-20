package com.yupoop.module.controller;

import com.yupoop.module.bean.Admin;
import com.yupoop.module.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: Qiongchao
 * @Version: 1.0.0
 * @Date: 2023/12/20
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Admin> getAdminList() {
        System.out.println("dada");
        return adminService.getAdminList();
    }
}
