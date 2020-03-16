package com.dtz.controller;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/Test")
@Controller("TestController")
public class TestController {

    @RequestMapping("/welcome")
    public String welcome() {
        return "index";
    }
}
