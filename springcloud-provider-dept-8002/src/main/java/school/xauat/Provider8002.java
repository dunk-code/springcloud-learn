package school.xauat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：zsy
 * @date ：Created 2021/5/26 16:05
 * @description：启动类
 */
@SpringBootApplication
@EnableEurekaClient
public class Provider8002 {
    public static void main(String[] args) {
        SpringApplication.run(Provider8002.class, args);
    }
}
