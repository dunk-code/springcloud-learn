package school.xauat.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import school.xauat.pojo.Dept;

import java.util.List;

/**
 * @author ：zsy
 * @date ：Created 2021/5/27 17:10
 * @description：失败回调工厂
 */
@Component
public class DeptServiceFallbackFactory implements FallbackFactory {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept selectById(Long deptno) {
                return new Dept()
                        .setDeptno(deptno)
                        .setDname("id==>"+deptno+"，没有对应的信息，客户端提供了降级的信息，这个服务现在已经被关闭")
                        .setDbSource("没有数据");
            }

            @Override
            public boolean insert(String dname) {
                return false;
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
