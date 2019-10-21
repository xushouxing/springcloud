package cn.itguiju.provider.mapper.controller;

import cn.itguiju.provider.service.DeptService;
import cn.itguiju.springclound.pojo.Dept;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;
    @GetMapping("query/{id}")
    public Dept queryById(@PathVariable("id")Long id){
        return deptService.queryById(id);
    }
}
