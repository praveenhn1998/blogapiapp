package com.demo.repository;

import com.demo.entity.Bonus;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BonusRepository extends JpaRepository<Bonus,Long> {
}
