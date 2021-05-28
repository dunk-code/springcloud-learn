package school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
    import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author ：zsy
 * @date ：Created 2021/5/27 19:24
 * @description：监控页面启动类
 */

@SpringBootApplication
//开启监控页面
@EnableHystrixDashboard
public class DeptConsumerDashboard {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDashboard.class, args);
    }
}
