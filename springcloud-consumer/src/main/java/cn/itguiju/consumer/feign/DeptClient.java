package cn.itguiju.consumer.feign;

import cn.itguiju.springclound.feign.DeptApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("springclound-provider")
public interface DeptClient extends DeptApi {
}
