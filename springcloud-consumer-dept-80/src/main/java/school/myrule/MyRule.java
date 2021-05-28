package school.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：zsy
 * @date ：Created 2021/5/26 21:03
 * @description：自定义负载均衡策略入口
 */
@Configuration
public class MyRule {

    @Bean
    public IRule zsyRule() {
        return new MyRandomRule();
    }
}
