package school.xauat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import school.myrule.MyRule;

/**
 * @author ：zsy
 * @date ：Created 2021/5/25 20:34
 * @description：启动类
 */
@EnableEurekaClient
@SpringBootApplication
// 在微服务启动的时候，就能够去去加载我们自定义的Ribbon类
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT", configuration = MyRule.class)
public class Consumer80 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer80.class, args);
    }
}
