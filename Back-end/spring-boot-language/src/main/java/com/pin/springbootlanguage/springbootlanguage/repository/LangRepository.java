package com.pin.springbootlanguage.springbootlanguage.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.pin.springbootlanguage.springbootlanguage.models.Language;

@Repository
public interface LangRepository extends JpaRepository<Language, Long> {
}
