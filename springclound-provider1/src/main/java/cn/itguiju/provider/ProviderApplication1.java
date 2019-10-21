package cn.itguiju.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("cn.itguiju.provider.mapper")
public class ProviderApplication1{
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication1.class,args);
    }
}
