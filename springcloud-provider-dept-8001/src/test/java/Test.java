import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import school.xauat.controller.DeptController;
import school.xauat.mapper.DeptMapper;
import school.xauat.pojo.Dept;
import school.xauat.service.DeptService;

/**
 * @author ：zsy
 * @date ：Created 2021/5/24 22:13
 * @description：
 */
@SpringBootTest
public class Test {

    @Autowired
    DeptService deptService;

    @Autowired
    DeptMapper deptMapper;

    /*@org.junit.Test
    public void Test() {
        System.out.println(deptMapper);
        System.out.println(deptService);
        Dept dept = deptService.selectById(1l);
        System.out.println(dept);
    }*/
}
