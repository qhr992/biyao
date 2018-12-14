package com.cmhzteam.controller.lyp;

import com.cmhzteam.entity.lyp.GoodDetail;
import com.cmhzteam.entity.lyp.GoodMainParam;
import com.cmhzteam.service.lyp.impl.GoodDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/goodDetail")
public class GoodDetailController {
    @Autowired
    GoodDetailServiceImpl service;

    @RequestMapping("/finddg")
    public String findGoodDetail(int gid, Model model) {
        List<GoodDetail> list = service.findGoodDetail(gid);
        for (GoodDetail goodDetail : list) {
            System.out.println(goodDetail);
        }
        model.addAttribute("goodDetail", list);
        return "product";
    }

    @RequestMapping("/findgp")
    public String findGoodParam(int gid, Model model) {
        List<GoodMainParam> list = service.findGoodParam(gid);
        for (GoodMainParam goodMainParam : list) {
            System.out.println(goodMainParam);
        }
        model.addAttribute("goodParam", list);
        return "lyptest";
    }
}
