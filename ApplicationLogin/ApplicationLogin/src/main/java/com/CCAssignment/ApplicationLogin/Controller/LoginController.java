package com.CCAssignment.ApplicationLogin.Controller;


import com.CCAssignment.ApplicationLogin.Form.LoginForm;
import com.CCAssignment.ApplicationLogin.Validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LoginController {

    @Autowired
    private UserValidator userValidator;

    @GetMapping("/login")
    public String getLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String Login(@ModelAttribute(name = "loginForm") LoginForm loginForm, Model model) {

        if (userValidator.validateUser(loginForm.getUsername(), loginForm.getPassword()))
            //return home page
            return "home";

        model.addAttribute("invalidCredentials", true);
        return "login";
    }
}
