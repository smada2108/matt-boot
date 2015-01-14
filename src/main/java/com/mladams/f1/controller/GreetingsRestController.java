package com.mladams.f1.controller;

import com.mladams.f1.data.Driver;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsRestController {

    @RequestMapping("/drivers")
    public Driver index(final Model model) {
        final Driver driver = new Driver();
        driver.setFirstName("Lewis");
        driver.setSurname("Hamilton");
        driver.setNationality("British");
        return driver;
    }
}
