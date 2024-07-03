package com.stocktrading.domain;

import com.stocktrading.global.BaseTimeEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

import java.util.UUID;

import static lombok.AccessLevel.PROTECTED;

@Entity
@NoArgsConstructor(access = PROTECTED)
public class News extends BaseTimeEntity {

    @Id
    @GeneratedValue
    private Long id;

    private UUID uuid;

    private String title;

    private String publisher;

    private String link;

}
