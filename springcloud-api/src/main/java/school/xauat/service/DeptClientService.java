package school.xauat.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import school.xauat.pojo.Dept;

import java.util.List;

/**
 * @author ：zsy
 * @date ：Created 2021/5/26 21:59
 * @description：Fegin的Service类
 */
@Service
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT", fallbackFactory = DeptServiceFallbackFactory.class)
public interface DeptClientService {


    @GetMapping("/dept/get/{deptno}")
    Dept selectById(Long deptno);

    @PostMapping("/dept/add/")
    boolean insert(String dname);

    @GetMapping("/dept/list")
    List<Dept> list();
}
