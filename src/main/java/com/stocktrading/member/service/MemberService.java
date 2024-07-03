package com.stocktrading.member.service;

import com.stocktrading.member.domain.Member;
import com.stocktrading.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public boolean login(String id, String password) {
        Member member = memberRepository.findByMemberId(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid username or password"));
        return member.login(password);
    }

    public boolean signUp(String id, String password, String nickName) {
        Member member = new Member(id, password, nickName);
        if (id.isBlank()) {
            throw new IllegalArgumentException("Invalid username or password");
        }
        memberRepository.save(member);
        return true;
    }

}
