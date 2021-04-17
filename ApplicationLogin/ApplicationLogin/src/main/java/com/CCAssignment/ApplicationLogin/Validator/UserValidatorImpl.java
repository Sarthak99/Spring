package com.CCAssignment.ApplicationLogin.Validator;

import org.springframework.stereotype.Service;

@Service
public class UserValidatorImpl implements UserValidator {

    public boolean validateUser(String userName, String password) {

        boolean valid = false;

        if(userName.equals("admin") && password.equals("admin")) {
            valid = true;
        }
        return valid;
    }
}
