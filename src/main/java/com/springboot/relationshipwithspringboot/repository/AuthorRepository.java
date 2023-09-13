package com.springboot.relationshipwithspringboot.repository;

import com.springboot.relationshipwithspringboot.entity.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {
}
