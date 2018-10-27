package com.example.algamoneu.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoneu.api.model.Pessoa;


public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
