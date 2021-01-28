package com.mimobr.blogtwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mimobr.blogtwo.model.Content;

public interface ContentRepository extends JpaRepository<Content, Long>{	
	
}