package school.xauat;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;

/**
 * @author ：zsy
 * @date ：Created 2021/5/24 23:00
 * @description：
 */
@EnableEurekaClient //开启Eureka注册
@SpringBootApplication
@EnableDiscoveryClient //可以忽略
@EnableHystrix
public class ProviderHystrix8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderHystrix8001.class, args);
    }

    // 增加一个Servlet
    @Bean
    public ServletRegistrationBean hystrixMetricsStreamServlet(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new HystrixMetricsStreamServlet());
            registrationBean.addUrlMappings("/actuator/hystrix.stream");
        return registrationBean;
    }
}
