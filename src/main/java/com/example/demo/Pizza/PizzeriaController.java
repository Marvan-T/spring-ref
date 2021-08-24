package com.example.demo.Pizza;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/pizza")
public class PizzeriaController {
    private List<Pizza> pizzaList = List.of(
            new Pizza("Margeritta", 2.0),
            new Pizza("Napoletana", 6.0),
            new Pizza("Calzone", 4.0)
    );


    @GetMapping
    public ModelAndView test() {
        ModelAndView modelAndView = new ModelAndView("index")
                .addObject("name", "Pizza")
                .addObject("pizzas", pizzaList);
        return modelAndView;

    }




}
