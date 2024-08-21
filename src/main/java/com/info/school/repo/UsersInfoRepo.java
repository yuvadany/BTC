package com.info.school.repo;

import com.info.school.model.UsersInfoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersInfoRepo extends JpaRepository<UsersInfoModel, Integer> {

}
