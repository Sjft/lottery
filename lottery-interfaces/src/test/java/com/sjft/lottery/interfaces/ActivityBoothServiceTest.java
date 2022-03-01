package com.sjft.lottery.interfaces;

import com.sjft.lottery.rpc.IActivityBoothService;
import com.sjft.lottery.rpc.req.ActivityReq;
import com.sjft.lottery.rpc.res.ActivityRes;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@Slf4j
@SpringBootTest
class ActivityBoothServiceTest {

    @Autowired
    private IActivityBoothService activityBoothService;

    @Test
    void queryActivityById() {
        ActivityReq req = new ActivityReq();
        req.setActivityId(100001L);

        ActivityRes result = activityBoothService.queryActivityById(req);
        log.info("测试结果：{}", result);

    }
}