package school.xauat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：zsy
 * @date ：Created 2021/5/24 23:00
 * @description：
 */
@EnableEurekaClient //开启Eureka注册
@SpringBootApplication
@EnableDiscoveryClient //可以忽略
public class Provider8003 {
    public static void main(String[] args) {
        SpringApplication.run(Provider8003.class, args);
    }
}
