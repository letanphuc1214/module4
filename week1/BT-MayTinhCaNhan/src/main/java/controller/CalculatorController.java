package controller;


import model.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/calcula")
    public String index() {
        return "index";
    }

    @PostMapping("/calculate")
    public String index(
            @RequestParam("firstOreprand") float firstOreprand,
            @RequestParam("secondOperand") float secondOperand,
            @RequestParam("operator") char operator,
            Model model
    ) {
        float result =Calculator.calculate(firstOreprand, secondOperand,operator);
        model.addAttribute("first-operand", firstOreprand);
        model.addAttribute("operator", operator);
        model.addAttribute("second-operand", secondOperand);
        model.addAttribute("result", result);
        return "calculator";
    }
}
