package com.info.school.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name="users_info")
@Data
@Getter
@Setter
public class UsersInfoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private int age;
    @Column
    private String name;
    @Column
    private String password;

    private UsersInfoModel() {
    }

}
