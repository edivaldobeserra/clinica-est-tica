package com.fatec.Clinica.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.fatec.Clinica.model.Atendimento;

@Repository
public interface AtendimentoRepository extends JpaRepositoryImplementation<Atendimento, Long> {

}