package school.xauat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import school.xauat.pojo.Dept;
import school.xauat.service.DeptClientService;

import java.util.List;

/**
 * @author ：zsy
 * @date ：Created 2021/5/25 20:26
 * @description：
 */
@RestController
public class DeptController {

    @Autowired
    DeptClientService deptClientService;


    @RequestMapping("/dept/consumer/add")
    public boolean addDept(Dept dept) {
        return deptClientService.insert(dept.getDname());
    }

    @RequestMapping("/dept/consumer/get/{deptno}")
    public Dept getById(@PathVariable Long deptno) {
        return deptClientService.selectById(deptno);
    }

    @RequestMapping("/dept/consumer/list")
    public List<Dept> list() {
        return deptClientService.list();
    }

}
