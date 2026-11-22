package com.sanjay.portfolio_backend.controller;

import com.sanjay.portfolio_backend.model.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
    @GetMapping("/api/profile")
    public Profile getProfile(){
        Profile profile = new Profile(
                "Sanjay Govind",
                "IOT Engineer",
                "Masters in Electronic and Computer Technology DCU"


        );

        return profile;
    }


}
