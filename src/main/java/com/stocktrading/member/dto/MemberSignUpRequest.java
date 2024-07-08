package com.stocktrading.member.dto;

public record MemberSignUpRequest(
        String id,
        String password,
        String nickname
) {

}
