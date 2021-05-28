package school.xauat.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import school.xauat.pojo.Dept;

import java.util.List;

@Mapper
@Repository
public interface DeptMapper {

    Dept selectById(Long deptno);

    boolean insert(String dname);

    List<Dept> list();
}
