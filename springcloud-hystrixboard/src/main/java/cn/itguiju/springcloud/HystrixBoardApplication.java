package cn.itguiju.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixBoardApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixBoardApplication.class,args);
    }
}
