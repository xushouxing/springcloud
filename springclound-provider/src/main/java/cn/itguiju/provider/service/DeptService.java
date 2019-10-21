package cn.itguiju.provider.service;

import cn.itguiju.provider.mapper.DeptMapper;
import cn.itguiju.springclound.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptService {
    @Autowired
    private DeptMapper deptMapper;

    public Dept queryById(Long id) {
        return deptMapper.selectByPrimaryKey(id);
    }
}
