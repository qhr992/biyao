package com.cmhzteam.controller.zhj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class listController {
    @RequestMapping("list")
    public ModelAndView showList(@RequestParam String ctype) {
        System.out.println(ctype);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("list");
        return mav;
    }
}
