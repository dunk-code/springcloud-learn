package school.myrule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * @author ：zsy
 * @date ：Created 2021/5/26 21:05
 * @description：自定义随机负载均衡策略
 */
public class MyRandomRule extends AbstractLoadBalancerRule {

    private int total = 0;
    private int curIndex = 0;

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }

    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        }
        Server server = null;

        while (server == null) {
            if (Thread.interrupted()) {
                return null;
            }
            List<Server> upList = lb.getReachableServers(); //获取档期啊存活的服务
            List<Server> allList = lb.getAllServers();//获取当前所有的服务

            int serverCount = allList.size();
            if (serverCount == 0) {
                return null;
            }

            if (total < 5) {
                total++;
            } else {
                total = 0;
                curIndex++;
                curIndex = curIndex % upList.size();
            }
            server = upList.get(curIndex);

            if (server == null) {
                Thread.yield();
                continue;
            }
            if (server.isAlive()) {
                return (server);
            }
            server = null;
            Thread.yield();
        }

        return server;

    }

    @Override
    public Server choose(Object key) {
        return choose(getLoadBalancer(), key);
    }
}
