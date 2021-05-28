package school.xauat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：zsy
 * @date ：Created 2021/5/25 20:34
 * @description：启动类
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"school.xauat"})//扫描提供的包
public class FeignConsumer80 {
    public static void main(String[] args) {
        SpringApplication.run(FeignConsumer80.class, args);
    }
}
