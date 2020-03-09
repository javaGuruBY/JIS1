package com.vladis1350.controller;

import com.vladis1350.service.GenerateRandomArrays;
import com.vladis1350.service.LookupArrayService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LookupArrayServiceController {

    int[] array = {1, 6, 9, 7, 3, 2, 4, -14, -2, 17};

    @GetMapping("/task1")
    public String performance(LookupArrayService lookupArrayService, Model model) {
        model.addAttribute("myArray", lookupArrayService.arrayToString(array));
        model.addAttribute("maxValue", lookupArrayService.findMax(array));
        model.addAttribute("minValue", lookupArrayService.findMin(array));
        model.addAttribute("indexOfMax", lookupArrayService.indexOfMax(array));
        model.addAttribute("indexOfMin", lookupArrayService.indexOfMin(array));
        model.addAttribute("indexOf", lookupArrayService.indexOf(array, -2));

        return "task1";
    }

}
