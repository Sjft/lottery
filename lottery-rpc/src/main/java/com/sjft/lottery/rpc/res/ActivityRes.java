package com.sjft.lottery.rpc.res;

import com.sjft.lottery.Result;
import com.sjft.lottery.rpc.dto.ActivityDto;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author sift
 * @date 2022-02-25 00:01
 */
@Data
@AllArgsConstructor
public class ActivityRes implements Serializable {

    private Result result;

    private ActivityDto activity;

}
