package com.cmhzteam.controller;

import com.cmhzteam.entity.Test;
import com.cmhzteam.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class testController {

    @Autowired
    TestService testService;
    @RequestMapping("/text")
    public String text(){
        return "list";
    }
    @RequestMapping("/{test}")
    public String test(@PathVariable("test") String test){
        System.out.println(test);
        return test;
    }

    @ResponseBody
    @RequestMapping("/test/page")
    public List<Test> getList() {
        List<Test> itemByPage = testService.findItemByPage(1, 5);
        return itemByPage;
    }
}
