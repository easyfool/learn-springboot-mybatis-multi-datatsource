package com.wangfengbabe.learn.springboot.mybatis.multi.datasource.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LuckBagDO {
    private Long id;

    private String activityId;

    private Integer userId;

    private Integer bagIndex;

    private Integer bagNumber;

    private Date inserttime;

    private Date updatetime;

    private Boolean isactive;

    private Integer totalNumber;


}