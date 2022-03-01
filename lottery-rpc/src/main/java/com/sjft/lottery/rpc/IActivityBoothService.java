package com.sjft.lottery.rpc;

import com.sjft.lottery.rpc.req.ActivityReq;
import com.sjft.lottery.rpc.res.ActivityRes;

/**
 * @author sift
 * @date 2022-02-24 00:50
 */
public interface IActivityBoothService {

    ActivityRes queryActivityById(ActivityReq req);
}
