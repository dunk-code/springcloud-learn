package school.xauat.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 import org.springframework.web.client.RestTemplate;

 /**
 * @author ：zsy
 * @date ：Created 2021/5/25 20:27
 * @description：配置RestTemplate
 */
@Configuration
public class ConfigBean {
     //配置负载均衡实现restTemplate
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    /*@Bean
     public IRule getIRule() {
        return new RandomRule();
    }*/
}
