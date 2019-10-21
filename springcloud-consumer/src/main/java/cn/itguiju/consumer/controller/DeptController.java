package cn.itguiju.consumer.controller;

import cn.itguiju.springclound.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DeptController {
    private static final String REST_URL_PREFIX="http://springclound-provider";
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("query/{id}")
    public Dept queryById(@PathVariable("id")Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/query/"+id,Dept.class);
    }
}
