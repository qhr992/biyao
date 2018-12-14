package com.cmhzteam.controller.zcf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShopcartController {
    @RequestMapping("test")
    public String test(Model model) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("1");
        list.add("2");
        model.addAttribute("prods", list);
        return "shopcars";
    }
}
