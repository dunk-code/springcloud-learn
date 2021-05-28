package school.xauat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：zsy
 * @date ：Created 2021/5/25 19:29
 * @description：Eureka启动类
 */
@SpringBootApplication
@EnableEurekaServer //Eureka启动类
public class EurekaServer_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7001.class, args);
    }
}
