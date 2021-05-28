package school.xauat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import school.xauat.pojo.Dept;

import java.util.List;

/**
 * @author ：zsy
 * @date ：Created 2021/5/25 20:26
 * @description：
 */
@RestController
public class DeptController {

    @Autowired
    RestTemplate restTemplate;

    //private static final String URL_PREFIX = "http://localhost:8001/dept";
    private static final String URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT/dept";

    @RequestMapping("/dept/consumer/add")
    public boolean addDept(Dept dept) {
        return restTemplate.postForObject(URL_PREFIX + "/add", dept, Boolean.class);
    }

    @RequestMapping("/dept/consumer/get/{deptno}")
    public Dept getById(@PathVariable Long deptno) {
        return restTemplate.getForObject(URL_PREFIX + "/get/" + deptno, Dept.class);
    }

    @RequestMapping("/dept/consumer/list")
    public List<Dept> list() {
        return restTemplate.getForObject(URL_PREFIX + "/list", List.class);
    }

}
