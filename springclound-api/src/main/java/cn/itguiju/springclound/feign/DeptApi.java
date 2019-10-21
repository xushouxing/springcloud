package cn.itguiju.springclound.feign;

import cn.itguiju.springclound.pojo.Dept;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface DeptApi {
    @GetMapping("query/{id}")
    public Dept queryById(@PathVariable("id")Long id);
}
