package com.stocktrading.member.repository;

import com.stocktrading.member.domain.MemberStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberStockRepository extends JpaRepository<MemberStock, Long> {

}
