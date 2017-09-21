package com.company.project.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

@RequestMapping("/freemarker")
@Controller("template.freemarkerController")
public class WelcomeController {

    @RequestMapping("/welcome")
    public String welcome(Map<String,Object> model){
        model.put("time",new Date());
        model.put("message","hello baby");
        return "welcome";
    }

}
