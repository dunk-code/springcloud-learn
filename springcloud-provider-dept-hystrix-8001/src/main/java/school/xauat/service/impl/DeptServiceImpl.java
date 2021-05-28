package school.xauat.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import school.xauat.mapper.DeptMapper;
import school.xauat.pojo.Dept;
import school.xauat.service.DeptService;

import java.util.List;

/**
 * @author ：zsy
 * @date ：Created 2021/5/24 22:16
 * @description：DeptService实现类
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Dept selectById(Long deptno) {
        return deptMapper.selectById(deptno);
    }

    @Override
    public boolean insert(String dname) {
        return deptMapper.insert(dname);
    }

    @Override
    public List<Dept> list() {
        return deptMapper.list();
    }
}
