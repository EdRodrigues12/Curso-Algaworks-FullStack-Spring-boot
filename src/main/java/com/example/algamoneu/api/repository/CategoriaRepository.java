package com.example.algamoneu.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoneu.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	

}
