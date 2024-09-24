package com.example.adb2c.spring_boot_login_azure_ad_b2c.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/user")
public class UserController {

    @GetMapping()
    @PreAuthorize("hasAuthority('readuser')")
    public ResponseEntity<String> getUserNormal() {
      return  ResponseEntity.ok("Get user details");
    }

    @PostMapping()
    @PreAuthorize("hasAuthority('SCOPE_updateuser')")
    public ResponseEntity<String> updateUserNormal() {
        return  ResponseEntity.ok("Update user details");
    }
}
