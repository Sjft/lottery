package com.sjft.lottery.dao;

import com.sjft.lottery.model.Activity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author sift
 * @date 2022-02-23 23:52
 */
@Mapper
public interface IActivityDao {

    void insert(Activity req);

    Activity queryActivityById(Long activityId);

}
