package com.jun.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept {
    private long deptno;

    private String dname;
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
