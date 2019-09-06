package com.example.show.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "User_Lnfo")
public class UserLnfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String username;
    private String password;
    private String sex;
    private String email;
    @Column(name = "Phone_Number")
    private String phoneNumber;


}
