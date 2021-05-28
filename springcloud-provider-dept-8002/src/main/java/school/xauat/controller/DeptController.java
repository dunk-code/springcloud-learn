package school.xauat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import school.xauat.pojo.Dept;
import school.xauat.service.DeptService;

import java.util.List;

/**
 * @author ：zsy
 * @date ：Created 2021/5/24 22:36
 * @description：提供服务接口
 */

@RestController
public class DeptController {

    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    DeptService deptService;

    @PostMapping("/dept/add/")
    public boolean addDept(Dept dept) {
        return deptService.insert(dept.getDname());
    }

    @GetMapping("/dept/get/{deptno}")
    public Dept queryById(@PathVariable long deptno) {
        return deptService.selectById(deptno);
    }

    @GetMapping("/dept/list")
    public List<Dept> list() {
        return deptService.list();
    }

    @GetMapping("/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        System.out.println(services.toString());
        List<ServiceInstance> instances = discoveryClient.getInstances("SPRINGCLOUD-PROVIDER-DEPT-8001");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getHost() + "\n" +
                    instance.getPort() + "\n" +
                    instance.getUri() + "\n" +
                    instance.getServiceId() + "\n" +
                    instance.getInstanceId()+ "\n");
        }
        return this.discoveryClient;
    }
}
