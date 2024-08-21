package com.info.school.controller;

import com.info.school.model.UsersInfoModel;
import com.info.school.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/school")
public class SchoolController {


    @Autowired
    SchoolService schoolService;
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to School Application";
    }


    @GetMapping("/userInfo")
    public Optional<UsersInfoModel> userInfo(@RequestParam int id){
        return schoolService.getUserById(id);
    }


    @PostMapping("/addUser")
    public void userInfo(@RequestBody UsersInfoModel newUser){
        schoolService.addUser(newUser);
    }

}
