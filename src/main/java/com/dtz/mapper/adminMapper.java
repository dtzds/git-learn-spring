package com.dtz.mapper;

import com.dtz.bean.Admin;

import java.util.List;

public interface adminMapper {
    public List<Admin> selectAdmin();
    public int addAdmin(Admin admin);
}
