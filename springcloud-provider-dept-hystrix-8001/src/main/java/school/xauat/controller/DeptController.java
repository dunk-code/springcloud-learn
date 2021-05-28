package school.xauat.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Repository;
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
 * @description：服务熔断
 */

@RestController
public class DeptController {

    @Autowired
    DeptService deptService;

    @PostMapping("/dept/add/")
    public boolean addDept(Dept dept) {
        return deptService.insert(dept.getDname());
    }

    @GetMapping("/dept/get/{deptno}")
    //配置备选方案
    @HystrixCommand(fallbackMethod = "hystrixQueryById")
    public Dept queryById(@PathVariable Long deptno) {
        Dept dept = deptService.selectById(deptno);
        if (dept == null) {
            throw new RuntimeException("deptno===>" + deptno + "：不存在该用户");
        }
        return dept;
    }

    public Dept hystrixQueryById(@PathVariable Long deptno) {
        return new Dept().setDeptno(deptno)
                .setDname("ID==>"+deptno+"，没有对应的信息，为null---@Hystrix")
                .setDbSource("no this database in mysql");
    }

    @GetMapping("/dept/list")
    public List<Dept> list() {
        return deptService.list();
    }


}
