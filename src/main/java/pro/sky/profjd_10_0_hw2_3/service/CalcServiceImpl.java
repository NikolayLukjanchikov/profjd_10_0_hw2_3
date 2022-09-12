package pro.sky.profjd_10_0_hw2_3.service;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {
    public String hello() {
        return "Домашка 2.3";
    }

    @Override
    public String greetings() {
        return "<b>Добро пожаловать в калькулятор</b> <br> <br> <i> p.s. наш калькулятор умеет работать только с целыми числами </i>";
    }

    @Override
    public int calculateSum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int calculateSubtract(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int calculateProduct(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int calculateDivision(int num1, int num2) {
        return num1 / num2;
    }
}
