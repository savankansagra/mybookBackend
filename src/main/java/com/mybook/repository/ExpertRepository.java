package com.mybook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mybook.models.Expert;

public interface ExpertRepository extends JpaRepository<Expert, Long> {

}
