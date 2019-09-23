package com.github.wangfeng.springboot.mybatis.multiple.datasource.mapper.primary;

import com.github.wangfeng.springboot.mybatis.multiple.datasource.entity.LuckBagDO;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LuckBagMapper1 {
    int deleteByPrimaryKey(Long id);

    int insert(LuckBagDO record);

    int insertSelective(LuckBagDO record);

    LuckBagDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LuckBagDO record);

    int updateByPrimaryKey(LuckBagDO record);

    int countUserTotalUsedBagTimes(@Param("userId") int userId,
            @Param("activityId") String activityId);

    Integer countUserLuckBagNumber(@Param("userId") Integer userId,
            @Param("activityId") String activityId, @Param("bagIndex") Integer index);

    Integer countLuckBagTotalNumber(@Param("activityId") String activityId,
            @Param("bagIndex") Integer index);

    List<LuckBagDO> pageSelect(@Param("activityId") String activityId,
            @Param("bagIndex") Integer bagIndex, @Param("minId") Long minId);

    List<LuckBagDO> countEveryBagTotalNumber(@Param("activityId") String activityId);

    List<LuckBagDO> countUserEveryBagTotalNumber(@Param("userId") Integer userId,
            @Param("activityId") String activityId);

    void updateTotalBagNumber(@Param("userId") Integer userId,
            @Param("activityId") String activityId,
            @Param("bagIndex") Integer bagIndex, @Param("totalNumber") int totalNumber);

}