package net.cn.mgw.provide.user.controller;

import net.cn.mgw.provide.user.entity.User;
import net.cn.mgw.provide.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@Controller
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private UserService userServ;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("test/index");
        return mv;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public void add(HttpServletResponse res, User user) throws Exception {
        Date date = new Date();
        user.setAddTime(date);
        user.setLastUpdateTime(date);
        user.setIsLock(0);
        user.setIsDelete(0);
        this.userServ.insert(user);
    }

}
