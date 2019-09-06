package com.example.show.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "indent")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private Long water;
    private Long clothes;
    private Long shoe;
    private Long book;
    private Long basketball;
    private Long football;
    private Long food;
    private boolean go = false;
    private boolean get = false;


}
