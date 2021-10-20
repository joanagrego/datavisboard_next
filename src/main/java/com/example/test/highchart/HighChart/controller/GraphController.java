package com.example.test.highchart.HighChart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.LinkedHashMap;
import java.util.Map;

@Controller
public class GraphController {

    @GetMapping("/barChart")
    public String barChart(Model model){

        Map<String, Integer> data = new LinkedHashMap<String, Integer>();
        data.put("Thaynam", 11);
        data.put("Joana", 21);
        data.put("Carlos", 31);
        data.put("Cadu", 41);
        model.addAttribute("keySet", data.keySet());
        model.addAttribute("values",data.values());

        model.addAttribute("beltrano",39.5);
        model.addAttribute("mevio",20.5);
        model.addAttribute("ticio",29.1);

        return "barChart";
    }

    @GetMapping("/pieChart")
    public String piChart(Model model){

        Map<String, Integer> data = new LinkedHashMap<String, Integer>();
        data.put("Thaynam", 11);
        data.put("Joana", 21);
        data.put("Carlos", 31);
        data.put("Cadu", 41);
        model.addAttribute("keySet", data.keySet());
        model.addAttribute("values",data.values());

        model.addAttribute("REP. BELTRANO",39.5);
        model.addAttribute("REP. MEVIO",20.5);
        model.addAttribute("REP. TICIO",29.1);

        return "pieChart";
    }
}
