package web.PreProject311.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/admin")
    public String adminPage() {
        return "admin";
    }

    @GetMapping("/admin/adminUser")
    public String adminUserPage() {
        return "adminUser";
    }

    @GetMapping("/user")
    public String userPage() {
        return "user";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}
