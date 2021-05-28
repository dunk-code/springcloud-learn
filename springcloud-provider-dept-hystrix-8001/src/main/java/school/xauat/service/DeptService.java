package school.xauat.service;

import school.xauat.pojo.Dept;

import java.util.List;

public interface DeptService {

    Dept selectById(Long deptno);

    boolean insert(String dname);

    List<Dept> list();
}
