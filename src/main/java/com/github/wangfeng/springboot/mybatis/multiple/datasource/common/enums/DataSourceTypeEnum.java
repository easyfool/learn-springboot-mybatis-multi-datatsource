package com.github.wangfeng.springboot.mybatis.multiple.datasource.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum DataSourceTypeEnum {
    DB1("db1", ""), DB2("db2", "");
    private String code;
    private String description;

}
