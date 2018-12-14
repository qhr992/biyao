package com.cmhzteam.controller.zhj;

import com.cmhzteam.entity.zhj.Ptype;
import com.cmhzteam.service.zhj.indexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class indexController {

    @Autowired
    indexService service;
    @RequestMapping("/")
    public ModelAndView load() {
        System.out.println("hello");
        Map<String, Object> map = service.indexShow();

        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        mav.addObject("map", map);

        return mav;
    }

    @ResponseBody
    @RequestMapping("testqq")
    public List<Ptype> test() {
        List<Ptype> list = service.typeList();
        return list;
    }
}
