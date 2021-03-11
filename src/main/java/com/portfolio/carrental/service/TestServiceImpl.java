package com.portfolio.carrental.service;

import org.springframework.stereotype.Service;
import com.portfolio.carrental.mappers.TestMapper;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TestServiceImpl implements TestService {

    private TestMapper testMapper;

    @Override
    public String validateYesNo(String yesNoId) {
        Integer yesNo = Integer.parseInt(yesNoId);
        if (yesNo > 20080) {
            yesNoId = "8500";
        } else if (yesNo < 10000) {
            yesNoId = "30000";
        } else {
            yesNoId = "16000";
        }
        return testMapper.validateYesNo(yesNoId) > 0 ? "Y" : "N";
    }

}
