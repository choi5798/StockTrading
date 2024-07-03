package com.stocktrading.member.domain;

import com.stocktrading.global.BaseTimeEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PROTECTED;

@Entity
@NoArgsConstructor(access = PROTECTED)
public class MemberStock extends BaseTimeEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String memberId;

    private String stockTicker;

    @Getter
    private boolean bookmarked;

    public MemberStock(String memberId, String stockTicker, boolean bookmarked) {
        this.memberId = memberId;
        this.stockTicker = stockTicker;
        this.bookmarked = bookmarked;
    }

    public MemberStock(Long id, String memberId, String stockTicker, boolean bookmarked) {
        this.id = id;
        this.memberId = memberId;
        this.stockTicker = stockTicker;
        this.bookmarked = bookmarked;
    }

    public MemberStock bookmark() {
        return new MemberStock(
                this.id,
                this.memberId,
                this.stockTicker,
                !this.bookmarked
        );
    }

}
