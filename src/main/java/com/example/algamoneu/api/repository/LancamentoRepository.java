package com.example.algamoneu.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoneu.api.model.Lancamento;
import com.example.algamoneu.api.repository.lancamento.LancamentoRepositoryQuery;



public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
