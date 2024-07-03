package com.stocktrading.domain;

import com.stocktrading.global.BaseTimeEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PROTECTED;

@Entity
@NoArgsConstructor(access = PROTECTED)
public class Member extends BaseTimeEntity {

    @Id
    private String id;

    private String password;

    private String nickName;

}