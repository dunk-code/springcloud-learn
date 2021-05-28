package school.xauat.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author ：zsy
 * @date ：Created 2021/5/24 20:43
 * @description：部门类
 */
@Data
@NoArgsConstructor
@ToString
@Accessors(chain = true) //链式写法
public class Dept implements Serializable {
    private Long deptno;
    private String dname;
    private String dbSource;

    public Dept(String dname) {
        this.dname = dname;
    }
}
