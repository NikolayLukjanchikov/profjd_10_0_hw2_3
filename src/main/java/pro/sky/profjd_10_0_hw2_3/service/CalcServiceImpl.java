package pro.sky.profjd_10_0_hw2_3.service;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService{
    public String hello() {
        return "Hi fromCalcServiceImpl";
    }

}
