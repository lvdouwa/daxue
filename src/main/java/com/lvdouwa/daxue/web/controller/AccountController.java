package com.lvdouwa.daxue.web.controller;

import com.lvdouwa.daxue.web.model.Jbxx;
import com.lvdouwa.daxue.web.service.JbxxService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by celine on 8/9/2016.
 */
@Controller
@RequestMapping("/account")
public class AccountController {
/*    @Resource
    private UserService userService;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ModelAndView login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession httpSession){
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        User rstUser =userService.findUserByNameAndPassword(user);
        if(rstUser!=null){
            httpSession.setAttribute("user",user);
            modelAndView.setViewName("/account/success");
            modelAndView.addObject(rstUser);

        }else{
            modelAndView.setViewName("/account/false");
        }
        return modelAndView;
    }*/
    @Resource
    private JbxxService jbxxService;
    @RequestMapping("/success")
    public String index(ModelMap modelMap){
        List<Jbxx> jbxxList = jbxxService.selectList();
        modelMap.addAttribute("jbxx",jbxxList.size());
        return "/account/success";
    }
}