package com.lvdouwa.daxue.web.controller;

import com.lvdouwa.daxue.web.model.Jbxx;
import com.lvdouwa.daxue.web.service.JbxxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.Console;
import java.util.logging.ConsoleHandler;

/**
 * Home Controller
 * Created by celine on 8/9/2016.
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    @Resource
    private JbxxService jbxxService;
    @RequestMapping("/index")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("message","Hello");
/*        System.out.println("home/index");
        ModelAndView modelAndView = new ModelAndView();
        Jbxx jbxx =jbxxService.selectById(1);
        if(jbxx!=null){
            httpSession.setAttribute("jbxx",jbxx);
            modelAndView.setViewName("/home/index");
            modelAndView.addObject(jbxx);

        }else{
            modelAndView.setViewName("/account/false");
        }*/
        return "/home/index";
    }
}
