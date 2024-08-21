package com.info.school.service;

import com.info.school.model.UsersInfoModel;
import com.info.school.repo.UsersInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SchoolService {

    @Autowired
    UsersInfoRepo userRepo;

    public Optional<UsersInfoModel> getUserById(int i){
        return userRepo.findById(i);
    }

    public void addUser(UsersInfoModel newUser) {
        userRepo.save(newUser);
    }
}
