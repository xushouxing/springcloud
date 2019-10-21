package cn.itguiju.consumer.feign.fallback;

import cn.itguiju.consumer.feign.DeptClient;
import cn.itguiju.springclound.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class DeptFallbackFactory implements FallbackFactory<DeptClient> {
    @Override
    public DeptClient create(Throwable throwable) {
        return new DeptClient() {
            @Override
            public Dept queryById(Long id) {
                return null;
            }
        };
    }
}
