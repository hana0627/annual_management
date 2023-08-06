package com.hana.annual.application.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class UserAccount {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;
    @Column(nullable = false, length = 20)
    private String userCode; // 유저코드(키값으로 활용할 예정)

    private Integer workingYear; //년차

    @Column(length = 1000)
    private String meno;


    public static UserAccount of (String name, String userCode, Integer workingYear, String memo){
        return new UserAccount(name, userCode, workingYear, memo);
    }

    private UserAccount(String name, String userCode, Integer workingYear, String meno) {
        this.name = name;
        this.userCode = userCode;
        this.workingYear = workingYear;
        this.meno = meno;
    }
}
