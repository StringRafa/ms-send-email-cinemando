package com.panambystudio.mssendemailcinemando.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.panambystudio.mssendemailcinemando.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {

}