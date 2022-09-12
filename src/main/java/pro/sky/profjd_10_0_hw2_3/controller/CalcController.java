package pro.sky.profjd_10_0_hw2_3.controller;

import org.springframework.web.bind.annotation.GetMapping;
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
}
