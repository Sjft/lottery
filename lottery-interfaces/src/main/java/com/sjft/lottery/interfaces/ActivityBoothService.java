package com.sjft.lottery.interfaces;

import com.sjft.lottery.Constants;
import com.sjft.lottery.Result;
import com.sjft.lottery.rpc.IActivityBoothService;
import com.sjft.lottery.rpc.dto.ActivityDto;
import com.sjft.lottery.rpc.req.ActivityReq;
import com.sjft.lottery.rpc.res.ActivityRes;
import com.sjft.lottery.dao.IActivityDao;
import com.sjft.lottery.model.Activity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author sift
 * @date 2022-02-25 00:19
 */
@Service
public class ActivityBoothService implements IActivityBoothService {

    @Resource
    private IActivityDao activityDao;

    @Override
    public ActivityRes queryActivityById(ActivityReq req) {
        Activity activity = activityDao.queryActivityById(req.getActivityId());

        ActivityDto activityDto = new ActivityDto();
        activityDto.setActivityId(activity.getActivityId());
        activityDto.setActivityName(activity.getActivityName());
        activityDto.setActivityDesc(activity.getActivityDesc());
        activityDto.setBeginDateTime(activity.getBeginDateTime());
        activityDto.setEndDateTime(activity.getEndDateTime());

        return new ActivityRes(new Result(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo()), activityDto);
    }
}
