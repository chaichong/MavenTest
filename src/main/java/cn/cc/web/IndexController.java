package cn.cc.web;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by CC on 17/7/22.
 */
@Component
@RequestMapping("/index")
public class IndexController {

    @RequestMapping(value = "/index")
    public String toIndex(ModelAndView model){
        return "index";
    }
}
