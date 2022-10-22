package pro.sky.profjd_10_0_hw2_3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.profjd_10_0_hw2_3.service.CalcService;

@RestController

@RequestMapping("/calculator")
public class CalcController {
    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    private String calculator() {
        return calcService.greetings();
    }

    @GetMapping("/plus")
    private String calculateSum(@RequestParam(required=false) Integer num1, @RequestParam(required=false) Integer num2) {
        if (num1 == null || num2 == null){
            return "Введите 2 числа";
        }
        return num1 + " + " + num2 + " = " + calcService.calculateSum(num1, num2);
    }

    @GetMapping("/minus")

    private String calculateSubtract(@RequestParam(required=false) Integer num1, @RequestParam(required=false) Integer num2) {
        if (num1 == null || num2 == null){
            return "Введите 2 числа";
        }
        return num1 + " - " + num2 + " = " + calcService.calculateSubtract(num1, num2);
    }

    @GetMapping("/multiply")
    private String calculateProduct(@RequestParam(required=false) Integer num1, @RequestParam(required=false) Integer num2) {
        if (num1 == null || num2 == null){
            return "Введите 2 числа";
        }
        return num1 + " * " + num2 + " = " + calcService.calculateProduct(num1, num2);
    }

    @GetMapping("/divide")
    private String calculateDivision(@RequestParam(required=false) Integer num1, @RequestParam(required=false) Integer num2) {
        if (num1 == null || num2 == null){
            return "Введите 2 числа";
        }
        return num1 + " / " + num2 + " = " + calcService.calculateDivision(num1, num2);
    }
}
