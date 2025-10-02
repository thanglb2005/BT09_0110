package vn.hcmute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping({"/", "/login"})
    public String loginPage() {
        return "forward:/login.html";
    }

    @GetMapping("/profile")
    public String profilePage() {
        return "forward:/profile.html";
    }
}


