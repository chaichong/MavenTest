package cn.cc.web;

import cn.cc.entity.User;
import cn.cc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by CC on 17/7/22.
 */
@Component
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index")
    public String toIndex(ModelAndView model){
        return "login";
    }

    @RequestMapping(value = "/login")
    public String checkAndLogin(User user, Model model){
        User loginUser = userService.getUserEntityByAccount(user);
        if (loginUser != null){
            if (user.getPassword() != null && user.getPassword().equals(loginUser.getPassword())){
                return "index";
            }
        }
        return "error";

    }
}
