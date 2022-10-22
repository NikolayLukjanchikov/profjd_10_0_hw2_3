package pro.sky.profjd_10_0_hw2_3.service;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {
    @Override
    public String greetings() {
        return "<b>Добро пожаловать в калькулятор</b> <br> <br> <i> p.s. наш калькулятор умеет работать только с целыми числами </i>";
    }

    @Override
    public int calculateSum(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public int calculateSubtract(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public int calculateProduct(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public double calculateDivision(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Ошибка! На 0 не делим, введите другое второе число");
        }
        return num1.floatValue() / num2.floatValue();
    }
}
