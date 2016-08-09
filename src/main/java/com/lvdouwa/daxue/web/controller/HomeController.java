package com.lvdouwa.daxue.web.controller;

import com.lvdouwa.daxue.web.model.Jbxx;
import com.lvdouwa.daxue.web.service.JbxxService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Home Controller
 * Created by celine on 8/9/2016.
 */
@Controller
public class HomeController {
    @Resource
    private JbxxService jbxxService;
    @RequestMapping("/home")
    public ModelAndView index(HttpSession httpSession){
        ModelAndView modelAndView = new ModelAndView();
        Jbxx jbxx =jbxxService.selectById(1);
        if(jbxx!=null){
            httpSession.setAttribute("jbxx",jbxx);
            modelAndView.setViewName("/home/index");
            modelAndView.addObject(jbxx);

        }else{
            modelAndView.setViewName("/account/false");
        }
        return modelAndView;
    }
}
