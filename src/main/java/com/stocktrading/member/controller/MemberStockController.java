package com.stocktrading.member.controller;

import com.stocktrading.member.controller.dto.BookmarkRequest;
import com.stocktrading.member.service.MemberStockService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberStockController {

    private final MemberStockService memberStockService;

    public MemberStockController(MemberStockService memberStockService) {
        this.memberStockService = memberStockService;
    }

    @PostMapping("/{stockTicker}/bookmark")
    public void bookmark(@PathVariable String stockTicker, @RequestBody BookmarkRequest request) {
        memberStockService.bookmark(request.memberId(), stockTicker);
    }

}
