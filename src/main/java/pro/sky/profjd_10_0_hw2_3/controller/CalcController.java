package pro.sky.profjd_10_0_hw2_3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.profjd_10_0_hw2_3.service.CalcService;

@RestController
public class CalcController {
    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String showHelloWorld() {
        return calcService.hello();
    }

    @GetMapping("/calculator")
    private String calculator() {
        return calcService.greetings();
    }

    @GetMapping("/calculator/plus")
    private String calculateSum(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + calcService.calculateSum(num1, num2);
    }

    @GetMapping("/calculator/minus")

    private String calculateSubtract(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " - " + num2 + " = " + calcService.calculateSubtract(num1, num2);
    }

    @GetMapping("/calculator/multiply")
    private String calculateProduct(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + calcService.calculateProduct(num1, num2);
    }

    @GetMapping("/calculator/divide")
    private String calculateDivision(@RequestParam int num1, @RequestParam int num2) {
        if (num2 == 0) {
            return "Ошибка! На 0 не делим, введите другое число №2";
        }
        return num1 + " / " + num2 + " = " + calcService.calculateDivision(num1, num2);
    }
}
